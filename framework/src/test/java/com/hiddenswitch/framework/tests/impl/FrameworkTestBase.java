package com.hiddenswitch.framework.tests.impl;

import com.hiddenswitch.containers.*;
import com.hiddenswitch.framework.Client;
import com.hiddenswitch.framework.Environment;
import com.hiddenswitch.framework.Gateway;
import com.hiddenswitch.framework.rpc.ServerConfiguration;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.junit5.VertxExtension;
import io.vertx.junit5.VertxTestContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.ToxiproxyContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.lifecycle.Startables;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

import static org.testcontainers.Testcontainers.exposeHostPorts;

@ExtendWith({VertxExtension.class})
@Testcontainers
public class FrameworkTestBase {

	protected static final String PGDATABASE = "spellsource";
	protected static final String CLIENT_SECRET = "clientsecret";
	protected static final String CLIENT_ID = "spellsource";
	protected static final String PGUSER = "admin";
	protected static final String PGPASSWORD = "password";
	protected static final String PGHOST = "postgres";
	protected static final int PGPORT = 5432;

	protected static AtomicBoolean started = new AtomicBoolean(false);

	protected static RedisContainer redis = new RedisContainer()
			.withReuse(false);

	protected static PostgresSupabaseContainer postgres = new PostgresSupabaseContainer(PGUSER, PGPASSWORD, PGDATABASE)
			.withReuse(false)
			.withNetwork(Network.SHARED)
			.withNetworkAliases(PGHOST)
			.withExposedPorts(PGPORT);

	protected static KeycloakContainer keycloak = new KeycloakContainer("jboss/keycloak:11.0.3")
			.dependsOn(postgres)
			.withNetwork(Network.SHARED)
			.withPostgres(PGHOST, PGDATABASE, PGUSER, PGPASSWORD)
			.withReuse(false);

	protected static RealtimeContainer realtime = new RealtimeContainer("realtimesecret", 4000)
			.dependsOn(postgres)
			.withNetwork(Network.SHARED)
			.withEnv("DB_HOST", PGHOST)
			.withEnv("DB_NAME", PGDATABASE)
			.withEnv("DB_USER", PGUSER)
			.withEnv("DB_PASSWORD", PGPASSWORD)
			.withEnv("DB_PORT", Integer.toString(PGPORT))
			.withReuse(false);

	protected static ToxiproxyContainer toxiproxy = new ToxiproxyContainer("shopify/toxiproxy:2.1.4");

	private static ToxiproxyContainer.ContainerProxy toxicGrpcProxy;

	public static ToxiproxyContainer.ContainerProxy toxicGrpcProxy() {
		return toxicGrpcProxy;
	}

	@BeforeAll
	protected static void startContainers(Vertx vertx, VertxTestContext testContext) throws InterruptedException {
		var startup = Future.<Void>succeededFuture();

		if (started.compareAndSet(false, true)) {
			// Expose the default grpc port
			exposeHostPorts(Gateway.grpcPort());

			startup = Environment
					.executeBlocking(() -> Startables.deepStart(Stream.of(toxiproxy, redis, postgres, keycloak)).join())
					.compose(ignored -> {
						// Set the configuration (typed)
						var serverConfiguration = ServerConfiguration.newBuilder()
								.setPg(ServerConfiguration.PostgresConfiguration.newBuilder()
										.setPort(postgres.getMappedPort(PGPORT))
										.setHost(postgres.getHost())
										.setDatabase(PGDATABASE)
										.setUser(PGUSER)
										.setPassword(PGPASSWORD)
										.build())
								.setKeycloak(ServerConfiguration.KeycloakConfiguration.newBuilder()
										.setAuthUrl(keycloak.getAuthServerUrl())
										.setAdminUsername(keycloak.getAdminUsername())
										.setAdminPassword(keycloak.getAdminPassword())
										.setClientId(CLIENT_ID)
										.setClientSecret(CLIENT_SECRET)
										.setRealmDisplayName("Spellsource")
										.setRealmId("hiddenswitch")
										.build())
								.setGrpcConfiguration(ServerConfiguration.GrpcConfiguration.newBuilder()
										.setServerKeepAliveTimeMillis(400)
										.setServerKeepAliveTimeoutMillis(8000)
										.setServerPermitKeepAliveWithoutCalls(true)
										.build())
								.setMatchmaking(ServerConfiguration.MatchmakingConfiguration.newBuilder()
										.setMaxTicketsToProcess(100)
										.setScanFrequencyMillis(1200)
										.setEnqueueLockTimeoutMillis(400).build())
								.build();

						Environment.setConfiguration(serverConfiguration);
						return Future.succeededFuture();
					})
					.compose(ignored -> Environment.migrate())
					.compose(count -> {
						if (count < 4) {
							return Future.failedFuture(new RuntimeException(Integer.toString(count)));
						}
						return Future.succeededFuture(count);
					})
					.compose(ignored -> Environment.executeBlocking(() -> Startables.deepStart(Stream.of(realtime)).join()))
					.compose(ignored -> {
						// inject the realtime setup
						Environment.setConfiguration(ServerConfiguration.newBuilder()
								.setRealtime(ServerConfiguration.RealtimeConfiguration.newBuilder()
										.setUri(realtime.getRealtimeUrl()).build()).build());
						return Future.succeededFuture();
					}).compose(ignored -> Environment.executeBlocking(vertx, () -> toxiproxy.getProxy("host.testcontainers.internal", Gateway.grpcPort())))
					.onSuccess(containerProxy -> {
						toxicGrpcProxy = containerProxy;
					})
					.map((Void) null);
		}

		startup
				.compose(ignored -> {
					// Start the application
					var promise = Promise.<String>promise();
					vertx.deployVerticle(Gateway::new, new DeploymentOptions().setInstances(Runtime.getRuntime().availableProcessors() * 2), promise);
					return promise.future();
				})
				.onComplete(testContext.succeedingThenComplete());
	}
}

package com.hiddenswitch.spellsource;

import com.github.fromage.quasi.strands.Strand;
import com.github.fromage.quasi.strands.SuspendableAction1;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hiddenswitch.spellsource.concurrent.SuspendableLock;
import com.hiddenswitch.spellsource.concurrent.SuspendableQueue;
import com.hiddenswitch.spellsource.impl.SpellsourceTestBase;
import com.hiddenswitch.spellsource.util.Mongo;
import com.hiddenswitch.spellsource.util.UnityClient;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.spi.cluster.hazelcast.HazelcastClusterManager;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Stream;

import static com.hiddenswitch.spellsource.util.Sync.suspendableHandler;

public class ClusterTest extends SpellsourceTestBase {
	@Test
	public void testArrayQueueOverCluster(TestContext context) {
		Async latch = context.async(3);
		AtomicReference<Vertx> newVertx = new AtomicReference<>();
		HazelcastInstance instance = Hazelcast.newHazelcastInstance(Cluster.getConfig(5702));
		Vertx.clusteredVertx(new VertxOptions()
				.setClusterManager(new HazelcastClusterManager(instance))
				.setWorkerPoolSize(99)
				.setInternalBlockingPoolSize(99)
				.setBlockedThreadCheckInterval(30000L)
				.setWarningExceptionTime(30000L), context.asyncAssertSuccess(newVertxInstance -> {
			// Deploy a second gateway
			newVertx.set(newVertxInstance);
			Mongo.mongo().connectWithEnvironment(newVertxInstance);

			// Connect to existing cluster
			vertx.runOnContext(v1 -> {
				vertx.runOnContext(suspendableHandler((SuspendableAction1<Void>) v2 -> {
					SuspendableQueue<String> queue = SuspendableQueue.get("test-1000");
					queue.offer("ok");
					Strand.sleep(5000L);
					queue.offer("ok2");
					Strand.sleep(1000L);
					String ok3 = queue.take();
					context.assertEquals(ok3, "ok3");
					latch.countDown();
				}));
			});

			newVertxInstance.getOrCreateContext().runOnContext(v2 -> {
				newVertxInstance.runOnContext(suspendableHandler((SuspendableAction1<Void>) v3 -> {
					SuspendableQueue<String> queue = SuspendableQueue.get("test-1000");
					String ok = queue.take();
					context.assertEquals(ok, "ok");
					latch.countDown();
					String ok2 = queue.take();
					context.assertEquals(ok2, "ok2");
					latch.countDown();
					queue.offer("ok3");
				}));
			});
		}));

		latch.awaitSuccess();
		newVertx.get().close(context.asyncAssertSuccess(v1 -> {
			instance.shutdown();
		}));
	}

	@Test(timeout = 90000L)
	public void testMultiHostMultiClientCluster(TestContext context) {
		// Connect to existing cluster
		int count = 10;
		Async latch = context.async(count);
		AtomicReference<Vertx> newVertx = new AtomicReference<>();
		HazelcastInstance instance = Hazelcast.newHazelcastInstance(Cluster.getConfig(5702));
		Vertx.clusteredVertx(new VertxOptions()
				.setClusterManager(new HazelcastClusterManager(instance))
				.setBlockedThreadCheckInterval(30000L)
				.setWarningExceptionTime(30000L), context.asyncAssertSuccess(newVertxInstance -> {
			// Deploy a second gateway
			newVertx.set(newVertxInstance);
			Mongo.mongo().connectWithEnvironment(newVertxInstance);
			newVertxInstance.deployVerticle(Gateway.create(9090), context.asyncAssertSuccess(v2 -> {
				newVertxInstance.deployVerticle(Games.create(), context.asyncAssertSuccess(v3 -> {
					// Distribute clients to the two gateways
					Stream.generate(() -> Stream.of(8080, 9090)).flatMap(Function.identity())
							.map(port -> new Thread(() -> {
								UnityClient client = new UnityClient(context, port);
								client.createUserAccount();
								client.matchmakeConstructedPlay(null);
								client.waitUntilDone();
								context.assertTrue(client.isGameOver());
								client.disconnect();
								latch.countDown();
							})).limit(count).forEach(Thread::start);
				}));

			}));
		}));
		latch.awaitSuccess();
		newVertx.get().close(context.asyncAssertSuccess(v1 -> {
			instance.shutdown();
		}));
	}
}

package com.hiddenswitch.proto3.net.util;

import co.paralleluniverse.fibers.Suspendable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.EventBus;
import io.vertx.ext.sync.Sync;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static io.vertx.ext.sync.Sync.awaitFiber;

/**
 * This invocation handler provides the infrastructure for calling a service method in a synchronous or asynchronous
 * way.
 *
 * @param <T> The service to which this invocation handler makes calls.
 * @see InvocationHandler for more about proxies.
 * @see java.lang.reflect.Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler) for more about proxies.
 */
class VertxInvocationHandler<T> implements InvocationHandler, Serializable {
	NetworkedRpcClient<T> rpcClient;
	protected String name;
	EventBus eb;

	@Override
	@Suspendable
	@SuppressWarnings("unchecked")
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// Call default methods normally
		if (method.isDefault()) {
			// Invoked with the proxy instance, which shouldn't matter for anything that is a default method on an interface
			return method.invoke(proxy, args);
		}

		final boolean sync = rpcClient.sync;
		final Handler<AsyncResult<Object>> next = rpcClient.next;

		final String methodName = method.getName();

		rpcClient.next = null;
		rpcClient.sync = false;

		if (next == null
				&& !sync) {
			throw new RuntimeException();
		}

		if (eb == null) {
			throw new RuntimeException();
		}
		Object result = null;
		if (sync) {
			result = awaitFiber(done -> {
				call(methodName, args, done);
			});
		} else {
			call(methodName, args, next);
		}

		return result;
	}

	@Suspendable
	private void call(String methodName, Object[] args, Handler<AsyncResult<Object>> next) {
		Buffer result = Buffer.buffer(512);

		try {
			Serialization.serialize(args[0], new VertxBufferOutputStream(result));
		} catch (IOException e) {
			next.handle(Future.failedFuture(e));
			return;
		}

		eb.send(name + "::" + methodName, result, Sync.fiberHandler(new ReplyHandler(next)));
	}

}

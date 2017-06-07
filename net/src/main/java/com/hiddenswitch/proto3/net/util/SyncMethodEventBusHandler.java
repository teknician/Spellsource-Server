package com.hiddenswitch.proto3.net.util;

import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.Message;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.IOException;

/**
 * Created by bberman on 6/7/17.
 */
class SyncMethodEventBusHandler<T, R> implements Handler<Message<Buffer>> {
	private final SuspendableFunction<T, R> method;

	public SyncMethodEventBusHandler(SuspendableFunction<T, R> method) {
		this.method = method;
	}

	@Override
	@Suspendable
	public void handle(Message<Buffer> message) {
		VertxBufferInputStream inputStream = new VertxBufferInputStream(message.body());
		T request = null;
		try {
			request = Serialization.deserialize(inputStream);
		} catch (IOException | ClassNotFoundException e) {
			message.fail(1, e.getMessage());
			return;
		}

		R response = null;

		try {
			response = method.apply(request);
		} catch (InterruptedException | SuspendExecution e) {
			e.printStackTrace();
		} catch (Throwable e) {
			message.fail(-1, getMessage(e));
		}

		if (response == null) {
			message.fail(1, new NullPointerException().getMessage());
			return;
		}

		Buffer reply = Buffer.buffer(512);

		try {
			Serialization.serialize(response, new VertxBufferOutputStream(reply));
		} catch (IOException e) {
			message.fail(1, e.getMessage());
			return;
		}

		message.reply(reply);
	}

	private static String getMessage(Throwable e) {
		StringBuilder sb = new StringBuilder();
		sb.append("\nMessage Reply Error\n");
		sb.append(ExceptionUtils.getMessage(e));
		sb.append("\nStart API Stack Trace\n");
		sb.append(ExceptionUtils.getStackTrace(e));
		sb.append("\nEnd API Stack Trace\nStart Caller Error");
		return sb.toString();
	}
}

package com.hiddenswitch.spellsource.models;

import com.hiddenswitch.spellsource.Games;
import com.hiddenswitch.spellsource.impl.server.PregamePlayerConfiguration;
import net.demilich.metastone.game.spells.trigger.Trigger;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public final class CreateGameSessionRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private String gameId;
	private PregamePlayerConfiguration pregame1;
	private PregamePlayerConfiguration pregame2;
	private Trigger customTriggers;
	private long noActivityTimeout = Games.getDefaultNoActivityTimeout();

	public CreateGameSessionRequest() {
	}

	public PregamePlayerConfiguration getPregame1() {
		return pregame1;
	}

	public void setPregame1(PregamePlayerConfiguration pregame1) {
		this.pregame1 = pregame1;
	}

	public PregamePlayerConfiguration getPregame2() {
		return pregame2;
	}

	public void setPregame2(PregamePlayerConfiguration pregame2) {
		this.pregame2 = pregame2;
	}

	public CreateGameSessionRequest withPregame1(PregamePlayerConfiguration pregame1) {
		setPregame1(pregame1);
		return this;
	}

	public CreateGameSessionRequest withPregame2(PregamePlayerConfiguration pregame2) {
		setPregame2(pregame2);
		return this;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	/**
	 * Gets how many milliseconds to wait for activity before shutting down this game session.
	 *
	 * @return Milliseconds
	 */
	public long getNoActivityTimeout() {
		return noActivityTimeout;
	}

	/**
	 * Sets the number of milliseconds to wait for activity before shutting down this game session.
	 *
	 * @param noActivityTimeout Milliseconds
	 */
	public void setNoActivityTimeout(long noActivityTimeout) {
		this.noActivityTimeout = noActivityTimeout;
	}

	/**
	 * Sets the number of milliseconds to wait for activity before shutting down this game session.
	 *
	 * @param noActivityTimeout Milliseconds
	 * @return The request
	 */
	public CreateGameSessionRequest withNoActivityTimeout(long noActivityTimeout) {
		setNoActivityTimeout(noActivityTimeout);
		return this;
	}

	public CreateGameSessionRequest withGameId(String gameId) {
		setGameId(gameId);
		return this;
	}

	public Trigger getCustomTriggers() {
		return customTriggers;
	}

	public void setCustomTriggers(Trigger customTriggers) {
		this.customTriggers = customTriggers;
	}

	public CreateGameSessionRequest withCustomTriggers(final Trigger customTriggers) {
		this.customTriggers = customTriggers;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("gameId", gameId)
				.append("pregame1", pregame1)
				.append("pregame2", pregame2)
				.append("customTrigger", customTriggers)
				.toString();
	}
}

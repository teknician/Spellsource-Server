/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IMatchmakingQueues extends VertxPojo, Serializable {

    /**
     * Setter for <code>spellsource.matchmaking_queues.id</code>.
     */
    public IMatchmakingQueues setId(String value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>spellsource.matchmaking_queues.name</code>.
     */
    public IMatchmakingQueues setName(String value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>spellsource.matchmaking_queues.bot_opponent</code>.
     */
    public IMatchmakingQueues setBotOpponent(Boolean value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.bot_opponent</code>.
     */
    public Boolean getBotOpponent();

    /**
     * Setter for <code>spellsource.matchmaking_queues.private_lobby</code>.
     */
    public IMatchmakingQueues setPrivateLobby(Boolean value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.private_lobby</code>.
     */
    public Boolean getPrivateLobby();

    /**
     * Setter for <code>spellsource.matchmaking_queues.starts_automatically</code>.
     */
    public IMatchmakingQueues setStartsAutomatically(Boolean value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.starts_automatically</code>.
     */
    public Boolean getStartsAutomatically();

    /**
     * Setter for <code>spellsource.matchmaking_queues.still_connected_timeout</code>.
     */
    public IMatchmakingQueues setStillConnectedTimeout(Long value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.still_connected_timeout</code>.
     */
    public Long getStillConnectedTimeout();

    /**
     * Setter for <code>spellsource.matchmaking_queues.empty_lobby_timeout</code>.
     */
    public IMatchmakingQueues setEmptyLobbyTimeout(Long value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.empty_lobby_timeout</code>.
     */
    public Long getEmptyLobbyTimeout();

    /**
     * Setter for <code>spellsource.matchmaking_queues.awaiting_lobby_timeout</code>.
     */
    public IMatchmakingQueues setAwaitingLobbyTimeout(Long value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.awaiting_lobby_timeout</code>.
     */
    public Long getAwaitingLobbyTimeout();

    /**
     * Setter for <code>spellsource.matchmaking_queues.once</code>.
     */
    public IMatchmakingQueues setOnce(Boolean value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.once</code>.
     */
    public Boolean getOnce();

    /**
     * Setter for <code>spellsource.matchmaking_queues.automatically_close</code>.
     */
    public IMatchmakingQueues setAutomaticallyClose(Boolean value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.automatically_close</code>.
     */
    public Boolean getAutomaticallyClose();

    /**
     * Setter for <code>spellsource.matchmaking_queues.max_tickets_to_process</code>.
     */
    public IMatchmakingQueues setMaxTicketsToProcess(Integer value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.max_tickets_to_process</code>.
     */
    public Integer getMaxTicketsToProcess();

    /**
     * Setter for <code>spellsource.matchmaking_queues.scan_frequency</code>.
     */
    public IMatchmakingQueues setScanFrequency(Long value);

    /**
     * Getter for <code>spellsource.matchmaking_queues.scan_frequency</code>.
     */
    public Long getScanFrequency();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IMatchmakingQueues
     */
    public void from(IMatchmakingQueues from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IMatchmakingQueues
     */
    public <E extends IMatchmakingQueues> E into(E into);

    @Override
    public default IMatchmakingQueues fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        try {
            setBotOpponent(json.getBoolean("bot_opponent"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("bot_opponent","java.lang.Boolean",e);
        }
        try {
            setPrivateLobby(json.getBoolean("private_lobby"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("private_lobby","java.lang.Boolean",e);
        }
        try {
            setStartsAutomatically(json.getBoolean("starts_automatically"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("starts_automatically","java.lang.Boolean",e);
        }
        try {
            setStillConnectedTimeout(json.getLong("still_connected_timeout"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("still_connected_timeout","java.lang.Long",e);
        }
        try {
            setEmptyLobbyTimeout(json.getLong("empty_lobby_timeout"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("empty_lobby_timeout","java.lang.Long",e);
        }
        try {
            setAwaitingLobbyTimeout(json.getLong("awaiting_lobby_timeout"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("awaiting_lobby_timeout","java.lang.Long",e);
        }
        try {
            setOnce(json.getBoolean("once"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("once","java.lang.Boolean",e);
        }
        try {
            setAutomaticallyClose(json.getBoolean("automatically_close"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("automatically_close","java.lang.Boolean",e);
        }
        try {
            setMaxTicketsToProcess(json.getInteger("max_tickets_to_process"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("max_tickets_to_process","java.lang.Integer",e);
        }
        try {
            setScanFrequency(json.getLong("scan_frequency"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("scan_frequency","java.lang.Long",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("name",getName());
        json.put("bot_opponent",getBotOpponent());
        json.put("private_lobby",getPrivateLobby());
        json.put("starts_automatically",getStartsAutomatically());
        json.put("still_connected_timeout",getStillConnectedTimeout());
        json.put("empty_lobby_timeout",getEmptyLobbyTimeout());
        json.put("awaiting_lobby_timeout",getAwaitingLobbyTimeout());
        json.put("once",getOnce());
        json.put("automatically_close",getAutomaticallyClose());
        json.put("max_tickets_to_process",getMaxTicketsToProcess());
        json.put("scan_frequency",getScanFrequency());
        return json;
    }

}

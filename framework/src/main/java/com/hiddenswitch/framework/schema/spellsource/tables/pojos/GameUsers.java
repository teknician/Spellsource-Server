/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.pojos;


import com.hiddenswitch.framework.schema.spellsource.tables.interfaces.IGameUsers;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameUsers implements VertxPojo, IGameUsers {

    private static final long serialVersionUID = 1895011262;

    private Long   id;
    private Short  playerIndex;
    private Long   gameId;
    private String userId;

    public GameUsers() {}

    public GameUsers(IGameUsers value) {
        this.id = value.getId();
        this.playerIndex = value.getPlayerIndex();
        this.gameId = value.getGameId();
        this.userId = value.getUserId();
    }

    public GameUsers(
        Long   id,
        Short  playerIndex,
        Long   gameId,
        String userId
    ) {
        this.id = id;
        this.playerIndex = playerIndex;
        this.gameId = gameId;
        this.userId = userId;
    }

    public GameUsers(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public GameUsers setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public Short getPlayerIndex() {
        return this.playerIndex;
    }

    @Override
    public GameUsers setPlayerIndex(Short playerIndex) {
        this.playerIndex = playerIndex;
        return this;
    }

    @Override
    public Long getGameId() {
        return this.gameId;
    }

    @Override
    public GameUsers setGameId(Long gameId) {
        this.gameId = gameId;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public GameUsers setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GameUsers (");

        sb.append(id);
        sb.append(", ").append(playerIndex);
        sb.append(", ").append(gameId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IGameUsers from) {
        setId(from.getId());
        setPlayerIndex(from.getPlayerIndex());
        setGameId(from.getGameId());
        setUserId(from.getUserId());
    }

    @Override
    public <E extends IGameUsers> E into(E into) {
        into.from(this);
        return into;
    }
}

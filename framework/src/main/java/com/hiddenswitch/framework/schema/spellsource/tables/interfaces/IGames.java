/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.interfaces;


import com.hiddenswitch.framework.schema.spellsource.enums.GameStateEnum;

import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import org.jooq.JSONB;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IGames extends VertxPojo, Serializable {

    /**
     * Setter for <code>spellsource.games.id</code>.
     */
    public IGames setId(Long value);

    /**
     * Getter for <code>spellsource.games.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>spellsource.games.status</code>.
     */
    public IGames setStatus(GameStateEnum value);

    /**
     * Getter for <code>spellsource.games.status</code>.
     */
    public GameStateEnum getStatus();

    /**
     * Setter for <code>spellsource.games.git_hash</code>.
     */
    public IGames setGitHash(String value);

    /**
     * Getter for <code>spellsource.games.git_hash</code>.
     */
    public String getGitHash();

    /**
     * Setter for <code>spellsource.games.trace</code>.
     */
    public IGames setTrace(JSONB value);

    /**
     * Getter for <code>spellsource.games.trace</code>.
     */
    public JSONB getTrace();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IGames
     */
    public void from(IGames from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IGames
     */
    public <E extends IGames> E into(E into);

    @Override
    public default IGames fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getLong("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.Long",e);
        }
        try {
            setStatus(java.util.Arrays.stream(com.hiddenswitch.framework.schema.spellsource.enums.GameStateEnum.values()).filter(td -> td.getLiteral().equals(json.getString("status"))).findFirst().orElse(null));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("status","com.hiddenswitch.framework.schema.spellsource.enums.GameStateEnum",e);
        }
        try {
            setGitHash(json.getString("git_hash"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("git_hash","java.lang.String",e);
        }
        try {
            // Omitting unrecognized type org.jooq.JSONB for column trace!
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("trace","org.jooq.JSONB",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("status",getStatus()==null?null:getStatus().getLiteral());
        json.put("git_hash",getGitHash());
        // Omitting unrecognized type org.jooq.JSONB for column trace!
        return json;
    }

}

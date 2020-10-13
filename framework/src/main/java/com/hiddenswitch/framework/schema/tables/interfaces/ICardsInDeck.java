/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ICardsInDeck extends VertxPojo, Serializable {

    /**
     * Setter for <code>spellsource.cards_in_deck.id</code>.
     */
    public ICardsInDeck setId(Long value);

    /**
     * Getter for <code>spellsource.cards_in_deck.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>spellsource.cards_in_deck.deck_id</code>. deleting a deck deletes all its card references
     */
    public ICardsInDeck setDeckId(Long value);

    /**
     * Getter for <code>spellsource.cards_in_deck.deck_id</code>. deleting a deck deletes all its card references
     */
    public Long getDeckId();

    /**
     * Setter for <code>spellsource.cards_in_deck.card_id</code>. cannot delete cards that are currently used in decks
     */
    public ICardsInDeck setCardId(String value);

    /**
     * Getter for <code>spellsource.cards_in_deck.card_id</code>. cannot delete cards that are currently used in decks
     */
    public String getCardId();

    /**
     * Setter for <code>spellsource.cards_in_deck.version</code>.
     */
    public ICardsInDeck setVersion(Long value);

    /**
     * Getter for <code>spellsource.cards_in_deck.version</code>.
     */
    public Long getVersion();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ICardsInDeck
     */
    public void from(ICardsInDeck from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ICardsInDeck
     */
    public <E extends ICardsInDeck> E into(E into);

    @Override
    public default ICardsInDeck fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getLong("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.Long",e);
        }
        try {
            setDeckId(json.getLong("deck_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("deck_id","java.lang.Long",e);
        }
        try {
            setCardId(json.getString("card_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("card_id","java.lang.String",e);
        }
        try {
            setVersion(json.getLong("version"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("version","java.lang.Long",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("deck_id",getDeckId());
        json.put("card_id",getCardId());
        json.put("version",getVersion());
        return json;
    }

}

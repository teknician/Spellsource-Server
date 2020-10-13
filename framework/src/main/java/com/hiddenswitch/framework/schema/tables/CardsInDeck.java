/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables;


import com.hiddenswitch.framework.schema.Keys;
import com.hiddenswitch.framework.schema.Spellsource;
import com.hiddenswitch.framework.schema.tables.records.CardsInDeckRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CardsInDeck extends TableImpl<CardsInDeckRecord> {

    private static final long serialVersionUID = -2128809264;

    /**
     * The reference instance of <code>spellsource.cards_in_deck</code>
     */
    public static final CardsInDeck CARDS_IN_DECK = new CardsInDeck();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CardsInDeckRecord> getRecordType() {
        return CardsInDeckRecord.class;
    }

    /**
     * The column <code>spellsource.cards_in_deck.id</code>.
     */
    public final TableField<CardsInDeckRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>spellsource.cards_in_deck.deck_id</code>. deleting a deck deletes all its card references
     */
    public final TableField<CardsInDeckRecord, Long> DECK_ID = createField(DSL.name("deck_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "deleting a deck deletes all its card references");

    /**
     * The column <code>spellsource.cards_in_deck.card_id</code>. cannot delete cards that are currently used in decks
     */
    public final TableField<CardsInDeckRecord, String> CARD_ID = createField(DSL.name("card_id"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "cannot delete cards that are currently used in decks");

    /**
     * The column <code>spellsource.cards_in_deck.version</code>.
     */
    public final TableField<CardsInDeckRecord, Long> VERSION = createField(DSL.name("version"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>spellsource.cards_in_deck</code> table reference
     */
    public CardsInDeck() {
        this(DSL.name("cards_in_deck"), null);
    }

    /**
     * Create an aliased <code>spellsource.cards_in_deck</code> table reference
     */
    public CardsInDeck(String alias) {
        this(DSL.name(alias), CARDS_IN_DECK);
    }

    /**
     * Create an aliased <code>spellsource.cards_in_deck</code> table reference
     */
    public CardsInDeck(Name alias) {
        this(alias, CARDS_IN_DECK);
    }

    private CardsInDeck(Name alias, Table<CardsInDeckRecord> aliased) {
        this(alias, aliased, null);
    }

    private CardsInDeck(Name alias, Table<CardsInDeckRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CardsInDeck(Table<O> child, ForeignKey<O, CardsInDeckRecord> key) {
        super(child, key, CARDS_IN_DECK);
    }

    @Override
    public Schema getSchema() {
        return Spellsource.SPELLSOURCE;
    }

    @Override
    public Identity<CardsInDeckRecord, Long> getIdentity() {
        return Keys.IDENTITY_CARDS_IN_DECK;
    }

    @Override
    public UniqueKey<CardsInDeckRecord> getPrimaryKey() {
        return Keys.CARDS_IN_DECK_PKEY;
    }

    @Override
    public List<UniqueKey<CardsInDeckRecord>> getKeys() {
        return Arrays.<UniqueKey<CardsInDeckRecord>>asList(Keys.CARDS_IN_DECK_PKEY);
    }

    @Override
    public List<ForeignKey<CardsInDeckRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CardsInDeckRecord, ?>>asList(Keys.CARDS_IN_DECK__CARDS_IN_DECK_DECK_ID_FKEY, Keys.CARDS_IN_DECK__CARDS_IN_DECK_CARD_ID_VERSION_FKEY);
    }

    public Decks decks() {
        return new Decks(this, Keys.CARDS_IN_DECK__CARDS_IN_DECK_DECK_ID_FKEY);
    }

    public Cards cards() {
        return new Cards(this, Keys.CARDS_IN_DECK__CARDS_IN_DECK_CARD_ID_VERSION_FKEY);
    }

    @Override
    public CardsInDeck as(String alias) {
        return new CardsInDeck(DSL.name(alias), this);
    }

    @Override
    public CardsInDeck as(Name alias) {
        return new CardsInDeck(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CardsInDeck rename(String name) {
        return new CardsInDeck(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CardsInDeck rename(Name name) {
        return new CardsInDeck(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}

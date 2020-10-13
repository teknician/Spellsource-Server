/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema;


import com.hiddenswitch.framework.schema.tables.CardDesc;
import com.hiddenswitch.framework.schema.tables.Cards;
import com.hiddenswitch.framework.schema.tables.CardsInDeck;
import com.hiddenswitch.framework.schema.tables.Decks;
import com.hiddenswitch.framework.schema.tables.records.CardDescRecord;
import com.hiddenswitch.framework.schema.tables.records.CardsInDeckRecord;
import com.hiddenswitch.framework.schema.tables.records.CardsRecord;
import com.hiddenswitch.framework.schema.tables.records.DecksRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>spellsource</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CardDescRecord, Long> IDENTITY_CARD_DESC = Identities0.IDENTITY_CARD_DESC;
    public static final Identity<CardsRecord, Long> IDENTITY_CARDS = Identities0.IDENTITY_CARDS;
    public static final Identity<CardsInDeckRecord, Long> IDENTITY_CARDS_IN_DECK = Identities0.IDENTITY_CARDS_IN_DECK;
    public static final Identity<DecksRecord, Long> IDENTITY_DECKS = Identities0.IDENTITY_DECKS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CardDescRecord> CARD_DESC_PKEY = UniqueKeys0.CARD_DESC_PKEY;
    public static final UniqueKey<CardsRecord> CARDS_PKEY = UniqueKeys0.CARDS_PKEY;
    public static final UniqueKey<CardsInDeckRecord> CARDS_IN_DECK_PKEY = UniqueKeys0.CARDS_IN_DECK_PKEY;
    public static final UniqueKey<DecksRecord> DECKS_PKEY = UniqueKeys0.DECKS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CardsRecord, CardDescRecord> CARDS__CARDS_CARD_DESC_FKEY = ForeignKeys0.CARDS__CARDS_CARD_DESC_FKEY;
    public static final ForeignKey<CardsInDeckRecord, DecksRecord> CARDS_IN_DECK__CARDS_IN_DECK_DECK_ID_FKEY = ForeignKeys0.CARDS_IN_DECK__CARDS_IN_DECK_DECK_ID_FKEY;
    public static final ForeignKey<CardsInDeckRecord, CardsRecord> CARDS_IN_DECK__CARDS_IN_DECK_CARD_ID_VERSION_FKEY = ForeignKeys0.CARDS_IN_DECK__CARDS_IN_DECK_CARD_ID_VERSION_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CardDescRecord, Long> IDENTITY_CARD_DESC = Internal.createIdentity(CardDesc.CARD_DESC, CardDesc.CARD_DESC.ID);
        public static Identity<CardsRecord, Long> IDENTITY_CARDS = Internal.createIdentity(Cards.CARDS, Cards.CARDS.ID);
        public static Identity<CardsInDeckRecord, Long> IDENTITY_CARDS_IN_DECK = Internal.createIdentity(CardsInDeck.CARDS_IN_DECK, CardsInDeck.CARDS_IN_DECK.ID);
        public static Identity<DecksRecord, Long> IDENTITY_DECKS = Internal.createIdentity(Decks.DECKS, Decks.DECKS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CardDescRecord> CARD_DESC_PKEY = Internal.createUniqueKey(CardDesc.CARD_DESC, "card_desc_pkey", new TableField[] { CardDesc.CARD_DESC.ID }, true);
        public static final UniqueKey<CardsRecord> CARDS_PKEY = Internal.createUniqueKey(Cards.CARDS, "cards_pkey", new TableField[] { Cards.CARDS.CARD_ID, Cards.CARDS.ID }, true);
        public static final UniqueKey<CardsInDeckRecord> CARDS_IN_DECK_PKEY = Internal.createUniqueKey(CardsInDeck.CARDS_IN_DECK, "cards_in_deck_pkey", new TableField[] { CardsInDeck.CARDS_IN_DECK.ID }, true);
        public static final UniqueKey<DecksRecord> DECKS_PKEY = Internal.createUniqueKey(Decks.DECKS, "decks_pkey", new TableField[] { Decks.DECKS.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<CardsRecord, CardDescRecord> CARDS__CARDS_CARD_DESC_FKEY = Internal.createForeignKey(Keys.CARD_DESC_PKEY, Cards.CARDS, "cards_card_desc_fkey", new TableField[] { Cards.CARDS.CARD_DESC }, true);
        public static final ForeignKey<CardsInDeckRecord, DecksRecord> CARDS_IN_DECK__CARDS_IN_DECK_DECK_ID_FKEY = Internal.createForeignKey(Keys.DECKS_PKEY, CardsInDeck.CARDS_IN_DECK, "cards_in_deck_deck_id_fkey", new TableField[] { CardsInDeck.CARDS_IN_DECK.DECK_ID }, true);
        public static final ForeignKey<CardsInDeckRecord, CardsRecord> CARDS_IN_DECK__CARDS_IN_DECK_CARD_ID_VERSION_FKEY = Internal.createForeignKey(Keys.CARDS_PKEY, CardsInDeck.CARDS_IN_DECK, "cards_in_deck_card_id_version_fkey", new TableField[] { CardsInDeck.CARDS_IN_DECK.CARD_ID, CardsInDeck.CARDS_IN_DECK.VERSION }, true);
    }
}

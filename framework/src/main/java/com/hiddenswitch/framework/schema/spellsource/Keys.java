/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource;


import com.hiddenswitch.framework.schema.keycloak.tables.records.UserEntityRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.BotUsers;
import com.hiddenswitch.framework.schema.spellsource.tables.Cards;
import com.hiddenswitch.framework.schema.spellsource.tables.CardsInDeck;
import com.hiddenswitch.framework.schema.spellsource.tables.DeckPlayerAttributeTuples;
import com.hiddenswitch.framework.schema.spellsource.tables.DeckShares;
import com.hiddenswitch.framework.schema.spellsource.tables.Decks;
import com.hiddenswitch.framework.schema.spellsource.tables.Friends;
import com.hiddenswitch.framework.schema.spellsource.tables.GameUsers;
import com.hiddenswitch.framework.schema.spellsource.tables.Games;
import com.hiddenswitch.framework.schema.spellsource.tables.MatchmakingQueues;
import com.hiddenswitch.framework.schema.spellsource.tables.MatchmakingTickets;
import com.hiddenswitch.framework.schema.spellsource.tables.UserEntityAddons;
import com.hiddenswitch.framework.schema.spellsource.tables.records.BotUsersRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.CardsInDeckRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.CardsRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.DeckPlayerAttributeTuplesRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.DeckSharesRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.DecksRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.FriendsRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.GameUsersRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.GamesRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.MatchmakingQueuesRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.MatchmakingTicketsRecord;
import com.hiddenswitch.framework.schema.spellsource.tables.records.UserEntityAddonsRecord;

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

    public static final Identity<CardsInDeckRecord, Long> IDENTITY_CARDS_IN_DECK = Identities0.IDENTITY_CARDS_IN_DECK;
    public static final Identity<DeckPlayerAttributeTuplesRecord, Long> IDENTITY_DECK_PLAYER_ATTRIBUTE_TUPLES = Identities0.IDENTITY_DECK_PLAYER_ATTRIBUTE_TUPLES;
    public static final Identity<DeckSharesRecord, Long> IDENTITY_DECK_SHARES = Identities0.IDENTITY_DECK_SHARES;
    public static final Identity<GamesRecord, Long> IDENTITY_GAMES = Identities0.IDENTITY_GAMES;
    public static final Identity<MatchmakingTicketsRecord, Long> IDENTITY_MATCHMAKING_TICKETS = Identities0.IDENTITY_MATCHMAKING_TICKETS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BotUsersRecord> BOT_USERS_PKEY = UniqueKeys0.BOT_USERS_PKEY;
    public static final UniqueKey<CardsRecord> CARDS_PKEY = UniqueKeys0.CARDS_PKEY;
    public static final UniqueKey<CardsInDeckRecord> CARDS_IN_DECK_PKEY = UniqueKeys0.CARDS_IN_DECK_PKEY;
    public static final UniqueKey<DeckPlayerAttributeTuplesRecord> DECK_PLAYER_ATTRIBUTE_TUPLES_PKEY = UniqueKeys0.DECK_PLAYER_ATTRIBUTE_TUPLES_PKEY;
    public static final UniqueKey<DeckSharesRecord> DECK_SHARES_PKEY = UniqueKeys0.DECK_SHARES_PKEY;
    public static final UniqueKey<DeckSharesRecord> DECK_SHARES_DECK_ID_SHARE_RECIPIENT_ID_KEY = UniqueKeys0.DECK_SHARES_DECK_ID_SHARE_RECIPIENT_ID_KEY;
    public static final UniqueKey<DecksRecord> DECKS_PKEY = UniqueKeys0.DECKS_PKEY;
    public static final UniqueKey<FriendsRecord> FRIENDS_PKEY = UniqueKeys0.FRIENDS_PKEY;
    public static final UniqueKey<GameUsersRecord> GAME_USERS_PKEY = UniqueKeys0.GAME_USERS_PKEY;
    public static final UniqueKey<GamesRecord> GAMES_PKEY = UniqueKeys0.GAMES_PKEY;
    public static final UniqueKey<MatchmakingQueuesRecord> MATCHMAKING_QUEUES_PKEY = UniqueKeys0.MATCHMAKING_QUEUES_PKEY;
    public static final UniqueKey<MatchmakingTicketsRecord> MATCHMAKING_TICKETS_PKEY = UniqueKeys0.MATCHMAKING_TICKETS_PKEY;
    public static final UniqueKey<UserEntityAddonsRecord> USER_ENTITY_ADDONS_PKEY = UniqueKeys0.USER_ENTITY_ADDONS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BotUsersRecord, UserEntityRecord> BOT_USERS__BOT_USERS_ID_FKEY = ForeignKeys0.BOT_USERS__BOT_USERS_ID_FKEY;
    public static final ForeignKey<CardsRecord, UserEntityRecord> CARDS__CARDS_CREATED_BY_FKEY = ForeignKeys0.CARDS__CARDS_CREATED_BY_FKEY;
    public static final ForeignKey<CardsInDeckRecord, DecksRecord> CARDS_IN_DECK__CARDS_IN_DECK_DECK_ID_FKEY = ForeignKeys0.CARDS_IN_DECK__CARDS_IN_DECK_DECK_ID_FKEY;
    public static final ForeignKey<CardsInDeckRecord, CardsRecord> CARDS_IN_DECK__CARDS_IN_DECK_CARD_ID_FKEY = ForeignKeys0.CARDS_IN_DECK__CARDS_IN_DECK_CARD_ID_FKEY;
    public static final ForeignKey<DeckPlayerAttributeTuplesRecord, DecksRecord> DECK_PLAYER_ATTRIBUTE_TUPLES__DECK_PLAYER_ATTRIBUTE_TUPLES_DECK_ID_FKEY = ForeignKeys0.DECK_PLAYER_ATTRIBUTE_TUPLES__DECK_PLAYER_ATTRIBUTE_TUPLES_DECK_ID_FKEY;
    public static final ForeignKey<DeckSharesRecord, DecksRecord> DECK_SHARES__DECK_SHARES_DECK_ID_FKEY = ForeignKeys0.DECK_SHARES__DECK_SHARES_DECK_ID_FKEY;
    public static final ForeignKey<DeckSharesRecord, UserEntityRecord> DECK_SHARES__DECK_SHARES_SHARE_RECIPIENT_ID_FKEY = ForeignKeys0.DECK_SHARES__DECK_SHARES_SHARE_RECIPIENT_ID_FKEY;
    public static final ForeignKey<DecksRecord, UserEntityRecord> DECKS__DECKS_CREATED_BY_FKEY = ForeignKeys0.DECKS__DECKS_CREATED_BY_FKEY;
    public static final ForeignKey<DecksRecord, UserEntityRecord> DECKS__DECKS_LAST_EDITED_BY_FKEY = ForeignKeys0.DECKS__DECKS_LAST_EDITED_BY_FKEY;
    public static final ForeignKey<FriendsRecord, UserEntityRecord> FRIENDS__FRIENDS_ID_FKEY = ForeignKeys0.FRIENDS__FRIENDS_ID_FKEY;
    public static final ForeignKey<FriendsRecord, UserEntityRecord> FRIENDS__FRIENDS_FRIEND_FKEY = ForeignKeys0.FRIENDS__FRIENDS_FRIEND_FKEY;
    public static final ForeignKey<GameUsersRecord, GamesRecord> GAME_USERS__GAME_USERS_GAME_ID_FKEY = ForeignKeys0.GAME_USERS__GAME_USERS_GAME_ID_FKEY;
    public static final ForeignKey<GameUsersRecord, UserEntityRecord> GAME_USERS__GAME_USERS_USER_ID_FKEY = ForeignKeys0.GAME_USERS__GAME_USERS_USER_ID_FKEY;
    public static final ForeignKey<GameUsersRecord, DecksRecord> GAME_USERS__GAME_USERS_DECK_ID_FKEY = ForeignKeys0.GAME_USERS__GAME_USERS_DECK_ID_FKEY;
    public static final ForeignKey<MatchmakingTicketsRecord, MatchmakingQueuesRecord> MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_QUEUE_ID_FKEY = ForeignKeys0.MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_QUEUE_ID_FKEY;
    public static final ForeignKey<MatchmakingTicketsRecord, UserEntityRecord> MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_USER_ID_FKEY = ForeignKeys0.MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_USER_ID_FKEY;
    public static final ForeignKey<MatchmakingTicketsRecord, DecksRecord> MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_DECK_ID_FKEY = ForeignKeys0.MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_DECK_ID_FKEY;
    public static final ForeignKey<MatchmakingTicketsRecord, DecksRecord> MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_BOT_DECK_ID_FKEY = ForeignKeys0.MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_BOT_DECK_ID_FKEY;
    public static final ForeignKey<UserEntityAddonsRecord, UserEntityRecord> USER_ENTITY_ADDONS__USER_ENTITY_ADDONS_ID_FKEY = ForeignKeys0.USER_ENTITY_ADDONS__USER_ENTITY_ADDONS_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CardsInDeckRecord, Long> IDENTITY_CARDS_IN_DECK = Internal.createIdentity(CardsInDeck.CARDS_IN_DECK, CardsInDeck.CARDS_IN_DECK.ID);
        public static Identity<DeckPlayerAttributeTuplesRecord, Long> IDENTITY_DECK_PLAYER_ATTRIBUTE_TUPLES = Internal.createIdentity(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES, DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.ID);
        public static Identity<DeckSharesRecord, Long> IDENTITY_DECK_SHARES = Internal.createIdentity(DeckShares.DECK_SHARES, DeckShares.DECK_SHARES.ID);
        public static Identity<GamesRecord, Long> IDENTITY_GAMES = Internal.createIdentity(Games.GAMES, Games.GAMES.ID);
        public static Identity<MatchmakingTicketsRecord, Long> IDENTITY_MATCHMAKING_TICKETS = Internal.createIdentity(MatchmakingTickets.MATCHMAKING_TICKETS, MatchmakingTickets.MATCHMAKING_TICKETS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BotUsersRecord> BOT_USERS_PKEY = Internal.createUniqueKey(BotUsers.BOT_USERS, "bot_users_pkey", new TableField[] { BotUsers.BOT_USERS.ID }, true);
        public static final UniqueKey<CardsRecord> CARDS_PKEY = Internal.createUniqueKey(Cards.CARDS, "cards_pkey", new TableField[] { Cards.CARDS.ID }, true);
        public static final UniqueKey<CardsInDeckRecord> CARDS_IN_DECK_PKEY = Internal.createUniqueKey(CardsInDeck.CARDS_IN_DECK, "cards_in_deck_pkey", new TableField[] { CardsInDeck.CARDS_IN_DECK.ID }, true);
        public static final UniqueKey<DeckPlayerAttributeTuplesRecord> DECK_PLAYER_ATTRIBUTE_TUPLES_PKEY = Internal.createUniqueKey(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES, "deck_player_attribute_tuples_pkey", new TableField[] { DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.ID }, true);
        public static final UniqueKey<DeckSharesRecord> DECK_SHARES_PKEY = Internal.createUniqueKey(DeckShares.DECK_SHARES, "deck_shares_pkey", new TableField[] { DeckShares.DECK_SHARES.ID }, true);
        public static final UniqueKey<DeckSharesRecord> DECK_SHARES_DECK_ID_SHARE_RECIPIENT_ID_KEY = Internal.createUniqueKey(DeckShares.DECK_SHARES, "deck_shares_deck_id_share_recipient_id_key", new TableField[] { DeckShares.DECK_SHARES.DECK_ID, DeckShares.DECK_SHARES.SHARE_RECIPIENT_ID }, true);
        public static final UniqueKey<DecksRecord> DECKS_PKEY = Internal.createUniqueKey(Decks.DECKS, "decks_pkey", new TableField[] { Decks.DECKS.ID }, true);
        public static final UniqueKey<FriendsRecord> FRIENDS_PKEY = Internal.createUniqueKey(Friends.FRIENDS, "friends_pkey", new TableField[] { Friends.FRIENDS.ID, Friends.FRIENDS.FRIEND }, true);
        public static final UniqueKey<GameUsersRecord> GAME_USERS_PKEY = Internal.createUniqueKey(GameUsers.GAME_USERS, "game_users_pkey", new TableField[] { GameUsers.GAME_USERS.GAME_ID, GameUsers.GAME_USERS.USER_ID }, true);
        public static final UniqueKey<GamesRecord> GAMES_PKEY = Internal.createUniqueKey(Games.GAMES, "games_pkey", new TableField[] { Games.GAMES.ID }, true);
        public static final UniqueKey<MatchmakingQueuesRecord> MATCHMAKING_QUEUES_PKEY = Internal.createUniqueKey(MatchmakingQueues.MATCHMAKING_QUEUES, "matchmaking_queues_pkey", new TableField[] { MatchmakingQueues.MATCHMAKING_QUEUES.ID }, true);
        public static final UniqueKey<MatchmakingTicketsRecord> MATCHMAKING_TICKETS_PKEY = Internal.createUniqueKey(MatchmakingTickets.MATCHMAKING_TICKETS, "matchmaking_tickets_pkey", new TableField[] { MatchmakingTickets.MATCHMAKING_TICKETS.ID, MatchmakingTickets.MATCHMAKING_TICKETS.QUEUE_ID }, true);
        public static final UniqueKey<UserEntityAddonsRecord> USER_ENTITY_ADDONS_PKEY = Internal.createUniqueKey(UserEntityAddons.USER_ENTITY_ADDONS, "user_entity_addons_pkey", new TableField[] { UserEntityAddons.USER_ENTITY_ADDONS.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BotUsersRecord, UserEntityRecord> BOT_USERS__BOT_USERS_ID_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, BotUsers.BOT_USERS, "bot_users_id_fkey", new TableField[] { BotUsers.BOT_USERS.ID }, true);
        public static final ForeignKey<CardsRecord, UserEntityRecord> CARDS__CARDS_CREATED_BY_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, Cards.CARDS, "cards_created_by_fkey", new TableField[] { Cards.CARDS.CREATED_BY }, true);
        public static final ForeignKey<CardsInDeckRecord, DecksRecord> CARDS_IN_DECK__CARDS_IN_DECK_DECK_ID_FKEY = Internal.createForeignKey(Keys.DECKS_PKEY, CardsInDeck.CARDS_IN_DECK, "cards_in_deck_deck_id_fkey", new TableField[] { CardsInDeck.CARDS_IN_DECK.DECK_ID }, true);
        public static final ForeignKey<CardsInDeckRecord, CardsRecord> CARDS_IN_DECK__CARDS_IN_DECK_CARD_ID_FKEY = Internal.createForeignKey(Keys.CARDS_PKEY, CardsInDeck.CARDS_IN_DECK, "cards_in_deck_card_id_fkey", new TableField[] { CardsInDeck.CARDS_IN_DECK.CARD_ID }, true);
        public static final ForeignKey<DeckPlayerAttributeTuplesRecord, DecksRecord> DECK_PLAYER_ATTRIBUTE_TUPLES__DECK_PLAYER_ATTRIBUTE_TUPLES_DECK_ID_FKEY = Internal.createForeignKey(Keys.DECKS_PKEY, DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES, "deck_player_attribute_tuples_deck_id_fkey", new TableField[] { DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.DECK_ID }, true);
        public static final ForeignKey<DeckSharesRecord, DecksRecord> DECK_SHARES__DECK_SHARES_DECK_ID_FKEY = Internal.createForeignKey(Keys.DECKS_PKEY, DeckShares.DECK_SHARES, "deck_shares_deck_id_fkey", new TableField[] { DeckShares.DECK_SHARES.DECK_ID }, true);
        public static final ForeignKey<DeckSharesRecord, UserEntityRecord> DECK_SHARES__DECK_SHARES_SHARE_RECIPIENT_ID_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, DeckShares.DECK_SHARES, "deck_shares_share_recipient_id_fkey", new TableField[] { DeckShares.DECK_SHARES.SHARE_RECIPIENT_ID }, true);
        public static final ForeignKey<DecksRecord, UserEntityRecord> DECKS__DECKS_CREATED_BY_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, Decks.DECKS, "decks_created_by_fkey", new TableField[] { Decks.DECKS.CREATED_BY }, true);
        public static final ForeignKey<DecksRecord, UserEntityRecord> DECKS__DECKS_LAST_EDITED_BY_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, Decks.DECKS, "decks_last_edited_by_fkey", new TableField[] { Decks.DECKS.LAST_EDITED_BY }, true);
        public static final ForeignKey<FriendsRecord, UserEntityRecord> FRIENDS__FRIENDS_ID_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, Friends.FRIENDS, "friends_id_fkey", new TableField[] { Friends.FRIENDS.ID }, true);
        public static final ForeignKey<FriendsRecord, UserEntityRecord> FRIENDS__FRIENDS_FRIEND_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, Friends.FRIENDS, "friends_friend_fkey", new TableField[] { Friends.FRIENDS.FRIEND }, true);
        public static final ForeignKey<GameUsersRecord, GamesRecord> GAME_USERS__GAME_USERS_GAME_ID_FKEY = Internal.createForeignKey(Keys.GAMES_PKEY, GameUsers.GAME_USERS, "game_users_game_id_fkey", new TableField[] { GameUsers.GAME_USERS.GAME_ID }, true);
        public static final ForeignKey<GameUsersRecord, UserEntityRecord> GAME_USERS__GAME_USERS_USER_ID_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, GameUsers.GAME_USERS, "game_users_user_id_fkey", new TableField[] { GameUsers.GAME_USERS.USER_ID }, true);
        public static final ForeignKey<GameUsersRecord, DecksRecord> GAME_USERS__GAME_USERS_DECK_ID_FKEY = Internal.createForeignKey(Keys.DECKS_PKEY, GameUsers.GAME_USERS, "game_users_deck_id_fkey", new TableField[] { GameUsers.GAME_USERS.DECK_ID }, true);
        public static final ForeignKey<MatchmakingTicketsRecord, MatchmakingQueuesRecord> MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_QUEUE_ID_FKEY = Internal.createForeignKey(Keys.MATCHMAKING_QUEUES_PKEY, MatchmakingTickets.MATCHMAKING_TICKETS, "matchmaking_tickets_queue_id_fkey", new TableField[] { MatchmakingTickets.MATCHMAKING_TICKETS.QUEUE_ID }, true);
        public static final ForeignKey<MatchmakingTicketsRecord, UserEntityRecord> MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_USER_ID_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, MatchmakingTickets.MATCHMAKING_TICKETS, "matchmaking_tickets_user_id_fkey", new TableField[] { MatchmakingTickets.MATCHMAKING_TICKETS.USER_ID }, true);
        public static final ForeignKey<MatchmakingTicketsRecord, DecksRecord> MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_DECK_ID_FKEY = Internal.createForeignKey(Keys.DECKS_PKEY, MatchmakingTickets.MATCHMAKING_TICKETS, "matchmaking_tickets_deck_id_fkey", new TableField[] { MatchmakingTickets.MATCHMAKING_TICKETS.DECK_ID }, true);
        public static final ForeignKey<MatchmakingTicketsRecord, DecksRecord> MATCHMAKING_TICKETS__MATCHMAKING_TICKETS_BOT_DECK_ID_FKEY = Internal.createForeignKey(Keys.DECKS_PKEY, MatchmakingTickets.MATCHMAKING_TICKETS, "matchmaking_tickets_bot_deck_id_fkey", new TableField[] { MatchmakingTickets.MATCHMAKING_TICKETS.BOT_DECK_ID }, true);
        public static final ForeignKey<UserEntityAddonsRecord, UserEntityRecord> USER_ENTITY_ADDONS__USER_ENTITY_ADDONS_ID_FKEY = Internal.createForeignKey(com.hiddenswitch.framework.schema.keycloak.Keys.CONSTRAINT_FB, UserEntityAddons.USER_ENTITY_ADDONS, "user_entity_addons_id_fkey", new TableField[] { UserEntityAddons.USER_ENTITY_ADDONS.ID }, true);
    }
}

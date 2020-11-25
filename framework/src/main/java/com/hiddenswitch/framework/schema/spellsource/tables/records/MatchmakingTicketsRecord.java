/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.records;


import com.hiddenswitch.framework.schema.spellsource.tables.MatchmakingTickets;
import com.hiddenswitch.framework.schema.spellsource.tables.interfaces.IMatchmakingTickets;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MatchmakingTicketsRecord extends UpdatableRecordImpl<MatchmakingTicketsRecord> implements VertxPojo, Record6<Long, String, String, String, String, OffsetDateTime>, IMatchmakingTickets {

    private static final long serialVersionUID = -1715430668;

    /**
     * Setter for <code>spellsource.matchmaking_tickets.id</code>.
     */
    @Override
    public MatchmakingTicketsRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>spellsource.matchmaking_tickets.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>spellsource.matchmaking_tickets.queue_id</code>.
     */
    @Override
    public MatchmakingTicketsRecord setQueueId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>spellsource.matchmaking_tickets.queue_id</code>.
     */
    @Override
    public String getQueueId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spellsource.matchmaking_tickets.user_id</code>.
     */
    @Override
    public MatchmakingTicketsRecord setUserId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>spellsource.matchmaking_tickets.user_id</code>.
     */
    @Override
    public String getUserId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>spellsource.matchmaking_tickets.deck_id</code>.
     */
    @Override
    public MatchmakingTicketsRecord setDeckId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>spellsource.matchmaking_tickets.deck_id</code>.
     */
    @Override
    public String getDeckId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spellsource.matchmaking_tickets.bot_deck_id</code>.
     */
    @Override
    public MatchmakingTicketsRecord setBotDeckId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>spellsource.matchmaking_tickets.bot_deck_id</code>.
     */
    @Override
    public String getBotDeckId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>spellsource.matchmaking_tickets.created_at</code>.
     */
    @Override
    public MatchmakingTicketsRecord setCreatedAt(OffsetDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>spellsource.matchmaking_tickets.created_at</code>.
     */
    @Override
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, String, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, String, String, OffsetDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MatchmakingTickets.MATCHMAKING_TICKETS.ID;
    }

    @Override
    public Field<String> field2() {
        return MatchmakingTickets.MATCHMAKING_TICKETS.QUEUE_ID;
    }

    @Override
    public Field<String> field3() {
        return MatchmakingTickets.MATCHMAKING_TICKETS.USER_ID;
    }

    @Override
    public Field<String> field4() {
        return MatchmakingTickets.MATCHMAKING_TICKETS.DECK_ID;
    }

    @Override
    public Field<String> field5() {
        return MatchmakingTickets.MATCHMAKING_TICKETS.BOT_DECK_ID;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return MatchmakingTickets.MATCHMAKING_TICKETS.CREATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getQueueId();
    }

    @Override
    public String component3() {
        return getUserId();
    }

    @Override
    public String component4() {
        return getDeckId();
    }

    @Override
    public String component5() {
        return getBotDeckId();
    }

    @Override
    public OffsetDateTime component6() {
        return getCreatedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getQueueId();
    }

    @Override
    public String value3() {
        return getUserId();
    }

    @Override
    public String value4() {
        return getDeckId();
    }

    @Override
    public String value5() {
        return getBotDeckId();
    }

    @Override
    public OffsetDateTime value6() {
        return getCreatedAt();
    }

    @Override
    public MatchmakingTicketsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public MatchmakingTicketsRecord value2(String value) {
        setQueueId(value);
        return this;
    }

    @Override
    public MatchmakingTicketsRecord value3(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public MatchmakingTicketsRecord value4(String value) {
        setDeckId(value);
        return this;
    }

    @Override
    public MatchmakingTicketsRecord value5(String value) {
        setBotDeckId(value);
        return this;
    }

    @Override
    public MatchmakingTicketsRecord value6(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public MatchmakingTicketsRecord values(Long value1, String value2, String value3, String value4, String value5, OffsetDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IMatchmakingTickets from) {
        setId(from.getId());
        setQueueId(from.getQueueId());
        setUserId(from.getUserId());
        setDeckId(from.getDeckId());
        setBotDeckId(from.getBotDeckId());
        setCreatedAt(from.getCreatedAt());
    }

    @Override
    public <E extends IMatchmakingTickets> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MatchmakingTicketsRecord
     */
    public MatchmakingTicketsRecord() {
        super(MatchmakingTickets.MATCHMAKING_TICKETS);
    }

    /**
     * Create a detached, initialised MatchmakingTicketsRecord
     */
    public MatchmakingTicketsRecord(Long id, String queueId, String userId, String deckId, String botDeckId, OffsetDateTime createdAt) {
        super(MatchmakingTickets.MATCHMAKING_TICKETS);

        set(0, id);
        set(1, queueId);
        set(2, userId);
        set(3, deckId);
        set(4, botDeckId);
        set(5, createdAt);
    }

    public MatchmakingTicketsRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.daos;


import com.hiddenswitch.framework.schema.spellsource.tables.MatchmakingQueues;
import com.hiddenswitch.framework.schema.spellsource.tables.records.MatchmakingQueuesRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.time.OffsetDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MatchmakingQueuesDao extends AbstractReactiveVertxDAO<MatchmakingQueuesRecord, com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues, String, Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>>, Future<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MatchmakingQueuesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public MatchmakingQueuesDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(MatchmakingQueues.MATCHMAKING_QUEUES, com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues.class, new ReactiveClassicQueryExecutor<MatchmakingQueuesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues,String>(configuration,delegate,com.hiddenswitch.framework.schema.spellsource.tables.mappers.RowMappers.getMatchmakingQueuesMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues object) {
        return object.getId();
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByName(Collection<String> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>bot_opponent IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByBotOpponent(Collection<Boolean> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.BOT_OPPONENT.in(values));
    }

    /**
     * Find records that have <code>bot_opponent IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByBotOpponent(Collection<Boolean> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.BOT_OPPONENT.in(values),limit);
    }

    /**
     * Find records that have <code>private_lobby IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByPrivateLobby(Collection<Boolean> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.PRIVATE_LOBBY.in(values));
    }

    /**
     * Find records that have <code>private_lobby IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByPrivateLobby(Collection<Boolean> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.PRIVATE_LOBBY.in(values),limit);
    }

    /**
     * Find records that have <code>starts_automatically IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByStartsAutomatically(Collection<Boolean> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.STARTS_AUTOMATICALLY.in(values));
    }

    /**
     * Find records that have <code>starts_automatically IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByStartsAutomatically(Collection<Boolean> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.STARTS_AUTOMATICALLY.in(values),limit);
    }

    /**
     * Find records that have <code>still_connected_timeout IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByStillConnectedTimeout(Collection<Long> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.STILL_CONNECTED_TIMEOUT.in(values));
    }

    /**
     * Find records that have <code>still_connected_timeout IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByStillConnectedTimeout(Collection<Long> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.STILL_CONNECTED_TIMEOUT.in(values),limit);
    }

    /**
     * Find records that have <code>empty_lobby_timeout IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByEmptyLobbyTimeout(Collection<Long> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.EMPTY_LOBBY_TIMEOUT.in(values));
    }

    /**
     * Find records that have <code>empty_lobby_timeout IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByEmptyLobbyTimeout(Collection<Long> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.EMPTY_LOBBY_TIMEOUT.in(values),limit);
    }

    /**
     * Find records that have <code>awaiting_lobby_timeout IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByAwaitingLobbyTimeout(Collection<Long> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.AWAITING_LOBBY_TIMEOUT.in(values));
    }

    /**
     * Find records that have <code>awaiting_lobby_timeout IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByAwaitingLobbyTimeout(Collection<Long> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.AWAITING_LOBBY_TIMEOUT.in(values),limit);
    }

    /**
     * Find records that have <code>once IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByOnce(Collection<Boolean> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.ONCE.in(values));
    }

    /**
     * Find records that have <code>once IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByOnce(Collection<Boolean> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.ONCE.in(values),limit);
    }

    /**
     * Find records that have <code>automatically_close IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByAutomaticallyClose(Collection<Boolean> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.AUTOMATICALLY_CLOSE.in(values));
    }

    /**
     * Find records that have <code>automatically_close IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByAutomaticallyClose(Collection<Boolean> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.AUTOMATICALLY_CLOSE.in(values),limit);
    }

    /**
     * Find records that have <code>lobby_size IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByLobbySize(Collection<Integer> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.LOBBY_SIZE.in(values));
    }

    /**
     * Find records that have <code>lobby_size IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByLobbySize(Collection<Integer> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.LOBBY_SIZE.in(values),limit);
    }

    /**
     * Find records that have <code>queue_created_at IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByQueueCreatedAt(Collection<OffsetDateTime> values) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.QUEUE_CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>queue_created_at IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues>> findManyByQueueCreatedAt(Collection<OffsetDateTime> values, int limit) {
        return findManyByCondition(MatchmakingQueues.MATCHMAKING_QUEUES.QUEUE_CREATED_AT.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<MatchmakingQueuesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<MatchmakingQueuesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.MatchmakingQueues,String>) super.queryExecutor();
    }
}

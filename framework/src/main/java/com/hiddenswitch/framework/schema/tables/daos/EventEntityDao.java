/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.daos;


import com.hiddenswitch.framework.schema.tables.EventEntity;
import com.hiddenswitch.framework.schema.tables.records.EventEntityRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventEntityDao extends AbstractReactiveVertxDAO<EventEntityRecord, com.hiddenswitch.framework.schema.tables.pojos.EventEntity, String, Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>>, Future<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<EventEntityRecord,com.hiddenswitch.framework.schema.tables.pojos.EventEntity,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public EventEntityDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(EventEntity.EVENT_ENTITY, com.hiddenswitch.framework.schema.tables.pojos.EventEntity.class, new ReactiveClassicQueryExecutor<EventEntityRecord,com.hiddenswitch.framework.schema.tables.pojos.EventEntity,String>(configuration,delegate,com.hiddenswitch.framework.schema.tables.mappers.RowMappers.getEventEntityMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.tables.pojos.EventEntity object) {
        return object.getId();
    }

    /**
     * Find records that have <code>client_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByClientId(Collection<String> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.CLIENT_ID.in(values));
    }

    /**
     * Find records that have <code>client_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByClientId(Collection<String> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.CLIENT_ID.in(values),limit);
    }

    /**
     * Find records that have <code>details_json IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByDetailsJson(Collection<String> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.DETAILS_JSON.in(values));
    }

    /**
     * Find records that have <code>details_json IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByDetailsJson(Collection<String> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.DETAILS_JSON.in(values),limit);
    }

    /**
     * Find records that have <code>error IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByError(Collection<String> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.ERROR.in(values));
    }

    /**
     * Find records that have <code>error IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByError(Collection<String> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.ERROR.in(values),limit);
    }

    /**
     * Find records that have <code>ip_address IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByIpAddress(Collection<String> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.IP_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>ip_address IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByIpAddress(Collection<String> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.IP_ADDRESS.in(values),limit);
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByRealmId(Collection<String> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.REALM_ID.in(values));
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByRealmId(Collection<String> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.REALM_ID.in(values),limit);
    }

    /**
     * Find records that have <code>session_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyBySessionId(Collection<String> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.SESSION_ID.in(values));
    }

    /**
     * Find records that have <code>session_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyBySessionId(Collection<String> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.SESSION_ID.in(values),limit);
    }

    /**
     * Find records that have <code>event_time IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByEventTime(Collection<Long> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.EVENT_TIME.in(values));
    }

    /**
     * Find records that have <code>event_time IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByEventTime(Collection<Long> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.EVENT_TIME.in(values),limit);
    }

    /**
     * Find records that have <code>type IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByType(Collection<String> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.TYPE.in(values));
    }

    /**
     * Find records that have <code>type IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.TYPE.in(values),limit);
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByUserId(Collection<String> values) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.USER_ID.in(values));
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.EventEntity>> findManyByUserId(Collection<String> values, int limit) {
        return findManyByCondition(EventEntity.EVENT_ENTITY.USER_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<EventEntityRecord,com.hiddenswitch.framework.schema.tables.pojos.EventEntity,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<EventEntityRecord,com.hiddenswitch.framework.schema.tables.pojos.EventEntity,String>) super.queryExecutor();
    }
}

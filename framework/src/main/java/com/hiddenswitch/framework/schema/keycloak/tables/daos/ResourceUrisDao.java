/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.ResourceUris;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ResourceUrisRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResourceUrisDao extends AbstractReactiveVertxDAO<ResourceUrisRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ResourceUrisRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ResourceUrisDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(ResourceUris.RESOURCE_URIS, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris.class, new ReactiveClassicQueryExecutor<ResourceUrisRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getResourceUrisMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris object) {
        return compositeKeyRecord(object.getResourceId(), object.getValue());
    }

    /**
     * Find records that have <code>value IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris>> findManyByValue(Collection<String> values) {
        return findManyByCondition(ResourceUris.RESOURCE_URIS.VALUE.in(values));
    }

    /**
     * Find records that have <code>value IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris>> findManyByValue(Collection<String> values, int limit) {
        return findManyByCondition(ResourceUris.RESOURCE_URIS.VALUE.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ResourceUrisRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ResourceUrisRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceUris,Record2<String, String>>) super.queryExecutor();
    }
}

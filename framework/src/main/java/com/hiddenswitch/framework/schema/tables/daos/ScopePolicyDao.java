/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.daos;


import com.hiddenswitch.framework.schema.tables.ScopePolicy;
import com.hiddenswitch.framework.schema.tables.records.ScopePolicyRecord;

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
public class ScopePolicyDao extends AbstractReactiveVertxDAO<ScopePolicyRecord, com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy>>, Future<com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ScopePolicyRecord,com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ScopePolicyDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(ScopePolicy.SCOPE_POLICY, com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy.class, new ReactiveClassicQueryExecutor<ScopePolicyRecord,com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.tables.mappers.RowMappers.getScopePolicyMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy object) {
        return compositeKeyRecord(object.getScopeId(), object.getPolicyId());
    }

    /**
     * Find records that have <code>policy_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy>> findManyByPolicyId(Collection<String> values) {
        return findManyByCondition(ScopePolicy.SCOPE_POLICY.POLICY_ID.in(values));
    }

    /**
     * Find records that have <code>policy_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy>> findManyByPolicyId(Collection<String> values, int limit) {
        return findManyByCondition(ScopePolicy.SCOPE_POLICY.POLICY_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ScopePolicyRecord,com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ScopePolicyRecord,com.hiddenswitch.framework.schema.tables.pojos.ScopePolicy,Record2<String, String>>) super.queryExecutor();
    }
}

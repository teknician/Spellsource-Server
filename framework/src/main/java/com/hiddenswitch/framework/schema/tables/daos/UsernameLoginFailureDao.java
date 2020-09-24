/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.daos;


import com.hiddenswitch.framework.schema.tables.UsernameLoginFailure;
import com.hiddenswitch.framework.schema.tables.records.UsernameLoginFailureRecord;

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
public class UsernameLoginFailureDao extends AbstractReactiveVertxDAO<UsernameLoginFailureRecord, com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>>, Future<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UsernameLoginFailureRecord,com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public UsernameLoginFailureDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(UsernameLoginFailure.USERNAME_LOGIN_FAILURE, com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure.class, new ReactiveClassicQueryExecutor<UsernameLoginFailureRecord,com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.tables.mappers.RowMappers.getUsernameLoginFailureMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure object) {
        return compositeKeyRecord(object.getRealmId(), object.getUsername());
    }

    /**
     * Find records that have <code>username IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByUsername(Collection<String> values) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.USERNAME.in(values));
    }

    /**
     * Find records that have <code>username IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByUsername(Collection<String> values, int limit) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.USERNAME.in(values),limit);
    }

    /**
     * Find records that have <code>failed_login_not_before IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByFailedLoginNotBefore(Collection<Integer> values) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.FAILED_LOGIN_NOT_BEFORE.in(values));
    }

    /**
     * Find records that have <code>failed_login_not_before IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByFailedLoginNotBefore(Collection<Integer> values, int limit) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.FAILED_LOGIN_NOT_BEFORE.in(values),limit);
    }

    /**
     * Find records that have <code>last_failure IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByLastFailure(Collection<Long> values) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.LAST_FAILURE.in(values));
    }

    /**
     * Find records that have <code>last_failure IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByLastFailure(Collection<Long> values, int limit) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.LAST_FAILURE.in(values),limit);
    }

    /**
     * Find records that have <code>last_ip_failure IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByLastIpFailure(Collection<String> values) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.LAST_IP_FAILURE.in(values));
    }

    /**
     * Find records that have <code>last_ip_failure IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByLastIpFailure(Collection<String> values, int limit) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.LAST_IP_FAILURE.in(values),limit);
    }

    /**
     * Find records that have <code>num_failures IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByNumFailures(Collection<Integer> values) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.NUM_FAILURES.in(values));
    }

    /**
     * Find records that have <code>num_failures IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure>> findManyByNumFailures(Collection<Integer> values, int limit) {
        return findManyByCondition(UsernameLoginFailure.USERNAME_LOGIN_FAILURE.NUM_FAILURES.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<UsernameLoginFailureRecord,com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<UsernameLoginFailureRecord,com.hiddenswitch.framework.schema.tables.pojos.UsernameLoginFailure,Record2<String, String>>) super.queryExecutor();
    }
}

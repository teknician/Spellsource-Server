/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.records;


import com.hiddenswitch.framework.schema.tables.UserSession;
import com.hiddenswitch.framework.schema.tables.interfaces.IUserSession;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSessionRecord extends UpdatableRecordImpl<UserSessionRecord> implements VertxPojo, Record12<String, String, String, Integer, String, String, Boolean, Integer, String, Integer, String, String>, IUserSession {

    private static final long serialVersionUID = 1366608560;

    /**
     * Setter for <code>public.user_session.id</code>.
     */
    @Override
    public UserSessionRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.user_session.auth_method</code>.
     */
    @Override
    public UserSessionRecord setAuthMethod(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.auth_method</code>.
     */
    @Override
    public String getAuthMethod() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user_session.ip_address</code>.
     */
    @Override
    public UserSessionRecord setIpAddress(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.ip_address</code>.
     */
    @Override
    public String getIpAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user_session.last_session_refresh</code>.
     */
    @Override
    public UserSessionRecord setLastSessionRefresh(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.last_session_refresh</code>.
     */
    @Override
    public Integer getLastSessionRefresh() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.user_session.login_username</code>.
     */
    @Override
    public UserSessionRecord setLoginUsername(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.login_username</code>.
     */
    @Override
    public String getLoginUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.user_session.realm_id</code>.
     */
    @Override
    public UserSessionRecord setRealmId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.user_session.remember_me</code>.
     */
    @Override
    public UserSessionRecord setRememberMe(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.remember_me</code>.
     */
    @Override
    public Boolean getRememberMe() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.user_session.started</code>.
     */
    @Override
    public UserSessionRecord setStarted(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.started</code>.
     */
    @Override
    public Integer getStarted() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.user_session.user_id</code>.
     */
    @Override
    public UserSessionRecord setUserId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.user_id</code>.
     */
    @Override
    public String getUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.user_session.user_session_state</code>.
     */
    @Override
    public UserSessionRecord setUserSessionState(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.user_session_state</code>.
     */
    @Override
    public Integer getUserSessionState() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.user_session.broker_session_id</code>.
     */
    @Override
    public UserSessionRecord setBrokerSessionId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.broker_session_id</code>.
     */
    @Override
    public String getBrokerSessionId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.user_session.broker_user_id</code>.
     */
    @Override
    public UserSessionRecord setBrokerUserId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.user_session.broker_user_id</code>.
     */
    @Override
    public String getBrokerUserId() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, Integer, String, String, Boolean, Integer, String, Integer, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, Integer, String, String, Boolean, Integer, String, Integer, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UserSession.USER_SESSION.ID;
    }

    @Override
    public Field<String> field2() {
        return UserSession.USER_SESSION.AUTH_METHOD;
    }

    @Override
    public Field<String> field3() {
        return UserSession.USER_SESSION.IP_ADDRESS;
    }

    @Override
    public Field<Integer> field4() {
        return UserSession.USER_SESSION.LAST_SESSION_REFRESH;
    }

    @Override
    public Field<String> field5() {
        return UserSession.USER_SESSION.LOGIN_USERNAME;
    }

    @Override
    public Field<String> field6() {
        return UserSession.USER_SESSION.REALM_ID;
    }

    @Override
    public Field<Boolean> field7() {
        return UserSession.USER_SESSION.REMEMBER_ME;
    }

    @Override
    public Field<Integer> field8() {
        return UserSession.USER_SESSION.STARTED;
    }

    @Override
    public Field<String> field9() {
        return UserSession.USER_SESSION.USER_ID;
    }

    @Override
    public Field<Integer> field10() {
        return UserSession.USER_SESSION.USER_SESSION_STATE;
    }

    @Override
    public Field<String> field11() {
        return UserSession.USER_SESSION.BROKER_SESSION_ID;
    }

    @Override
    public Field<String> field12() {
        return UserSession.USER_SESSION.BROKER_USER_ID;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAuthMethod();
    }

    @Override
    public String component3() {
        return getIpAddress();
    }

    @Override
    public Integer component4() {
        return getLastSessionRefresh();
    }

    @Override
    public String component5() {
        return getLoginUsername();
    }

    @Override
    public String component6() {
        return getRealmId();
    }

    @Override
    public Boolean component7() {
        return getRememberMe();
    }

    @Override
    public Integer component8() {
        return getStarted();
    }

    @Override
    public String component9() {
        return getUserId();
    }

    @Override
    public Integer component10() {
        return getUserSessionState();
    }

    @Override
    public String component11() {
        return getBrokerSessionId();
    }

    @Override
    public String component12() {
        return getBrokerUserId();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAuthMethod();
    }

    @Override
    public String value3() {
        return getIpAddress();
    }

    @Override
    public Integer value4() {
        return getLastSessionRefresh();
    }

    @Override
    public String value5() {
        return getLoginUsername();
    }

    @Override
    public String value6() {
        return getRealmId();
    }

    @Override
    public Boolean value7() {
        return getRememberMe();
    }

    @Override
    public Integer value8() {
        return getStarted();
    }

    @Override
    public String value9() {
        return getUserId();
    }

    @Override
    public Integer value10() {
        return getUserSessionState();
    }

    @Override
    public String value11() {
        return getBrokerSessionId();
    }

    @Override
    public String value12() {
        return getBrokerUserId();
    }

    @Override
    public UserSessionRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public UserSessionRecord value2(String value) {
        setAuthMethod(value);
        return this;
    }

    @Override
    public UserSessionRecord value3(String value) {
        setIpAddress(value);
        return this;
    }

    @Override
    public UserSessionRecord value4(Integer value) {
        setLastSessionRefresh(value);
        return this;
    }

    @Override
    public UserSessionRecord value5(String value) {
        setLoginUsername(value);
        return this;
    }

    @Override
    public UserSessionRecord value6(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public UserSessionRecord value7(Boolean value) {
        setRememberMe(value);
        return this;
    }

    @Override
    public UserSessionRecord value8(Integer value) {
        setStarted(value);
        return this;
    }

    @Override
    public UserSessionRecord value9(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserSessionRecord value10(Integer value) {
        setUserSessionState(value);
        return this;
    }

    @Override
    public UserSessionRecord value11(String value) {
        setBrokerSessionId(value);
        return this;
    }

    @Override
    public UserSessionRecord value12(String value) {
        setBrokerUserId(value);
        return this;
    }

    @Override
    public UserSessionRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, Boolean value7, Integer value8, String value9, Integer value10, String value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserSession from) {
        setId(from.getId());
        setAuthMethod(from.getAuthMethod());
        setIpAddress(from.getIpAddress());
        setLastSessionRefresh(from.getLastSessionRefresh());
        setLoginUsername(from.getLoginUsername());
        setRealmId(from.getRealmId());
        setRememberMe(from.getRememberMe());
        setStarted(from.getStarted());
        setUserId(from.getUserId());
        setUserSessionState(from.getUserSessionState());
        setBrokerSessionId(from.getBrokerSessionId());
        setBrokerUserId(from.getBrokerUserId());
    }

    @Override
    public <E extends IUserSession> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserSessionRecord
     */
    public UserSessionRecord() {
        super(UserSession.USER_SESSION);
    }

    /**
     * Create a detached, initialised UserSessionRecord
     */
    public UserSessionRecord(String id, String authMethod, String ipAddress, Integer lastSessionRefresh, String loginUsername, String realmId, Boolean rememberMe, Integer started, String userId, Integer userSessionState, String brokerSessionId, String brokerUserId) {
        super(UserSession.USER_SESSION);

        set(0, id);
        set(1, authMethod);
        set(2, ipAddress);
        set(3, lastSessionRefresh);
        set(4, loginUsername);
        set(5, realmId);
        set(6, rememberMe);
        set(7, started);
        set(8, userId);
        set(9, userSessionState);
        set(10, brokerSessionId);
        set(11, brokerUserId);
    }

    public UserSessionRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

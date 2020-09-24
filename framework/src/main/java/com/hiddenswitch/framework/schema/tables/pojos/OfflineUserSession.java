/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.IOfflineUserSession;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OfflineUserSession implements VertxPojo, IOfflineUserSession {

    private static final long serialVersionUID = -1492457341;

    private String  userSessionId;
    private String  userId;
    private String  realmId;
    private Integer createdOn;
    private String  offlineFlag;
    private String  data;
    private Integer lastSessionRefresh;

    public OfflineUserSession() {}

    public OfflineUserSession(IOfflineUserSession value) {
        this.userSessionId = value.getUserSessionId();
        this.userId = value.getUserId();
        this.realmId = value.getRealmId();
        this.createdOn = value.getCreatedOn();
        this.offlineFlag = value.getOfflineFlag();
        this.data = value.getData();
        this.lastSessionRefresh = value.getLastSessionRefresh();
    }

    public OfflineUserSession(
        String  userSessionId,
        String  userId,
        String  realmId,
        Integer createdOn,
        String  offlineFlag,
        String  data,
        Integer lastSessionRefresh
    ) {
        this.userSessionId = userSessionId;
        this.userId = userId;
        this.realmId = realmId;
        this.createdOn = createdOn;
        this.offlineFlag = offlineFlag;
        this.data = data;
        this.lastSessionRefresh = lastSessionRefresh;
    }

    public OfflineUserSession(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getUserSessionId() {
        return this.userSessionId;
    }

    @Override
    public OfflineUserSession setUserSessionId(String userSessionId) {
        this.userSessionId = userSessionId;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public OfflineUserSession setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String getRealmId() {
        return this.realmId;
    }

    @Override
    public OfflineUserSession setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    @Override
    public Integer getCreatedOn() {
        return this.createdOn;
    }

    @Override
    public OfflineUserSession setCreatedOn(Integer createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    @Override
    public String getOfflineFlag() {
        return this.offlineFlag;
    }

    @Override
    public OfflineUserSession setOfflineFlag(String offlineFlag) {
        this.offlineFlag = offlineFlag;
        return this;
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public OfflineUserSession setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public Integer getLastSessionRefresh() {
        return this.lastSessionRefresh;
    }

    @Override
    public OfflineUserSession setLastSessionRefresh(Integer lastSessionRefresh) {
        this.lastSessionRefresh = lastSessionRefresh;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OfflineUserSession (");

        sb.append(userSessionId);
        sb.append(", ").append(userId);
        sb.append(", ").append(realmId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(offlineFlag);
        sb.append(", ").append(data);
        sb.append(", ").append(lastSessionRefresh);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IOfflineUserSession from) {
        setUserSessionId(from.getUserSessionId());
        setUserId(from.getUserId());
        setRealmId(from.getRealmId());
        setCreatedOn(from.getCreatedOn());
        setOfflineFlag(from.getOfflineFlag());
        setData(from.getData());
        setLastSessionRefresh(from.getLastSessionRefresh());
    }

    @Override
    public <E extends IOfflineUserSession> E into(E into) {
        into.from(this);
        return into;
    }
}

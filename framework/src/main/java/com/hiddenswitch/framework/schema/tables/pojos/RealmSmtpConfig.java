/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.IRealmSmtpConfig;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RealmSmtpConfig implements VertxPojo, IRealmSmtpConfig {

    private static final long serialVersionUID = 1277952320;

    private String realmId;
    private String value;
    private String name;

    public RealmSmtpConfig() {}

    public RealmSmtpConfig(IRealmSmtpConfig value) {
        this.realmId = value.getRealmId();
        this.value = value.getValue();
        this.name = value.getName();
    }

    public RealmSmtpConfig(
        String realmId,
        String value,
        String name
    ) {
        this.realmId = realmId;
        this.value = value;
        this.name = name;
    }

    public RealmSmtpConfig(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getRealmId() {
        return this.realmId;
    }

    @Override
    public RealmSmtpConfig setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public RealmSmtpConfig setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public RealmSmtpConfig setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RealmSmtpConfig (");

        sb.append(realmId);
        sb.append(", ").append(value);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRealmSmtpConfig from) {
        setRealmId(from.getRealmId());
        setValue(from.getValue());
        setName(from.getName());
    }

    @Override
    public <E extends IRealmSmtpConfig> E into(E into) {
        into.from(this);
        return into;
    }
}

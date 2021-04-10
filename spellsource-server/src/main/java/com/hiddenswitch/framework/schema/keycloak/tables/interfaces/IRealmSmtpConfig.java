/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IRealmSmtpConfig extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.realm_smtp_config.realm_id</code>.
     */
    public IRealmSmtpConfig setRealmId(String value);

    /**
     * Getter for <code>keycloak.realm_smtp_config.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>keycloak.realm_smtp_config.value</code>.
     */
    public IRealmSmtpConfig setValue(String value);

    /**
     * Getter for <code>keycloak.realm_smtp_config.value</code>.
     */
    public String getValue();

    /**
     * Setter for <code>keycloak.realm_smtp_config.name</code>.
     */
    public IRealmSmtpConfig setName(String value);

    /**
     * Getter for <code>keycloak.realm_smtp_config.name</code>.
     */
    public String getName();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRealmSmtpConfig
     */
    public void from(IRealmSmtpConfig from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRealmSmtpConfig
     */
    public <E extends IRealmSmtpConfig> E into(E into);

    @Override
    public default IRealmSmtpConfig fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setValue(json.getString("value"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("value","java.lang.String",e);
        }
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("realm_id",getRealmId());
        json.put("value",getValue());
        json.put("name",getName());
        return json;
    }

}
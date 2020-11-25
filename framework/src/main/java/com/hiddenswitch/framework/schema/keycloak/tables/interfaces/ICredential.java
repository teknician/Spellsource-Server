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
public interface ICredential extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.credential.id</code>.
     */
    public ICredential setId(String value);

    /**
     * Getter for <code>keycloak.credential.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.credential.salt</code>.
     */
    public ICredential setSalt(byte[] value);

    /**
     * Getter for <code>keycloak.credential.salt</code>.
     */
    public byte[] getSalt();

    /**
     * Setter for <code>keycloak.credential.type</code>.
     */
    public ICredential setType(String value);

    /**
     * Getter for <code>keycloak.credential.type</code>.
     */
    public String getType();

    /**
     * Setter for <code>keycloak.credential.user_id</code>.
     */
    public ICredential setUserId(String value);

    /**
     * Getter for <code>keycloak.credential.user_id</code>.
     */
    public String getUserId();

    /**
     * Setter for <code>keycloak.credential.created_date</code>.
     */
    public ICredential setCreatedDate(Long value);

    /**
     * Getter for <code>keycloak.credential.created_date</code>.
     */
    public Long getCreatedDate();

    /**
     * Setter for <code>keycloak.credential.user_label</code>.
     */
    public ICredential setUserLabel(String value);

    /**
     * Getter for <code>keycloak.credential.user_label</code>.
     */
    public String getUserLabel();

    /**
     * Setter for <code>keycloak.credential.secret_data</code>.
     */
    public ICredential setSecretData(String value);

    /**
     * Getter for <code>keycloak.credential.secret_data</code>.
     */
    public String getSecretData();

    /**
     * Setter for <code>keycloak.credential.credential_data</code>.
     */
    public ICredential setCredentialData(String value);

    /**
     * Getter for <code>keycloak.credential.credential_data</code>.
     */
    public String getCredentialData();

    /**
     * Setter for <code>keycloak.credential.priority</code>.
     */
    public ICredential setPriority(Integer value);

    /**
     * Getter for <code>keycloak.credential.priority</code>.
     */
    public Integer getPriority();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ICredential
     */
    public void from(ICredential from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ICredential
     */
    public <E extends ICredential> E into(E into);

    @Override
    public default ICredential fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setSalt(json.getBinary("salt"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("salt","byte[]",e);
        }
        try {
            setType(json.getString("type"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("type","java.lang.String",e);
        }
        try {
            setUserId(json.getString("user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_id","java.lang.String",e);
        }
        try {
            setCreatedDate(json.getLong("created_date"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("created_date","java.lang.Long",e);
        }
        try {
            setUserLabel(json.getString("user_label"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_label","java.lang.String",e);
        }
        try {
            setSecretData(json.getString("secret_data"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("secret_data","java.lang.String",e);
        }
        try {
            setCredentialData(json.getString("credential_data"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("credential_data","java.lang.String",e);
        }
        try {
            setPriority(json.getInteger("priority"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("priority","java.lang.Integer",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("salt",getSalt());
        json.put("type",getType());
        json.put("user_id",getUserId());
        json.put("created_date",getCreatedDate());
        json.put("user_label",getUserLabel());
        json.put("secret_data",getSecretData());
        json.put("credential_data",getCredentialData());
        json.put("priority",getPriority());
        return json;
    }

}

/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFedUserConsent extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.fed_user_consent.id</code>.
     */
    public IFedUserConsent setId(String value);

    /**
     * Getter for <code>public.fed_user_consent.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>public.fed_user_consent.client_id</code>.
     */
    public IFedUserConsent setClientId(String value);

    /**
     * Getter for <code>public.fed_user_consent.client_id</code>.
     */
    public String getClientId();

    /**
     * Setter for <code>public.fed_user_consent.user_id</code>.
     */
    public IFedUserConsent setUserId(String value);

    /**
     * Getter for <code>public.fed_user_consent.user_id</code>.
     */
    public String getUserId();

    /**
     * Setter for <code>public.fed_user_consent.realm_id</code>.
     */
    public IFedUserConsent setRealmId(String value);

    /**
     * Getter for <code>public.fed_user_consent.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>public.fed_user_consent.storage_provider_id</code>.
     */
    public IFedUserConsent setStorageProviderId(String value);

    /**
     * Getter for <code>public.fed_user_consent.storage_provider_id</code>.
     */
    public String getStorageProviderId();

    /**
     * Setter for <code>public.fed_user_consent.created_date</code>.
     */
    public IFedUserConsent setCreatedDate(Long value);

    /**
     * Getter for <code>public.fed_user_consent.created_date</code>.
     */
    public Long getCreatedDate();

    /**
     * Setter for <code>public.fed_user_consent.last_updated_date</code>.
     */
    public IFedUserConsent setLastUpdatedDate(Long value);

    /**
     * Getter for <code>public.fed_user_consent.last_updated_date</code>.
     */
    public Long getLastUpdatedDate();

    /**
     * Setter for <code>public.fed_user_consent.client_storage_provider</code>.
     */
    public IFedUserConsent setClientStorageProvider(String value);

    /**
     * Getter for <code>public.fed_user_consent.client_storage_provider</code>.
     */
    public String getClientStorageProvider();

    /**
     * Setter for <code>public.fed_user_consent.external_client_id</code>.
     */
    public IFedUserConsent setExternalClientId(String value);

    /**
     * Getter for <code>public.fed_user_consent.external_client_id</code>.
     */
    public String getExternalClientId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFedUserConsent
     */
    public void from(IFedUserConsent from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFedUserConsent
     */
    public <E extends IFedUserConsent> E into(E into);

    @Override
    public default IFedUserConsent fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setClientId(json.getString("client_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_id","java.lang.String",e);
        }
        try {
            setUserId(json.getString("user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_id","java.lang.String",e);
        }
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setStorageProviderId(json.getString("storage_provider_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("storage_provider_id","java.lang.String",e);
        }
        try {
            setCreatedDate(json.getLong("created_date"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("created_date","java.lang.Long",e);
        }
        try {
            setLastUpdatedDate(json.getLong("last_updated_date"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("last_updated_date","java.lang.Long",e);
        }
        try {
            setClientStorageProvider(json.getString("client_storage_provider"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_storage_provider","java.lang.String",e);
        }
        try {
            setExternalClientId(json.getString("external_client_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("external_client_id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("client_id",getClientId());
        json.put("user_id",getUserId());
        json.put("realm_id",getRealmId());
        json.put("storage_provider_id",getStorageProviderId());
        json.put("created_date",getCreatedDate());
        json.put("last_updated_date",getLastUpdatedDate());
        json.put("client_storage_provider",getClientStorageProvider());
        json.put("external_client_id",getExternalClientId());
        return json;
    }

}

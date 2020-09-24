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
public interface IRedirectUris extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.redirect_uris.client_id</code>.
     */
    public IRedirectUris setClientId(String value);

    /**
     * Getter for <code>public.redirect_uris.client_id</code>.
     */
    public String getClientId();

    /**
     * Setter for <code>public.redirect_uris.value</code>.
     */
    public IRedirectUris setValue(String value);

    /**
     * Getter for <code>public.redirect_uris.value</code>.
     */
    public String getValue();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRedirectUris
     */
    public void from(IRedirectUris from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRedirectUris
     */
    public <E extends IRedirectUris> E into(E into);

    @Override
    public default IRedirectUris fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setClientId(json.getString("client_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_id","java.lang.String",e);
        }
        try {
            setValue(json.getString("value"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("value","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("client_id",getClientId());
        json.put("value",getValue());
        return json;
    }

}

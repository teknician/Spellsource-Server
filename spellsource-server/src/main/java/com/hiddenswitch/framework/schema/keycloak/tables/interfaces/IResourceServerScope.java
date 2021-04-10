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
public interface IResourceServerScope extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.resource_server_scope.id</code>.
     */
    public IResourceServerScope setId(String value);

    /**
     * Getter for <code>keycloak.resource_server_scope.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.resource_server_scope.name</code>.
     */
    public IResourceServerScope setName(String value);

    /**
     * Getter for <code>keycloak.resource_server_scope.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.resource_server_scope.icon_uri</code>.
     */
    public IResourceServerScope setIconUri(String value);

    /**
     * Getter for <code>keycloak.resource_server_scope.icon_uri</code>.
     */
    public String getIconUri();

    /**
     * Setter for <code>keycloak.resource_server_scope.resource_server_id</code>.
     */
    public IResourceServerScope setResourceServerId(String value);

    /**
     * Getter for <code>keycloak.resource_server_scope.resource_server_id</code>.
     */
    public String getResourceServerId();

    /**
     * Setter for <code>keycloak.resource_server_scope.display_name</code>.
     */
    public IResourceServerScope setDisplayName(String value);

    /**
     * Getter for <code>keycloak.resource_server_scope.display_name</code>.
     */
    public String getDisplayName();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IResourceServerScope
     */
    public void from(IResourceServerScope from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IResourceServerScope
     */
    public <E extends IResourceServerScope> E into(E into);

    @Override
    public default IResourceServerScope fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        try {
            setIconUri(json.getString("icon_uri"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("icon_uri","java.lang.String",e);
        }
        try {
            setResourceServerId(json.getString("resource_server_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("resource_server_id","java.lang.String",e);
        }
        try {
            setDisplayName(json.getString("display_name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("display_name","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("name",getName());
        json.put("icon_uri",getIconUri());
        json.put("resource_server_id",getResourceServerId());
        json.put("display_name",getDisplayName());
        return json;
    }

}
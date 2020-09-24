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
public interface IRoleAttribute extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.role_attribute.id</code>.
     */
    public IRoleAttribute setId(String value);

    /**
     * Getter for <code>public.role_attribute.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>public.role_attribute.role_id</code>.
     */
    public IRoleAttribute setRoleId(String value);

    /**
     * Getter for <code>public.role_attribute.role_id</code>.
     */
    public String getRoleId();

    /**
     * Setter for <code>public.role_attribute.name</code>.
     */
    public IRoleAttribute setName(String value);

    /**
     * Getter for <code>public.role_attribute.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>public.role_attribute.value</code>.
     */
    public IRoleAttribute setValue(String value);

    /**
     * Getter for <code>public.role_attribute.value</code>.
     */
    public String getValue();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRoleAttribute
     */
    public void from(IRoleAttribute from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRoleAttribute
     */
    public <E extends IRoleAttribute> E into(E into);

    @Override
    public default IRoleAttribute fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setRoleId(json.getString("role_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("role_id","java.lang.String",e);
        }
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
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
        json.put("id",getId());
        json.put("role_id",getRoleId());
        json.put("name",getName());
        json.put("value",getValue());
        return json;
    }

}

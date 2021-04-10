/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.RealmDefaultRoles;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IRealmDefaultRoles;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RealmDefaultRolesRecord extends UpdatableRecordImpl<RealmDefaultRolesRecord> implements VertxPojo, Record2<String, String>, IRealmDefaultRoles {

    private static final long serialVersionUID = -731343728;

    /**
     * Setter for <code>keycloak.realm_default_roles.realm_id</code>.
     */
    @Override
    public RealmDefaultRolesRecord setRealmId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm_default_roles.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.realm_default_roles.role_id</code>.
     */
    @Override
    public RealmDefaultRolesRecord setRoleId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm_default_roles.role_id</code>.
     */
    @Override
    public String getRoleId() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RealmDefaultRoles.REALM_DEFAULT_ROLES.REALM_ID;
    }

    @Override
    public Field<String> field2() {
        return RealmDefaultRoles.REALM_DEFAULT_ROLES.ROLE_ID;
    }

    @Override
    public String component1() {
        return getRealmId();
    }

    @Override
    public String component2() {
        return getRoleId();
    }

    @Override
    public String value1() {
        return getRealmId();
    }

    @Override
    public String value2() {
        return getRoleId();
    }

    @Override
    public RealmDefaultRolesRecord value1(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public RealmDefaultRolesRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    @Override
    public RealmDefaultRolesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRealmDefaultRoles from) {
        setRealmId(from.getRealmId());
        setRoleId(from.getRoleId());
    }

    @Override
    public <E extends IRealmDefaultRoles> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RealmDefaultRolesRecord
     */
    public RealmDefaultRolesRecord() {
        super(RealmDefaultRoles.REALM_DEFAULT_ROLES);
    }

    /**
     * Create a detached, initialised RealmDefaultRolesRecord
     */
    public RealmDefaultRolesRecord(String realmId, String roleId) {
        super(RealmDefaultRoles.REALM_DEFAULT_ROLES);

        set(0, realmId);
        set(1, roleId);
    }

    public RealmDefaultRolesRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
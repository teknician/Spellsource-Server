/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.records;


import com.hiddenswitch.framework.schema.tables.FedUserRoleMapping;
import com.hiddenswitch.framework.schema.tables.interfaces.IFedUserRoleMapping;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FedUserRoleMappingRecord extends UpdatableRecordImpl<FedUserRoleMappingRecord> implements VertxPojo, Record4<String, String, String, String>, IFedUserRoleMapping {

    private static final long serialVersionUID = 1712302397;

    /**
     * Setter for <code>public.fed_user_role_mapping.role_id</code>.
     */
    @Override
    public FedUserRoleMappingRecord setRoleId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.fed_user_role_mapping.role_id</code>.
     */
    @Override
    public String getRoleId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.fed_user_role_mapping.user_id</code>.
     */
    @Override
    public FedUserRoleMappingRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.fed_user_role_mapping.user_id</code>.
     */
    @Override
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.fed_user_role_mapping.realm_id</code>.
     */
    @Override
    public FedUserRoleMappingRecord setRealmId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.fed_user_role_mapping.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.fed_user_role_mapping.storage_provider_id</code>.
     */
    @Override
    public FedUserRoleMappingRecord setStorageProviderId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.fed_user_role_mapping.storage_provider_id</code>.
     */
    @Override
    public String getStorageProviderId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FedUserRoleMapping.FED_USER_ROLE_MAPPING.ROLE_ID;
    }

    @Override
    public Field<String> field2() {
        return FedUserRoleMapping.FED_USER_ROLE_MAPPING.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return FedUserRoleMapping.FED_USER_ROLE_MAPPING.REALM_ID;
    }

    @Override
    public Field<String> field4() {
        return FedUserRoleMapping.FED_USER_ROLE_MAPPING.STORAGE_PROVIDER_ID;
    }

    @Override
    public String component1() {
        return getRoleId();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getRealmId();
    }

    @Override
    public String component4() {
        return getStorageProviderId();
    }

    @Override
    public String value1() {
        return getRoleId();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getRealmId();
    }

    @Override
    public String value4() {
        return getStorageProviderId();
    }

    @Override
    public FedUserRoleMappingRecord value1(String value) {
        setRoleId(value);
        return this;
    }

    @Override
    public FedUserRoleMappingRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public FedUserRoleMappingRecord value3(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public FedUserRoleMappingRecord value4(String value) {
        setStorageProviderId(value);
        return this;
    }

    @Override
    public FedUserRoleMappingRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFedUserRoleMapping from) {
        setRoleId(from.getRoleId());
        setUserId(from.getUserId());
        setRealmId(from.getRealmId());
        setStorageProviderId(from.getStorageProviderId());
    }

    @Override
    public <E extends IFedUserRoleMapping> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FedUserRoleMappingRecord
     */
    public FedUserRoleMappingRecord() {
        super(FedUserRoleMapping.FED_USER_ROLE_MAPPING);
    }

    /**
     * Create a detached, initialised FedUserRoleMappingRecord
     */
    public FedUserRoleMappingRecord(String roleId, String userId, String realmId, String storageProviderId) {
        super(FedUserRoleMapping.FED_USER_ROLE_MAPPING);

        set(0, roleId);
        set(1, userId);
        set(2, realmId);
        set(3, storageProviderId);
    }

    public FedUserRoleMappingRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

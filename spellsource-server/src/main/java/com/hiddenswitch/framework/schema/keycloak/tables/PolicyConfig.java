/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.PolicyConfigRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PolicyConfig extends TableImpl<PolicyConfigRecord> {

    private static final long serialVersionUID = -1119967827;

    /**
     * The reference instance of <code>keycloak.policy_config</code>
     */
    public static final PolicyConfig POLICY_CONFIG = new PolicyConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PolicyConfigRecord> getRecordType() {
        return PolicyConfigRecord.class;
    }

    /**
     * The column <code>keycloak.policy_config.policy_id</code>.
     */
    public final TableField<PolicyConfigRecord, String> POLICY_ID = createField(DSL.name("policy_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.policy_config.name</code>.
     */
    public final TableField<PolicyConfigRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>keycloak.policy_config.value</code>.
     */
    public final TableField<PolicyConfigRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>keycloak.policy_config</code> table reference
     */
    public PolicyConfig() {
        this(DSL.name("policy_config"), null);
    }

    /**
     * Create an aliased <code>keycloak.policy_config</code> table reference
     */
    public PolicyConfig(String alias) {
        this(DSL.name(alias), POLICY_CONFIG);
    }

    /**
     * Create an aliased <code>keycloak.policy_config</code> table reference
     */
    public PolicyConfig(Name alias) {
        this(alias, POLICY_CONFIG);
    }

    private PolicyConfig(Name alias, Table<PolicyConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private PolicyConfig(Name alias, Table<PolicyConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> PolicyConfig(Table<O> child, ForeignKey<O, PolicyConfigRecord> key) {
        super(child, key, POLICY_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public UniqueKey<PolicyConfigRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_DPC;
    }

    @Override
    public List<UniqueKey<PolicyConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<PolicyConfigRecord>>asList(Keys.CONSTRAINT_DPC);
    }

    @Override
    public List<ForeignKey<PolicyConfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PolicyConfigRecord, ?>>asList(Keys.POLICY_CONFIG__FKDC34197CF864C4E43);
    }

    public ResourceServerPolicy resourceServerPolicy() {
        return new ResourceServerPolicy(this, Keys.POLICY_CONFIG__FKDC34197CF864C4E43);
    }

    @Override
    public PolicyConfig as(String alias) {
        return new PolicyConfig(DSL.name(alias), this);
    }

    @Override
    public PolicyConfig as(Name alias) {
        return new PolicyConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PolicyConfig rename(String name) {
        return new PolicyConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PolicyConfig rename(Name name) {
        return new PolicyConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
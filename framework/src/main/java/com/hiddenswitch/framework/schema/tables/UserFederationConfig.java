/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables;


import com.hiddenswitch.framework.schema.Keys;
import com.hiddenswitch.framework.schema.Public;
import com.hiddenswitch.framework.schema.tables.records.UserFederationConfigRecord;

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
public class UserFederationConfig extends TableImpl<UserFederationConfigRecord> {

    private static final long serialVersionUID = 942822036;

    /**
     * The reference instance of <code>public.user_federation_config</code>
     */
    public static final UserFederationConfig USER_FEDERATION_CONFIG = new UserFederationConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserFederationConfigRecord> getRecordType() {
        return UserFederationConfigRecord.class;
    }

    /**
     * The column <code>public.user_federation_config.user_federation_provider_id</code>.
     */
    public final TableField<UserFederationConfigRecord, String> USER_FEDERATION_PROVIDER_ID = createField(DSL.name("user_federation_provider_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.user_federation_config.value</code>.
     */
    public final TableField<UserFederationConfigRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user_federation_config.name</code>.
     */
    public final TableField<UserFederationConfigRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.user_federation_config</code> table reference
     */
    public UserFederationConfig() {
        this(DSL.name("user_federation_config"), null);
    }

    /**
     * Create an aliased <code>public.user_federation_config</code> table reference
     */
    public UserFederationConfig(String alias) {
        this(DSL.name(alias), USER_FEDERATION_CONFIG);
    }

    /**
     * Create an aliased <code>public.user_federation_config</code> table reference
     */
    public UserFederationConfig(Name alias) {
        this(alias, USER_FEDERATION_CONFIG);
    }

    private UserFederationConfig(Name alias, Table<UserFederationConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserFederationConfig(Name alias, Table<UserFederationConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UserFederationConfig(Table<O> child, ForeignKey<O, UserFederationConfigRecord> key) {
        super(child, key, USER_FEDERATION_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<UserFederationConfigRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_F9;
    }

    @Override
    public List<UniqueKey<UserFederationConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<UserFederationConfigRecord>>asList(Keys.CONSTRAINT_F9);
    }

    @Override
    public List<ForeignKey<UserFederationConfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserFederationConfigRecord, ?>>asList(Keys.USER_FEDERATION_CONFIG__FK_T13HPU1J94R2EBPEKR39X5EU5);
    }

    public UserFederationProvider userFederationProvider() {
        return new UserFederationProvider(this, Keys.USER_FEDERATION_CONFIG__FK_T13HPU1J94R2EBPEKR39X5EU5);
    }

    @Override
    public UserFederationConfig as(String alias) {
        return new UserFederationConfig(DSL.name(alias), this);
    }

    @Override
    public UserFederationConfig as(Name alias) {
        return new UserFederationConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserFederationConfig rename(String name) {
        return new UserFederationConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserFederationConfig rename(Name name) {
        return new UserFederationConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

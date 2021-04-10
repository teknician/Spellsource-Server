/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.RealmEnabledEventTypesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class RealmEnabledEventTypes extends TableImpl<RealmEnabledEventTypesRecord> {

    private static final long serialVersionUID = -628445579;

    /**
     * The reference instance of <code>keycloak.realm_enabled_event_types</code>
     */
    public static final RealmEnabledEventTypes REALM_ENABLED_EVENT_TYPES = new RealmEnabledEventTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RealmEnabledEventTypesRecord> getRecordType() {
        return RealmEnabledEventTypesRecord.class;
    }

    /**
     * The column <code>keycloak.realm_enabled_event_types.realm_id</code>.
     */
    public final TableField<RealmEnabledEventTypesRecord, String> REALM_ID = createField(DSL.name("realm_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.realm_enabled_event_types.value</code>.
     */
    public final TableField<RealmEnabledEventTypesRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>keycloak.realm_enabled_event_types</code> table reference
     */
    public RealmEnabledEventTypes() {
        this(DSL.name("realm_enabled_event_types"), null);
    }

    /**
     * Create an aliased <code>keycloak.realm_enabled_event_types</code> table reference
     */
    public RealmEnabledEventTypes(String alias) {
        this(DSL.name(alias), REALM_ENABLED_EVENT_TYPES);
    }

    /**
     * Create an aliased <code>keycloak.realm_enabled_event_types</code> table reference
     */
    public RealmEnabledEventTypes(Name alias) {
        this(alias, REALM_ENABLED_EVENT_TYPES);
    }

    private RealmEnabledEventTypes(Name alias, Table<RealmEnabledEventTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RealmEnabledEventTypes(Name alias, Table<RealmEnabledEventTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RealmEnabledEventTypes(Table<O> child, ForeignKey<O, RealmEnabledEventTypesRecord> key) {
        super(child, key, REALM_ENABLED_EVENT_TYPES);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_REALM_EVT_TYPES_REALM);
    }

    @Override
    public UniqueKey<RealmEnabledEventTypesRecord> getPrimaryKey() {
        return Keys.CONSTR_REALM_ENABL_EVENT_TYPES;
    }

    @Override
    public List<UniqueKey<RealmEnabledEventTypesRecord>> getKeys() {
        return Arrays.<UniqueKey<RealmEnabledEventTypesRecord>>asList(Keys.CONSTR_REALM_ENABL_EVENT_TYPES);
    }

    @Override
    public List<ForeignKey<RealmEnabledEventTypesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RealmEnabledEventTypesRecord, ?>>asList(Keys.REALM_ENABLED_EVENT_TYPES__FK_H846O4H0W8EPX5NWEDRF5Y69J);
    }

    public Realm realm() {
        return new Realm(this, Keys.REALM_ENABLED_EVENT_TYPES__FK_H846O4H0W8EPX5NWEDRF5Y69J);
    }

    @Override
    public RealmEnabledEventTypes as(String alias) {
        return new RealmEnabledEventTypes(DSL.name(alias), this);
    }

    @Override
    public RealmEnabledEventTypes as(Name alias) {
        return new RealmEnabledEventTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RealmEnabledEventTypes rename(String name) {
        return new RealmEnabledEventTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RealmEnabledEventTypes rename(Name name) {
        return new RealmEnabledEventTypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables;


import com.hiddenswitch.framework.schema.Indexes;
import com.hiddenswitch.framework.schema.Keys;
import com.hiddenswitch.framework.schema.Public;
import com.hiddenswitch.framework.schema.tables.records.WebOriginsRecord;

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
public class WebOrigins extends TableImpl<WebOriginsRecord> {

    private static final long serialVersionUID = -1065586655;

    /**
     * The reference instance of <code>public.web_origins</code>
     */
    public static final WebOrigins WEB_ORIGINS = new WebOrigins();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WebOriginsRecord> getRecordType() {
        return WebOriginsRecord.class;
    }

    /**
     * The column <code>public.web_origins.client_id</code>.
     */
    public final TableField<WebOriginsRecord, String> CLIENT_ID = createField(DSL.name("client_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.web_origins.value</code>.
     */
    public final TableField<WebOriginsRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.web_origins</code> table reference
     */
    public WebOrigins() {
        this(DSL.name("web_origins"), null);
    }

    /**
     * Create an aliased <code>public.web_origins</code> table reference
     */
    public WebOrigins(String alias) {
        this(DSL.name(alias), WEB_ORIGINS);
    }

    /**
     * Create an aliased <code>public.web_origins</code> table reference
     */
    public WebOrigins(Name alias) {
        this(alias, WEB_ORIGINS);
    }

    private WebOrigins(Name alias, Table<WebOriginsRecord> aliased) {
        this(alias, aliased, null);
    }

    private WebOrigins(Name alias, Table<WebOriginsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> WebOrigins(Table<O> child, ForeignKey<O, WebOriginsRecord> key) {
        super(child, key, WEB_ORIGINS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_WEB_ORIG_CLIENT);
    }

    @Override
    public UniqueKey<WebOriginsRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_WEB_ORIGINS;
    }

    @Override
    public List<UniqueKey<WebOriginsRecord>> getKeys() {
        return Arrays.<UniqueKey<WebOriginsRecord>>asList(Keys.CONSTRAINT_WEB_ORIGINS);
    }

    @Override
    public List<ForeignKey<WebOriginsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WebOriginsRecord, ?>>asList(Keys.WEB_ORIGINS__FK_LOJPHO213XCX4WNKOG82SSRFY);
    }

    public Client client() {
        return new Client(this, Keys.WEB_ORIGINS__FK_LOJPHO213XCX4WNKOG82SSRFY);
    }

    @Override
    public WebOrigins as(String alias) {
        return new WebOrigins(DSL.name(alias), this);
    }

    @Override
    public WebOrigins as(Name alias) {
        return new WebOrigins(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WebOrigins rename(String name) {
        return new WebOrigins(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WebOrigins rename(Name name) {
        return new WebOrigins(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.records;


import com.hiddenswitch.framework.schema.tables.CompositeRole;
import com.hiddenswitch.framework.schema.tables.interfaces.ICompositeRole;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompositeRoleRecord extends UpdatableRecordImpl<CompositeRoleRecord> implements VertxPojo, Record2<String, String>, ICompositeRole {

    private static final long serialVersionUID = 1395082866;

    /**
     * Setter for <code>public.composite_role.composite</code>.
     */
    @Override
    public CompositeRoleRecord setComposite(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.composite_role.composite</code>.
     */
    @Override
    public String getComposite() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.composite_role.child_role</code>.
     */
    @Override
    public CompositeRoleRecord setChildRole(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.composite_role.child_role</code>.
     */
    @Override
    public String getChildRole() {
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
        return CompositeRole.COMPOSITE_ROLE.COMPOSITE;
    }

    @Override
    public Field<String> field2() {
        return CompositeRole.COMPOSITE_ROLE.CHILD_ROLE;
    }

    @Override
    public String component1() {
        return getComposite();
    }

    @Override
    public String component2() {
        return getChildRole();
    }

    @Override
    public String value1() {
        return getComposite();
    }

    @Override
    public String value2() {
        return getChildRole();
    }

    @Override
    public CompositeRoleRecord value1(String value) {
        setComposite(value);
        return this;
    }

    @Override
    public CompositeRoleRecord value2(String value) {
        setChildRole(value);
        return this;
    }

    @Override
    public CompositeRoleRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICompositeRole from) {
        setComposite(from.getComposite());
        setChildRole(from.getChildRole());
    }

    @Override
    public <E extends ICompositeRole> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompositeRoleRecord
     */
    public CompositeRoleRecord() {
        super(CompositeRole.COMPOSITE_ROLE);
    }

    /**
     * Create a detached, initialised CompositeRoleRecord
     */
    public CompositeRoleRecord(String composite, String childRole) {
        super(CompositeRole.COMPOSITE_ROLE);

        set(0, composite);
        set(1, childRole);
    }

    public CompositeRoleRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

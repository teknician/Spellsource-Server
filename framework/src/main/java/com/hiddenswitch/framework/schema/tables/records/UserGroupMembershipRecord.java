/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.records;


import com.hiddenswitch.framework.schema.tables.UserGroupMembership;
import com.hiddenswitch.framework.schema.tables.interfaces.IUserGroupMembership;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGroupMembershipRecord extends UpdatableRecordImpl<UserGroupMembershipRecord> implements VertxPojo, Record2<String, String>, IUserGroupMembership {

    private static final long serialVersionUID = -1090622786;

    /**
     * Setter for <code>public.user_group_membership.group_id</code>.
     */
    @Override
    public UserGroupMembershipRecord setGroupId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.user_group_membership.group_id</code>.
     */
    @Override
    public String getGroupId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.user_group_membership.user_id</code>.
     */
    @Override
    public UserGroupMembershipRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.user_group_membership.user_id</code>.
     */
    @Override
    public String getUserId() {
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
        return UserGroupMembership.USER_GROUP_MEMBERSHIP.GROUP_ID;
    }

    @Override
    public Field<String> field2() {
        return UserGroupMembership.USER_GROUP_MEMBERSHIP.USER_ID;
    }

    @Override
    public String component1() {
        return getGroupId();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public String value1() {
        return getGroupId();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public UserGroupMembershipRecord value1(String value) {
        setGroupId(value);
        return this;
    }

    @Override
    public UserGroupMembershipRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserGroupMembershipRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserGroupMembership from) {
        setGroupId(from.getGroupId());
        setUserId(from.getUserId());
    }

    @Override
    public <E extends IUserGroupMembership> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserGroupMembershipRecord
     */
    public UserGroupMembershipRecord() {
        super(UserGroupMembership.USER_GROUP_MEMBERSHIP);
    }

    /**
     * Create a detached, initialised UserGroupMembershipRecord
     */
    public UserGroupMembershipRecord(String groupId, String userId) {
        super(UserGroupMembership.USER_GROUP_MEMBERSHIP);

        set(0, groupId);
        set(1, userId);
    }

    public UserGroupMembershipRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

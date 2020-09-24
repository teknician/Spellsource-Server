/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.IUserSessionNote;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSessionNote implements VertxPojo, IUserSessionNote {

    private static final long serialVersionUID = 1569854755;

    private String userSession;
    private String name;
    private String value;

    public UserSessionNote() {}

    public UserSessionNote(IUserSessionNote value) {
        this.userSession = value.getUserSession();
        this.name = value.getName();
        this.value = value.getValue();
    }

    public UserSessionNote(
        String userSession,
        String name,
        String value
    ) {
        this.userSession = userSession;
        this.name = name;
        this.value = value;
    }

    public UserSessionNote(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getUserSession() {
        return this.userSession;
    }

    @Override
    public UserSessionNote setUserSession(String userSession) {
        this.userSession = userSession;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public UserSessionNote setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public UserSessionNote setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserSessionNote (");

        sb.append(userSession);
        sb.append(", ").append(name);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserSessionNote from) {
        setUserSession(from.getUserSession());
        setName(from.getName());
        setValue(from.getValue());
    }

    @Override
    public <E extends IUserSessionNote> E into(E into) {
        into.from(this);
        return into;
    }
}

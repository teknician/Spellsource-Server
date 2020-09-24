/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.IDefaultClientScope;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultClientScope implements VertxPojo, IDefaultClientScope {

    private static final long serialVersionUID = 1562476360;

    private String  realmId;
    private String  scopeId;
    private Boolean defaultScope;

    public DefaultClientScope() {}

    public DefaultClientScope(IDefaultClientScope value) {
        this.realmId = value.getRealmId();
        this.scopeId = value.getScopeId();
        this.defaultScope = value.getDefaultScope();
    }

    public DefaultClientScope(
        String  realmId,
        String  scopeId,
        Boolean defaultScope
    ) {
        this.realmId = realmId;
        this.scopeId = scopeId;
        this.defaultScope = defaultScope;
    }

    public DefaultClientScope(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getRealmId() {
        return this.realmId;
    }

    @Override
    public DefaultClientScope setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    @Override
    public String getScopeId() {
        return this.scopeId;
    }

    @Override
    public DefaultClientScope setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    @Override
    public Boolean getDefaultScope() {
        return this.defaultScope;
    }

    @Override
    public DefaultClientScope setDefaultScope(Boolean defaultScope) {
        this.defaultScope = defaultScope;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DefaultClientScope (");

        sb.append(realmId);
        sb.append(", ").append(scopeId);
        sb.append(", ").append(defaultScope);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IDefaultClientScope from) {
        setRealmId(from.getRealmId());
        setScopeId(from.getScopeId());
        setDefaultScope(from.getDefaultScope());
    }

    @Override
    public <E extends IDefaultClientScope> E into(E into) {
        into.from(this);
        return into;
    }
}

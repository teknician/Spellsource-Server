/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.IIdentityProviderConfig;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IdentityProviderConfig implements VertxPojo, IIdentityProviderConfig {

    private static final long serialVersionUID = -500771098;

    private String identityProviderId;
    private String value;
    private String name;

    public IdentityProviderConfig() {}

    public IdentityProviderConfig(IIdentityProviderConfig value) {
        this.identityProviderId = value.getIdentityProviderId();
        this.value = value.getValue();
        this.name = value.getName();
    }

    public IdentityProviderConfig(
        String identityProviderId,
        String value,
        String name
    ) {
        this.identityProviderId = identityProviderId;
        this.value = value;
        this.name = name;
    }

    public IdentityProviderConfig(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    @Override
    public IdentityProviderConfig setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public IdentityProviderConfig setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IdentityProviderConfig setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IdentityProviderConfig (");

        sb.append(identityProviderId);
        sb.append(", ").append(value);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IIdentityProviderConfig from) {
        setIdentityProviderId(from.getIdentityProviderId());
        setValue(from.getValue());
        setName(from.getName());
    }

    @Override
    public <E extends IIdentityProviderConfig> E into(E into) {
        into.from(this);
        return into;
    }
}

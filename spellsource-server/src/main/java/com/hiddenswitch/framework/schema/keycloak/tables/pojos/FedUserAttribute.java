/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IFedUserAttribute;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FedUserAttribute implements VertxPojo, IFedUserAttribute {

    private static final long serialVersionUID = -86933753;

    private String id;
    private String name;
    private String userId;
    private String realmId;
    private String storageProviderId;
    private String value;

    public FedUserAttribute() {}

    public FedUserAttribute(IFedUserAttribute value) {
        this.id = value.getId();
        this.name = value.getName();
        this.userId = value.getUserId();
        this.realmId = value.getRealmId();
        this.storageProviderId = value.getStorageProviderId();
        this.value = value.getValue();
    }

    public FedUserAttribute(
        String id,
        String name,
        String userId,
        String realmId,
        String storageProviderId,
        String value
    ) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.realmId = realmId;
        this.storageProviderId = storageProviderId;
        this.value = value;
    }

    public FedUserAttribute(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public FedUserAttribute setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public FedUserAttribute setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public FedUserAttribute setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String getRealmId() {
        return this.realmId;
    }

    @Override
    public FedUserAttribute setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    @Override
    public String getStorageProviderId() {
        return this.storageProviderId;
    }

    @Override
    public FedUserAttribute setStorageProviderId(String storageProviderId) {
        this.storageProviderId = storageProviderId;
        return this;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public FedUserAttribute setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FedUserAttribute (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(userId);
        sb.append(", ").append(realmId);
        sb.append(", ").append(storageProviderId);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFedUserAttribute from) {
        setId(from.getId());
        setName(from.getName());
        setUserId(from.getUserId());
        setRealmId(from.getRealmId());
        setStorageProviderId(from.getStorageProviderId());
        setValue(from.getValue());
    }

    @Override
    public <E extends IFedUserAttribute> E into(E into) {
        into.from(this);
        return into;
    }
}
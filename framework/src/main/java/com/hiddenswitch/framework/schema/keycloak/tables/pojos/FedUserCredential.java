/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IFedUserCredential;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FedUserCredential implements VertxPojo, IFedUserCredential {

    private static final long serialVersionUID = -921740125;

    private String  id;
    private byte[]  salt;
    private String  type;
    private Long    createdDate;
    private String  userId;
    private String  realmId;
    private String  storageProviderId;
    private String  userLabel;
    private String  secretData;
    private String  credentialData;
    private Integer priority;

    public FedUserCredential() {}

    public FedUserCredential(IFedUserCredential value) {
        this.id = value.getId();
        this.salt = value.getSalt();
        this.type = value.getType();
        this.createdDate = value.getCreatedDate();
        this.userId = value.getUserId();
        this.realmId = value.getRealmId();
        this.storageProviderId = value.getStorageProviderId();
        this.userLabel = value.getUserLabel();
        this.secretData = value.getSecretData();
        this.credentialData = value.getCredentialData();
        this.priority = value.getPriority();
    }

    public FedUserCredential(
        String  id,
        byte[]  salt,
        String  type,
        Long    createdDate,
        String  userId,
        String  realmId,
        String  storageProviderId,
        String  userLabel,
        String  secretData,
        String  credentialData,
        Integer priority
    ) {
        this.id = id;
        this.salt = salt;
        this.type = type;
        this.createdDate = createdDate;
        this.userId = userId;
        this.realmId = realmId;
        this.storageProviderId = storageProviderId;
        this.userLabel = userLabel;
        this.secretData = secretData;
        this.credentialData = credentialData;
        this.priority = priority;
    }

    public FedUserCredential(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public FedUserCredential setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public byte[] getSalt() {
        return this.salt;
    }

    @Override
    public FedUserCredential setSalt(byte[] salt) {
        this.salt = salt;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public FedUserCredential setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public Long getCreatedDate() {
        return this.createdDate;
    }

    @Override
    public FedUserCredential setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public FedUserCredential setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String getRealmId() {
        return this.realmId;
    }

    @Override
    public FedUserCredential setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    @Override
    public String getStorageProviderId() {
        return this.storageProviderId;
    }

    @Override
    public FedUserCredential setStorageProviderId(String storageProviderId) {
        this.storageProviderId = storageProviderId;
        return this;
    }

    @Override
    public String getUserLabel() {
        return this.userLabel;
    }

    @Override
    public FedUserCredential setUserLabel(String userLabel) {
        this.userLabel = userLabel;
        return this;
    }

    @Override
    public String getSecretData() {
        return this.secretData;
    }

    @Override
    public FedUserCredential setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }

    @Override
    public String getCredentialData() {
        return this.credentialData;
    }

    @Override
    public FedUserCredential setCredentialData(String credentialData) {
        this.credentialData = credentialData;
        return this;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public FedUserCredential setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FedUserCredential (");

        sb.append(id);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(type);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(userId);
        sb.append(", ").append(realmId);
        sb.append(", ").append(storageProviderId);
        sb.append(", ").append(userLabel);
        sb.append(", ").append(secretData);
        sb.append(", ").append(credentialData);
        sb.append(", ").append(priority);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFedUserCredential from) {
        setId(from.getId());
        setSalt(from.getSalt());
        setType(from.getType());
        setCreatedDate(from.getCreatedDate());
        setUserId(from.getUserId());
        setRealmId(from.getRealmId());
        setStorageProviderId(from.getStorageProviderId());
        setUserLabel(from.getUserLabel());
        setSecretData(from.getSecretData());
        setCredentialData(from.getCredentialData());
        setPriority(from.getPriority());
    }

    @Override
    public <E extends IFedUserCredential> E into(E into) {
        into.from(this);
        return into;
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.pojos;


import com.hiddenswitch.framework.schema.spellsource.tables.interfaces.ICards;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonObject;

import java.time.OffsetDateTime;

import org.w3c.dom.Element;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cards implements VertxPojo, ICards {

    private static final long serialVersionUID = 324451773;

    private String         id;
    private String         createdBy;
    private String         uri;
    private Element        blocklyWorkspace;
    private JsonObject     cardScript;
    private OffsetDateTime createdAt;
    private OffsetDateTime lastModified;

    public Cards() {}

    public Cards(ICards value) {
        this.id = value.getId();
        this.createdBy = value.getCreatedBy();
        this.uri = value.getUri();
        this.blocklyWorkspace = value.getBlocklyWorkspace();
        this.cardScript = value.getCardScript();
        this.createdAt = value.getCreatedAt();
        this.lastModified = value.getLastModified();
    }

    public Cards(
        String         id,
        String         createdBy,
        String         uri,
        Element        blocklyWorkspace,
        JsonObject     cardScript,
        OffsetDateTime createdAt,
        OffsetDateTime lastModified
    ) {
        this.id = id;
        this.createdBy = createdBy;
        this.uri = uri;
        this.blocklyWorkspace = blocklyWorkspace;
        this.cardScript = cardScript;
        this.createdAt = createdAt;
        this.lastModified = lastModified;
    }

    public Cards(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Cards setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public Cards setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public String getUri() {
        return this.uri;
    }

    @Override
    public Cards setUri(String uri) {
        this.uri = uri;
        return this;
    }

    @Override
    public Element getBlocklyWorkspace() {
        return this.blocklyWorkspace;
    }

    @Override
    public Cards setBlocklyWorkspace(Element blocklyWorkspace) {
        this.blocklyWorkspace = blocklyWorkspace;
        return this;
    }

    @Override
    public JsonObject getCardScript() {
        return this.cardScript;
    }

    @Override
    public Cards setCardScript(JsonObject cardScript) {
        this.cardScript = cardScript;
        return this;
    }

    @Override
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Cards setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }

    @Override
    public Cards setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cards (");

        sb.append(id);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(uri);
        sb.append(", ").append(blocklyWorkspace);
        sb.append(", ").append(cardScript);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastModified);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICards from) {
        setId(from.getId());
        setCreatedBy(from.getCreatedBy());
        setUri(from.getUri());
        setBlocklyWorkspace(from.getBlocklyWorkspace());
        setCardScript(from.getCardScript());
        setCreatedAt(from.getCreatedAt());
        setLastModified(from.getLastModified());
    }

    @Override
    public <E extends ICards> E into(E into) {
        into.from(this);
        return into;
    }
}
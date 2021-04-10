/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.pojos;


import com.hiddenswitch.framework.schema.spellsource.tables.interfaces.IDecks;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Decks implements VertxPojo, IDecks {

    private static final long serialVersionUID = -2146551399;

    private String  id;
    private String  createdBy;
    private String  lastEditedBy;
    private String  name;
    private String  heroClass;
    private Boolean trashed;
    private String  format;
    private Integer deckType;
    private Boolean isPremade;
    private Boolean permittedToDuplicate;

    public Decks() {}

    public Decks(IDecks value) {
        this.id = value.getId();
        this.createdBy = value.getCreatedBy();
        this.lastEditedBy = value.getLastEditedBy();
        this.name = value.getName();
        this.heroClass = value.getHeroClass();
        this.trashed = value.getTrashed();
        this.format = value.getFormat();
        this.deckType = value.getDeckType();
        this.isPremade = value.getIsPremade();
        this.permittedToDuplicate = value.getPermittedToDuplicate();
    }

    public Decks(
        String  id,
        String  createdBy,
        String  lastEditedBy,
        String  name,
        String  heroClass,
        Boolean trashed,
        String  format,
        Integer deckType,
        Boolean isPremade,
        Boolean permittedToDuplicate
    ) {
        this.id = id;
        this.createdBy = createdBy;
        this.lastEditedBy = lastEditedBy;
        this.name = name;
        this.heroClass = heroClass;
        this.trashed = trashed;
        this.format = format;
        this.deckType = deckType;
        this.isPremade = isPremade;
        this.permittedToDuplicate = permittedToDuplicate;
    }

    public Decks(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Decks setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public Decks setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public String getLastEditedBy() {
        return this.lastEditedBy;
    }

    @Override
    public Decks setLastEditedBy(String lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Decks setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getHeroClass() {
        return this.heroClass;
    }

    @Override
    public Decks setHeroClass(String heroClass) {
        this.heroClass = heroClass;
        return this;
    }

    @Override
    public Boolean getTrashed() {
        return this.trashed;
    }

    @Override
    public Decks setTrashed(Boolean trashed) {
        this.trashed = trashed;
        return this;
    }

    @Override
    public String getFormat() {
        return this.format;
    }

    @Override
    public Decks setFormat(String format) {
        this.format = format;
        return this;
    }

    @Override
    public Integer getDeckType() {
        return this.deckType;
    }

    @Override
    public Decks setDeckType(Integer deckType) {
        this.deckType = deckType;
        return this;
    }

    @Override
    public Boolean getIsPremade() {
        return this.isPremade;
    }

    @Override
    public Decks setIsPremade(Boolean isPremade) {
        this.isPremade = isPremade;
        return this;
    }

    @Override
    public Boolean getPermittedToDuplicate() {
        return this.permittedToDuplicate;
    }

    @Override
    public Decks setPermittedToDuplicate(Boolean permittedToDuplicate) {
        this.permittedToDuplicate = permittedToDuplicate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Decks (");

        sb.append(id);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastEditedBy);
        sb.append(", ").append(name);
        sb.append(", ").append(heroClass);
        sb.append(", ").append(trashed);
        sb.append(", ").append(format);
        sb.append(", ").append(deckType);
        sb.append(", ").append(isPremade);
        sb.append(", ").append(permittedToDuplicate);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IDecks from) {
        setId(from.getId());
        setCreatedBy(from.getCreatedBy());
        setLastEditedBy(from.getLastEditedBy());
        setName(from.getName());
        setHeroClass(from.getHeroClass());
        setTrashed(from.getTrashed());
        setFormat(from.getFormat());
        setDeckType(from.getDeckType());
        setIsPremade(from.getIsPremade());
        setPermittedToDuplicate(from.getPermittedToDuplicate());
    }

    @Override
    public <E extends IDecks> E into(E into) {
        into.from(this);
        return into;
    }
}
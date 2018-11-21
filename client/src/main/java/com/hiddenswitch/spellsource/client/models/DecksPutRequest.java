/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services. 
 *
 * OpenAPI spec version: 2.1.0
 * Contact: ben@hiddenswitch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * This request allows a user to specify a decklist or deck properies for creating a new deck. Whenever a deck list is specified (non-null and not equal to the empty string), the deck list will be preferred. Decks created without a deck list may have no properties specified, and the deck will still be successfully created. 
 */
@ApiModel(description = "This request allows a user to specify a decklist or deck properies for creating a new deck. Whenever a deck list is specified (non-null and not equal to the empty string), the deck list will be preferred. Decks created without a deck list may have no properties specified, and the deck will still be successfully created. ")

public class DecksPutRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A valid hero class for creating the deck. The appropriate hero card will be chosen for this deck unless otherwise specified. 
   */
  public enum HeroClassEnum {
    BROWN("BROWN"),
    
    GREEN("GREEN"),
    
    BLUE("BLUE"),
    
    GOLD("GOLD"),
    
    WHITE("WHITE"),
    
    BLACK("BLACK"),
    
    SILVER("SILVER"),
    
    VIOLET("VIOLET"),
    
    RED("RED"),
    
    JADE("JADE"),
    
    NAVY("NAVY"),
    
    LEATHER("LEATHER"),
    
    RUST("RUST"),
    
    EGGPLANT("EGGPLANT"),
    
    ICE("ICE"),
    
    OBSIDIAN("OBSIDIAN"),
    
    AMBER("AMBER"),
    
    TOAST("TOAST");

    private String value;

    HeroClassEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HeroClassEnum fromValue(String text) {
      for (HeroClassEnum b : HeroClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("heroClass")
  private HeroClassEnum heroClass = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("inventoryIds")
  private List<String> inventoryIds = null;

  /**
   * The format of this deck. Format specifies which cards are allowable in this deck for validation. It also specifies which cards will appear in discovers during matchmaking.  Currenly, matchmaking occurs between decks of all formats, regardless of your choice of format. The smallest possible format encompassing both decks in a match is selected when the formats of the decks do not match.  Certain queues only support certain formats. Typically, when requesting the listing of queues with matchmakingGet, the queues will specify which current decks can be chosen. 
   */
  public enum FormatEnum {
    STANDARD("Standard"),
    
    WILD("Wild"),
    
    CUSTOM("Custom"),
    
    SPELLSOURCE("Spellsource"),
    
    ALL("All");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("format")
  private FormatEnum format = null;

  @JsonProperty("deckList")
  private String deckList = null;

  public DecksPutRequest heroClass(HeroClassEnum heroClass) {
    this.heroClass = heroClass;
    return this;
  }

   /**
   * A valid hero class for creating the deck. The appropriate hero card will be chosen for this deck unless otherwise specified. 
   * @return heroClass
  **/
  @ApiModelProperty(value = "A valid hero class for creating the deck. The appropriate hero card will be chosen for this deck unless otherwise specified. ")
  public HeroClassEnum getHeroClass() {
    return heroClass;
  }

  public void setHeroClass(HeroClassEnum heroClass) {
    this.heroClass = heroClass;
  }

  public DecksPutRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the deck as it will appear in the collections view. Typically, your opponent will not be able to see this name.  Some custom cards interact with specific named decks in your collection. For those purposes, the deck names are case sensitive. When multiple decks share a name, one will be chosen arbitrarily (not at random). 
   * @return name
  **/
  @ApiModelProperty(value = "The name of the deck as it will appear in the collections view. Typically, your opponent will not be able to see this name.  Some custom cards interact with specific named decks in your collection. For those purposes, the deck names are case sensitive. When multiple decks share a name, one will be chosen arbitrarily (not at random). ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DecksPutRequest inventoryIds(List<String> inventoryIds) {
    this.inventoryIds = inventoryIds;
    return this;
  }

  public DecksPutRequest addInventoryIdsItem(String inventoryIdsItem) {
    if (this.inventoryIds == null) {
      this.inventoryIds = new ArrayList<>();
    }
    this.inventoryIds.add(inventoryIdsItem);
    return this;
  }

   /**
   * Get inventoryIds
   * @return inventoryIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getInventoryIds() {
    return inventoryIds;
  }

  public void setInventoryIds(List<String> inventoryIds) {
    this.inventoryIds = inventoryIds;
  }

  public DecksPutRequest format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * The format of this deck. Format specifies which cards are allowable in this deck for validation. It also specifies which cards will appear in discovers during matchmaking.  Currenly, matchmaking occurs between decks of all formats, regardless of your choice of format. The smallest possible format encompassing both decks in a match is selected when the formats of the decks do not match.  Certain queues only support certain formats. Typically, when requesting the listing of queues with matchmakingGet, the queues will specify which current decks can be chosen. 
   * @return format
  **/
  @ApiModelProperty(value = "The format of this deck. Format specifies which cards are allowable in this deck for validation. It also specifies which cards will appear in discovers during matchmaking.  Currenly, matchmaking occurs between decks of all formats, regardless of your choice of format. The smallest possible format encompassing both decks in a match is selected when the formats of the decks do not match.  Certain queues only support certain formats. Typically, when requesting the listing of queues with matchmakingGet, the queues will specify which current decks can be chosen. ")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public DecksPutRequest deckList(String deckList) {
    this.deckList = deckList;
    return this;
  }

   /**
   * A community-standard decklist. 
   * @return deckList
  **/
  @ApiModelProperty(value = "A community-standard decklist. ")
  public String getDeckList() {
    return deckList;
  }

  public void setDeckList(String deckList) {
    this.deckList = deckList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecksPutRequest decksPutRequest = (DecksPutRequest) o;
    return Objects.equals(this.heroClass, decksPutRequest.heroClass) &&
        Objects.equals(this.name, decksPutRequest.name) &&
        Objects.equals(this.inventoryIds, decksPutRequest.inventoryIds) &&
        Objects.equals(this.format, decksPutRequest.format) &&
        Objects.equals(this.deckList, decksPutRequest.deckList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heroClass, name, inventoryIds, format, deckList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecksPutRequest {\n");
    
    sb.append("    heroClass: ").append(toIndentedString(heroClass)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inventoryIds: ").append(toIndentedString(inventoryIds)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    deckList: ").append(toIndentedString(deckList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


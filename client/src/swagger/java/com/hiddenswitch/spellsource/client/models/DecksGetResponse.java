/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 4.0.1
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
import com.hiddenswitch.spellsource.client.models.InventoryCollection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * DecksGetResponse
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class DecksGetResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("collection")
  private InventoryCollection collection = null;

  @JsonProperty("inventoryIdsSize")
  private Integer inventoryIdsSize = null;

  public DecksGetResponse collection(InventoryCollection collection) {
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @ApiModelProperty(value = "")
  public InventoryCollection getCollection() {
    return collection;
  }

  public void setCollection(InventoryCollection collection) {
    this.collection = collection;
  }

  public DecksGetResponse inventoryIdsSize(Integer inventoryIdsSize) {
    this.inventoryIdsSize = inventoryIdsSize;
    return this;
  }

   /**
   * The current number of cards in this deck. 
   * @return inventoryIdsSize
  **/
  @ApiModelProperty(value = "The current number of cards in this deck. ")
  public Integer getInventoryIdsSize() {
    return inventoryIdsSize;
  }

  public void setInventoryIdsSize(Integer inventoryIdsSize) {
    this.inventoryIdsSize = inventoryIdsSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecksGetResponse decksGetResponse = (DecksGetResponse) o;
    return Objects.equals(this.collection, decksGetResponse.collection) &&
        Objects.equals(this.inventoryIdsSize, decksGetResponse.inventoryIdsSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, inventoryIdsSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecksGetResponse {\n");
    
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    inventoryIdsSize: ").append(toIndentedString(inventoryIdsSize)).append("\n");
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

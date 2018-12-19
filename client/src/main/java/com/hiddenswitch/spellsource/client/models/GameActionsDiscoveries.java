/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services. 
 *
 * OpenAPI spec version: 4.0.0
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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Card IDs and their corresponding action indices. 
 */
@ApiModel(description = "Card IDs and their corresponding action indices. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class GameActionsDiscoveries implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cardId")
  private Integer cardId = null;

  @JsonProperty("action")
  private Integer action = null;

  public GameActionsDiscoveries cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @ApiModelProperty(value = "")
  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  public GameActionsDiscoveries action(Integer action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public Integer getAction() {
    return action;
  }

  public void setAction(Integer action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameActionsDiscoveries gameActionsDiscoveries = (GameActionsDiscoveries) o;
    return Objects.equals(this.cardId, gameActionsDiscoveries.cardId) &&
        Objects.equals(this.action, gameActionsDiscoveries.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameActionsDiscoveries {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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


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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Indicates that a record has been removed from the client&#39;s ephemeral collections. 
 */
@ApiModel(description = "Indicates that a record has been removed from the client's ephemeral collections. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class EnvelopeRemoved implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("inviteId")
  private String inviteId = null;

  @JsonProperty("matchId")
  private String matchId = null;

  @JsonProperty("friendId")
  private String friendId = null;

  public EnvelopeRemoved inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

   /**
   * The unique ID of the invitation that should be removed. 
   * @return inviteId
  **/
  @ApiModelProperty(value = "The unique ID of the invitation that should be removed. ")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public EnvelopeRemoved matchId(String matchId) {
    this.matchId = matchId;
    return this;
  }

   /**
   * The unique ID of the match that should be removed. 
   * @return matchId
  **/
  @ApiModelProperty(value = "The unique ID of the match that should be removed. ")
  public String getMatchId() {
    return matchId;
  }

  public void setMatchId(String matchId) {
    this.matchId = matchId;
  }

  public EnvelopeRemoved friendId(String friendId) {
    this.friendId = friendId;
    return this;
  }

   /**
   * The unique ID of the friend that should be removed, 
   * @return friendId
  **/
  @ApiModelProperty(value = "The unique ID of the friend that should be removed, ")
  public String getFriendId() {
    return friendId;
  }

  public void setFriendId(String friendId) {
    this.friendId = friendId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeRemoved envelopeRemoved = (EnvelopeRemoved) o;
    return Objects.equals(this.inviteId, envelopeRemoved.inviteId) &&
        Objects.equals(this.matchId, envelopeRemoved.matchId) &&
        Objects.equals(this.friendId, envelopeRemoved.friendId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteId, matchId, friendId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeRemoved {\n");
    
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    friendId: ").append(toIndentedString(friendId)).append("\n");
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


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
import com.hiddenswitch.spellsource.client.models.EntityChangeSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The forward and backword deltas (change sets) required (along with player &#x60;GameState&#x60;s) to transition the client battlefield. 
 */
@ApiModel(description = "The forward and backword deltas (change sets) required (along with player `GameState`s) to transition the client battlefield. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class ReplayDeltas implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("backward")
  private EntityChangeSet backward = null;

  @JsonProperty("forward")
  private EntityChangeSet forward = null;

  public ReplayDeltas backward(EntityChangeSet backward) {
    this.backward = backward;
    return this;
  }

   /**
   * Backward delta. 
   * @return backward
  **/
  @ApiModelProperty(value = "Backward delta. ")
  public EntityChangeSet getBackward() {
    return backward;
  }

  public void setBackward(EntityChangeSet backward) {
    this.backward = backward;
  }

  public ReplayDeltas forward(EntityChangeSet forward) {
    this.forward = forward;
    return this;
  }

   /**
   * Forward delta. 
   * @return forward
  **/
  @ApiModelProperty(value = "Forward delta. ")
  public EntityChangeSet getForward() {
    return forward;
  }

  public void setForward(EntityChangeSet forward) {
    this.forward = forward;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayDeltas replayDeltas = (ReplayDeltas) o;
    return Objects.equals(this.backward, replayDeltas.backward) &&
        Objects.equals(this.forward, replayDeltas.forward);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backward, forward);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayDeltas {\n");
    
    sb.append("    backward: ").append(toIndentedString(backward)).append("\n");
    sb.append("    forward: ").append(toIndentedString(forward)).append("\n");
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


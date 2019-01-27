/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 3.0.3
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
import com.hiddenswitch.spellsource.client.models.ReplayDeltas;
import com.hiddenswitch.spellsource.client.models.ReplayGameStates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Description of a (possibly partially complete) match. Useful for viewing said match in retrospect. Note: If there are &#x60;n&#x60; elements in &#x60;gameStates&#x60; then there should be &#x60;n-1&#x60; elements in &#x60;deltas&#x60;. 
 */
@ApiModel(description = "Description of a (possibly partially complete) match. Useful for viewing said match in retrospect. Note: If there are `n` elements in `gameStates` then there should be `n-1` elements in `deltas`. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Replay implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("gameStates")
  private List<ReplayGameStates> gameStates = null;

  @JsonProperty("deltas")
  private List<ReplayDeltas> deltas = null;

  public Replay gameStates(List<ReplayGameStates> gameStates) {
    this.gameStates = gameStates;
    return this;
  }

  public Replay addGameStatesItem(ReplayGameStates gameStatesItem) {
    if (this.gameStates == null) {
      this.gameStates = new ArrayList<>();
    }
    this.gameStates.add(gameStatesItem);
    return this;
  }

   /**
   * Get gameStates
   * @return gameStates
  **/
  @ApiModelProperty(value = "")
  public List<ReplayGameStates> getGameStates() {
    return gameStates;
  }

  public void setGameStates(List<ReplayGameStates> gameStates) {
    this.gameStates = gameStates;
  }

  public Replay deltas(List<ReplayDeltas> deltas) {
    this.deltas = deltas;
    return this;
  }

  public Replay addDeltasItem(ReplayDeltas deltasItem) {
    if (this.deltas == null) {
      this.deltas = new ArrayList<>();
    }
    this.deltas.add(deltasItem);
    return this;
  }

   /**
   * Get deltas
   * @return deltas
  **/
  @ApiModelProperty(value = "")
  public List<ReplayDeltas> getDeltas() {
    return deltas;
  }

  public void setDeltas(List<ReplayDeltas> deltas) {
    this.deltas = deltas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Replay replay = (Replay) o;
    return Objects.equals(this.gameStates, replay.gameStates) &&
        Objects.equals(this.deltas, replay.deltas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameStates, deltas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Replay {\n");
    
    sb.append("    gameStates: ").append(toIndentedString(gameStates)).append("\n");
    sb.append("    deltas: ").append(toIndentedString(deltas)).append("\n");
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


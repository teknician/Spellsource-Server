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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * DraftsChooseCardRequest
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class DraftsChooseCardRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cardIndex")
  private Integer cardIndex = null;

  public DraftsChooseCardRequest cardIndex(Integer cardIndex) {
    this.cardIndex = cardIndex;
    return this;
  }

   /**
   * Get cardIndex
   * @return cardIndex
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCardIndex() {
    return cardIndex;
  }

  public void setCardIndex(Integer cardIndex) {
    this.cardIndex = cardIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftsChooseCardRequest draftsChooseCardRequest = (DraftsChooseCardRequest) o;
    return Objects.equals(this.cardIndex, draftsChooseCardRequest.cardIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftsChooseCardRequest {\n");
    
    sb.append("    cardIndex: ").append(toIndentedString(cardIndex)).append("\n");
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


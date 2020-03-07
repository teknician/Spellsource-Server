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
 * Upserts and draws a card with the specified JSON representation.  Only available in bot games. 
 */
@ApiModel(description = "Upserts and draws a card with the specified JSON representation.  Only available in bot games. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class EnvelopeMethodPutCard implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("editableCardId")
  private String editableCardId = null;

  @JsonProperty("draw")
  private Boolean draw = null;

  @JsonProperty("source")
  private String source = null;

  public EnvelopeMethodPutCard editableCardId(String editableCardId) {
    this.editableCardId = editableCardId;
    return this;
  }

   /**
   * The editable card record ID, or null if one should be created. 
   * @return editableCardId
  **/
  @ApiModelProperty(value = "The editable card record ID, or null if one should be created. ")
  public String getEditableCardId() {
    return editableCardId;
  }

  public void setEditableCardId(String editableCardId) {
    this.editableCardId = editableCardId;
  }

  public EnvelopeMethodPutCard draw(Boolean draw) {
    this.draw = draw;
    return this;
  }

   /**
   * When true, indicates that the editor should draw the card in a live game, if there is one. 
   * @return draw
  **/
  @ApiModelProperty(value = "When true, indicates that the editor should draw the card in a live game, if there is one. ")
  public Boolean isDraw() {
    return draw;
  }

  public void setDraw(Boolean draw) {
    this.draw = draw;
  }

  public EnvelopeMethodPutCard source(String source) {
    this.source = source;
    return this;
  }

   /**
   * A JSON-formatted specification for the card.  The ID is auto-generated and ignored, which means drawing tokens at the moment is not supported. 
   * @return source
  **/
  @ApiModelProperty(value = "A JSON-formatted specification for the card.  The ID is auto-generated and ignored, which means drawing tokens at the moment is not supported. ")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeMethodPutCard envelopeMethodPutCard = (EnvelopeMethodPutCard) o;
    return Objects.equals(this.editableCardId, envelopeMethodPutCard.editableCardId) &&
        Objects.equals(this.draw, envelopeMethodPutCard.draw) &&
        Objects.equals(this.source, envelopeMethodPutCard.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editableCardId, draw, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeMethodPutCard {\n");
    
    sb.append("    editableCardId: ").append(toIndentedString(editableCardId)).append("\n");
    sb.append("    draw: ").append(toIndentedString(draw)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


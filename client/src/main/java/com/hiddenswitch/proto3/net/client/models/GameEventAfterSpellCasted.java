/**
 * Hidden Switch Minionate API
 * The Minionate API for matchmaking, user accounts, collections management and more
 *
 * OpenAPI spec version: 1.0.1
 * Contact: benjamin.s.berman@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hiddenswitch.proto3.net.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.hiddenswitch.proto3.net.client.models.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GameEventAfterSpellCasted
 */

public class GameEventAfterSpellCasted  implements Serializable {
  @SerializedName("sourceCard")
  private Entity sourceCard = null;

  @SerializedName("spellTarget")
  private Entity spellTarget = null;

  public GameEventAfterSpellCasted sourceCard(Entity sourceCard) {
    this.sourceCard = sourceCard;
    return this;
  }

   /**
   * Get sourceCard
   * @return sourceCard
  **/
  @ApiModelProperty(example = "null", value = "")
  public Entity getSourceCard() {
    return sourceCard;
  }

  public void setSourceCard(Entity sourceCard) {
    this.sourceCard = sourceCard;
  }

  public GameEventAfterSpellCasted spellTarget(Entity spellTarget) {
    this.spellTarget = spellTarget;
    return this;
  }

   /**
   * Get spellTarget
   * @return spellTarget
  **/
  @ApiModelProperty(example = "null", value = "")
  public Entity getSpellTarget() {
    return spellTarget;
  }

  public void setSpellTarget(Entity spellTarget) {
    this.spellTarget = spellTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameEventAfterSpellCasted gameEventAfterSpellCasted = (GameEventAfterSpellCasted) o;
    return Objects.equals(this.sourceCard, gameEventAfterSpellCasted.sourceCard) &&
        Objects.equals(this.spellTarget, gameEventAfterSpellCasted.spellTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCard, spellTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameEventAfterSpellCasted {\n");
    
    sb.append("    sourceCard: ").append(toIndentedString(sourceCard)).append("\n");
    sb.append("    spellTarget: ").append(toIndentedString(spellTarget)).append("\n");
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


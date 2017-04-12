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
import com.hiddenswitch.proto3.net.client.models.JavaSerializationObject;
import com.hiddenswitch.proto3.net.client.models.MatchmakingQueuePutRequest;
import com.hiddenswitch.proto3.net.client.models.MatchmakingQueuePutResponseUnityConnection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MatchmakingQueuePutResponse
 */

public class MatchmakingQueuePutResponse  implements Serializable {
  @SerializedName("connection")
  private JavaSerializationObject connection = null;

  @SerializedName("unityConnection")
  private MatchmakingQueuePutResponseUnityConnection unityConnection = null;

  @SerializedName("retry")
  private MatchmakingQueuePutRequest retry = null;

  public MatchmakingQueuePutResponse connection(JavaSerializationObject connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @ApiModelProperty(example = "null", value = "")
  public JavaSerializationObject getConnection() {
    return connection;
  }

  public void setConnection(JavaSerializationObject connection) {
    this.connection = connection;
  }

  public MatchmakingQueuePutResponse unityConnection(MatchmakingQueuePutResponseUnityConnection unityConnection) {
    this.unityConnection = unityConnection;
    return this;
  }

   /**
   * Get unityConnection
   * @return unityConnection
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchmakingQueuePutResponseUnityConnection getUnityConnection() {
    return unityConnection;
  }

  public void setUnityConnection(MatchmakingQueuePutResponseUnityConnection unityConnection) {
    this.unityConnection = unityConnection;
  }

  public MatchmakingQueuePutResponse retry(MatchmakingQueuePutRequest retry) {
    this.retry = retry;
    return this;
  }

   /**
   * Get retry
   * @return retry
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchmakingQueuePutRequest getRetry() {
    return retry;
  }

  public void setRetry(MatchmakingQueuePutRequest retry) {
    this.retry = retry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchmakingQueuePutResponse matchmakingQueuePutResponse = (MatchmakingQueuePutResponse) o;
    return Objects.equals(this.connection, matchmakingQueuePutResponse.connection) &&
        Objects.equals(this.unityConnection, matchmakingQueuePutResponse.unityConnection) &&
        Objects.equals(this.retry, matchmakingQueuePutResponse.retry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection, unityConnection, retry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchmakingQueuePutResponse {\n");
    
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    unityConnection: ").append(toIndentedString(unityConnection)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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


package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class IdenticaRequest  {
  
  private String identicaServer = null;
  private String clientId = null;
  private String userId = null;
  private String serialId = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("identicaServer")
  public String getIdenticaServer() {
    return identicaServer;
  }
  public void setIdenticaServer(String identicaServer) {
    this.identicaServer = identicaServer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("serialId")
  public String getSerialId() {
    return serialId;
  }
  public void setSerialId(String serialId) {
    this.serialId = serialId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaRequest {\n");
    
    sb.append("  identicaServer: ").append(identicaServer).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  serialId: ").append(serialId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

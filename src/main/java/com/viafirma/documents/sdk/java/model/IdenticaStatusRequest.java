package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class IdenticaStatusRequest  {
  
  private String requestId = null;
  private String identicaServer = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaStatusRequest {\n");
    
    sb.append("  requestId: ").append(requestId).append("\n");
    sb.append("  identicaServer: ").append(identicaServer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

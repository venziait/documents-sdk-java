package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.IdenticaOperationStatus;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class IdenticaStatusResult  {
  
  private IdenticaOperationStatus operationStatus = null;
  private String responseCode = null;
  private String responseMessage = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("operationStatus")
  public IdenticaOperationStatus getOperationStatus() {
    return operationStatus;
  }
  public void setOperationStatus(IdenticaOperationStatus operationStatus) {
    this.operationStatus = operationStatus;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("responseCode")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("responseMessage")
  public String getResponseMessage() {
    return responseMessage;
  }
  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaStatusResult {\n");
    
    sb.append("  operationStatus: ").append(operationStatus).append("\n");
    sb.append("  responseCode: ").append(responseCode).append("\n");
    sb.append("  responseMessage: ").append(responseMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

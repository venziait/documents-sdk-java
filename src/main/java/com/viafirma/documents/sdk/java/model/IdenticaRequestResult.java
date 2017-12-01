package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class IdenticaRequestResult  {
  
  private String responseMessage = null;
  private String responseCode = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaRequestResult {\n");
    
    sb.append("  responseMessage: ").append(responseMessage).append("\n");
    sb.append("  responseCode: ").append(responseCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

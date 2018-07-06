package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class CallbackUrl  {
  
  private String messageCode = null;
  private String url = null;
  private String authorization = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("authorization")
  public String getAuthorization() {
    return authorization;
  }
  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackUrl {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  authorization: ").append(authorization).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

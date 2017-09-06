package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class DataToPrepareSign  {
  
  private String signatureId = null;
  private String messageCode = null;
  private String publicKey = null;

  
  /**
   * (since 3.5.0) signature id
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) signature id")
  @JsonProperty("signatureId")
  public String getSignatureId() {
    return signatureId;
  }
  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }

  
  /**
   * (since 3.5.0) message code
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) message code")
  @JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   * (since 3.5.0) public key
   **/
  @ApiModelProperty(required = true, value = "(since 3.5.0) public key")
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataToPrepareSign {\n");
    
    sb.append("  signatureId: ").append(signatureId).append("\n");
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class NotificationResend  {
  
  private String messageCode = null;
  private String email = null;
  private String phone = null;

  
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
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationResend {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

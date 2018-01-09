package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Customization  {
  
  private String mailFrom = null;
  private String smsFrom = null;
  private String requestMailSubject = null;
  private String requestMailBody = null;
  private String requestSmsBody = null;
  private String callbackMailSuccessSubject = null;
  private String callbackMailSuccessBody = null;
  private String callbackMailExpiredSubject = null;
  private String callbackMailExpiredBody = null;
  private String callbackMailRejectedSubject = null;
  private String callbackMailRejectedBody = null;
  private String callbackMailErrorSubject = null;
  private String callbackMailErrorBody = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("mailFrom")
  public String getMailFrom() {
    return mailFrom;
  }
  public void setMailFrom(String mailFrom) {
    this.mailFrom = mailFrom;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("smsFrom")
  public String getSmsFrom() {
    return smsFrom;
  }
  public void setSmsFrom(String smsFrom) {
    this.smsFrom = smsFrom;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("requestMailSubject")
  public String getRequestMailSubject() {
    return requestMailSubject;
  }
  public void setRequestMailSubject(String requestMailSubject) {
    this.requestMailSubject = requestMailSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("requestMailBody")
  public String getRequestMailBody() {
    return requestMailBody;
  }
  public void setRequestMailBody(String requestMailBody) {
    this.requestMailBody = requestMailBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("requestSmsBody")
  public String getRequestSmsBody() {
    return requestSmsBody;
  }
  public void setRequestSmsBody(String requestSmsBody) {
    this.requestSmsBody = requestSmsBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailSuccessSubject")
  public String getCallbackMailSuccessSubject() {
    return callbackMailSuccessSubject;
  }
  public void setCallbackMailSuccessSubject(String callbackMailSuccessSubject) {
    this.callbackMailSuccessSubject = callbackMailSuccessSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailSuccessBody")
  public String getCallbackMailSuccessBody() {
    return callbackMailSuccessBody;
  }
  public void setCallbackMailSuccessBody(String callbackMailSuccessBody) {
    this.callbackMailSuccessBody = callbackMailSuccessBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailExpiredSubject")
  public String getCallbackMailExpiredSubject() {
    return callbackMailExpiredSubject;
  }
  public void setCallbackMailExpiredSubject(String callbackMailExpiredSubject) {
    this.callbackMailExpiredSubject = callbackMailExpiredSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailExpiredBody")
  public String getCallbackMailExpiredBody() {
    return callbackMailExpiredBody;
  }
  public void setCallbackMailExpiredBody(String callbackMailExpiredBody) {
    this.callbackMailExpiredBody = callbackMailExpiredBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailRejectedSubject")
  public String getCallbackMailRejectedSubject() {
    return callbackMailRejectedSubject;
  }
  public void setCallbackMailRejectedSubject(String callbackMailRejectedSubject) {
    this.callbackMailRejectedSubject = callbackMailRejectedSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailRejectedBody")
  public String getCallbackMailRejectedBody() {
    return callbackMailRejectedBody;
  }
  public void setCallbackMailRejectedBody(String callbackMailRejectedBody) {
    this.callbackMailRejectedBody = callbackMailRejectedBody;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailErrorSubject")
  public String getCallbackMailErrorSubject() {
    return callbackMailErrorSubject;
  }
  public void setCallbackMailErrorSubject(String callbackMailErrorSubject) {
    this.callbackMailErrorSubject = callbackMailErrorSubject;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("callbackMailErrorBody")
  public String getCallbackMailErrorBody() {
    return callbackMailErrorBody;
  }
  public void setCallbackMailErrorBody(String callbackMailErrorBody) {
    this.callbackMailErrorBody = callbackMailErrorBody;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customization {\n");
    
    sb.append("  mailFrom: ").append(mailFrom).append("\n");
    sb.append("  smsFrom: ").append(smsFrom).append("\n");
    sb.append("  requestMailSubject: ").append(requestMailSubject).append("\n");
    sb.append("  requestMailBody: ").append(requestMailBody).append("\n");
    sb.append("  requestSmsBody: ").append(requestSmsBody).append("\n");
    sb.append("  callbackMailSuccessSubject: ").append(callbackMailSuccessSubject).append("\n");
    sb.append("  callbackMailSuccessBody: ").append(callbackMailSuccessBody).append("\n");
    sb.append("  callbackMailExpiredSubject: ").append(callbackMailExpiredSubject).append("\n");
    sb.append("  callbackMailExpiredBody: ").append(callbackMailExpiredBody).append("\n");
    sb.append("  callbackMailRejectedSubject: ").append(callbackMailRejectedSubject).append("\n");
    sb.append("  callbackMailRejectedBody: ").append(callbackMailRejectedBody).append("\n");
    sb.append("  callbackMailErrorSubject: ").append(callbackMailErrorSubject).append("\n");
    sb.append("  callbackMailErrorBody: ").append(callbackMailErrorBody).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

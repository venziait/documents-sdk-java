package com.viafirma.documents.sdk.java.model;

import java.util.Date;
import com.viafirma.documents.sdk.java.model.Signature;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Check  {
  
  public enum StatusEnum {
     PENDING,  CONFIRMED,  REJECTED, 
  };
  private StatusEnum status = null;
  private String code = null;
  private String helpText = null;
  private Signature signature = null;
  private String validateCode = null;
  private Date expires = null;
  private Date date = null;
  private String commentReject = null;

  
  /**
   * (since 3.4.0, internal) check status
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0, internal) check status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * (since 3.4.0, internal) identification code
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0, internal) identification code")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * (since 3.4.0) who approve the check
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) who approve the check")
  @JsonProperty("helpText")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   * (since 3.4.0) signature info
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) signature info")
  @JsonProperty("signature")
  public Signature getSignature() {
    return signature;
  }
  public void setSignature(Signature signature) {
    this.signature = signature;
  }

  
  /**
   * (since 3.4.0) code that allows you to execute the confirmation action
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) code that allows you to execute the confirmation action")
  @JsonProperty("validateCode")
  public String getValidateCode() {
    return validateCode;
  }
  public void setValidateCode(String validateCode) {
    this.validateCode = validateCode;
  }

  
  /**
   * (since 3.4.0) maximum date on which the petition can be approved
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) maximum date on which the petition can be approved")
  @JsonProperty("expires")
  public Date getExpires() {
    return expires;
  }
  public void setExpires(Date expires) {
    this.expires = expires;
  }

  
  /**
   * (since 3.4.0) date on which the petition was approved or rejected
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) date on which the petition was approved or rejected")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   * (since 3.4.0) check rejection reason
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.0) check rejection reason")
  @JsonProperty("commentReject")
  public String getCommentReject() {
    return commentReject;
  }
  public void setCommentReject(String commentReject) {
    this.commentReject = commentReject;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Check {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  commentReject: ").append(commentReject).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

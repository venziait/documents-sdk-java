package com.viafirma.documents.sdk.java.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class MessageList  {
  
  private String messageCode = null;
  public enum StatusEnum {
     DELETED,  EXPIRED,  ERROR,  REJECTED,  TRANSFERRED,  RESPONSED,  SERVER_SIGN,  SENT,  SIGNED,  WAITING,  COMMITTED,  RECEIVED,  TEMPORAL_STORED,  STAND_BY,  WAITING_CHECK,  APPROVED,  FINISHED,  WAITING_OCR,  WAITING_CLIENT_SIGNATURE,  MAX_ERROR_REACHED, 
  };
  private StatusEnum status = null;
  private String userCode = null;
  private String groupCode = null;
  private String templateCode = null;
  private Date creationDate = null;

  
  /**
   * (since 3.4.8, internal) message code
   **/
  @ApiModelProperty(required = true, value = "(since 3.4.8, internal) message code")
  @JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   * (since 3.4.8, internal) message status
   **/
  @ApiModelProperty(required = true, value = "(since 3.4.8, internal) message status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * (since 3.4.8, internal) user code
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.8, internal) user code")
  @JsonProperty("userCode")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  
  /**
   * (since 3.4.8, internal) group code
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.8, internal) group code")
  @JsonProperty("groupCode")
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   * (since 3.4.8, internal) template code
   **/
  @ApiModelProperty(required = false, value = "(since 3.4.8, internal) template code")
  @JsonProperty("templateCode")
  public String getTemplateCode() {
    return templateCode;
  }
  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }

  
  /**
   * (since 3.4.8, internal) creation date
   **/
  @ApiModelProperty(required = true, value = "(since 3.4.8, internal) creation date")
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageList {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  templateCode: ").append(templateCode).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

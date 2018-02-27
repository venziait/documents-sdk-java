package com.viafirma.documents.sdk.java.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class MessageStatus  {
  
  public enum StatusEnum {
     DELETED,  EXPIRED,  ERROR,  REJECTED,  TRANSFERRED,  RESPONSED,  SERVER_SIGN,  SENT,  SIGNED,  WAITING,  COMMITTED,  RECEIVED,  TEMPORAL_STORED,  STAND_BY,  WAITING_CHECK,  APPROVED,  FINISHED,  WAITING_OCR,  WAITING_CLIENT_SIGNATURE,  MAX_ERROR_REACHED, 
  };
  private StatusEnum status = null;
  private Date lastUpdated = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("lastUpdated")
  public Date getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStatus {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

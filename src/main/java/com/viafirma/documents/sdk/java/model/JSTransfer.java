package com.viafirma.documents.sdk.java.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class JSTransfer  {
  
  private String name = null;
  private String status = null;
  private Date transferDate = null;
  private String error = null;
  private String response = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transferDate")
  public Date getTransferDate() {
    return transferDate;
  }
  public void setTransferDate(Date transferDate) {
    this.transferDate = transferDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response")
  public String getResponse() {
    return response;
  }
  public void setResponse(String response) {
    this.response = response;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSTransfer {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  transferDate: ").append(transferDate).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  response: ").append(response).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

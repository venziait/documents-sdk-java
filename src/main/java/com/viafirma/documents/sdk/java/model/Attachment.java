package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Param;
import java.util.*;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Attachment  {
  
  public enum TypeEnum {
     PDF,  IMAGE,  VIDEO,  AUDIO, 
  };
  private TypeEnum type = null;
  public enum ProcessTypeEnum {
     OCR, 
  };
  private ProcessTypeEnum processType = null;
  private String processId = null;
  private String code = null;
  public enum StatusEnum {
     PENDING,  RECEIVED, 
  };
  private StatusEnum status = null;
  private String helpText = null;
  private String helpDetail = null;
  private Boolean optional = null;
  private List<Param> metadataList = new ArrayList<Param>() ;
  private Date date = null;
  private String hash = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("processType")
  public ProcessTypeEnum getProcessType() {
    return processType;
  }
  public void setProcessType(ProcessTypeEnum processType) {
    this.processType = processType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("processId")
  public String getProcessId() {
    return processId;
  }
  public void setProcessId(String processId) {
    this.processId = processId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
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
  @JsonProperty("helpText")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("helpDetail")
  public String getHelpDetail() {
    return helpDetail;
  }
  public void setHelpDetail(String helpDetail) {
    this.helpDetail = helpDetail;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("metadataList")
  public List<Param> getMetadataList() {
    return metadataList;
  }
  public void setMetadataList(List<Param> metadataList) {
    this.metadataList = metadataList;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  processType: ").append(processType).append("\n");
    sb.append("  processId: ").append(processId).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  helpDetail: ").append(helpDetail).append("\n");
    sb.append("  optional: ").append(optional).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

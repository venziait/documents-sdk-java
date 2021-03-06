package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Status;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class WorkflowConfig  {
  
  private String code = null;
  private String description = null;
  private List<Status> status = new ArrayList<Status>() ;
  public enum TypeEnum {
     APP,  WEB,  PRESENTIAL, 
  };
  private TypeEnum type = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("status")
  public List<Status> getStatus() {
    return status;
  }
  public void setStatus(List<Status> status) {
    this.status = status;
  }

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowConfig {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

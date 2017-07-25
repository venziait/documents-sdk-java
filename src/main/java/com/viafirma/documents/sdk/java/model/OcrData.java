package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.JSOcrFieldExtractionResult;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class OcrData  {
  
  private String key = null;
  private Double version = null;
  private Boolean offline = null;
  private List<JSOcrFieldExtractionResult> result = new ArrayList<JSOcrFieldExtractionResult>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("offline")
  public Boolean getOffline() {
    return offline;
  }
  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("result")
  public List<JSOcrFieldExtractionResult> getResult() {
    return result;
  }
  public void setResult(List<JSOcrFieldExtractionResult> result) {
    this.result = result;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrData {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  offline: ").append(offline).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

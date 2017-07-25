package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.JSOcrFieldExtractionResult;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class OcrPageResult  {
  
  private List<JSOcrFieldExtractionResult> fieldExtractionResults = new ArrayList<JSOcrFieldExtractionResult>() ;
  private String pageKey = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fieldExtractionResults")
  public List<JSOcrFieldExtractionResult> getFieldExtractionResults() {
    return fieldExtractionResults;
  }
  public void setFieldExtractionResults(List<JSOcrFieldExtractionResult> fieldExtractionResults) {
    this.fieldExtractionResults = fieldExtractionResults;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("pageKey")
  public String getPageKey() {
    return pageKey;
  }
  public void setPageKey(String pageKey) {
    this.pageKey = pageKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPageResult {\n");
    
    sb.append("  fieldExtractionResults: ").append(fieldExtractionResults).append("\n");
    sb.append("  pageKey: ").append(pageKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

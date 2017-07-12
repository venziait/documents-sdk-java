package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.JSOcrDefinitionPropertyPage;
import java.util.*;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class JSOcrDefinitionPage  {
  
  private String pageKey = null;
  private String fileName = null;
  private List<JSOcrDefinitionPropertyPage> properties = new ArrayList<JSOcrDefinitionPropertyPage>() ;
  private Double formFactor = null;
  private Object checkString = null;

  
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("properties")
  public List<JSOcrDefinitionPropertyPage> getProperties() {
    return properties;
  }
  public void setProperties(List<JSOcrDefinitionPropertyPage> properties) {
    this.properties = properties;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("formFactor")
  public Double getFormFactor() {
    return formFactor;
  }
  public void setFormFactor(Double formFactor) {
    this.formFactor = formFactor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("checkString")
  public Object getCheckString() {
    return checkString;
  }
  public void setCheckString(Object checkString) {
    this.checkString = checkString;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSOcrDefinitionPage {\n");
    
    sb.append("  pageKey: ").append(pageKey).append("\n");
    sb.append("  fileName: ").append(fileName).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("  formFactor: ").append(formFactor).append("\n");
    sb.append("  checkString: ").append(checkString).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



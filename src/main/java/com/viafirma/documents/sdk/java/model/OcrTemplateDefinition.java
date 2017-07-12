package com.viafirma.documents.sdk.java.model;

import java.util.*;
import com.viafirma.documents.sdk.java.model.JSOcrDefinitionPage;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class OcrTemplateDefinition  {
  
  private String key = null;
  private String tesseractLang = null;
  private List<JSOcrDefinitionPage> pages = new ArrayList<JSOcrDefinitionPage>() ;

  
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
  @JsonProperty("tesseractLang")
  public String getTesseractLang() {
    return tesseractLang;
  }
  public void setTesseractLang(String tesseractLang) {
    this.tesseractLang = tesseractLang;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("pages")
  public List<JSOcrDefinitionPage> getPages() {
    return pages;
  }
  public void setPages(List<JSOcrDefinitionPage> pages) {
    this.pages = pages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrTemplateDefinition {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  tesseractLang: ").append(tesseractLang).append("\n");
    sb.append("  pages: ").append(pages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



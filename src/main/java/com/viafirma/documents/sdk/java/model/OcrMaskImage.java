package com.viafirma.documents.sdk.java.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class OcrMaskImage  {
  
  private String mask = null;
  private Double version = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("mask")
  public String getMask() {
    return mask;
  }
  public void setMask(String mask) {
    this.mask = mask;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrMaskImage {\n");
    
    sb.append("  mask: ").append(mask).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



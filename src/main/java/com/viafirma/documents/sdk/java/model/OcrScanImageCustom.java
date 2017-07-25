package com.viafirma.documents.sdk.java.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class OcrScanImageCustom  {
  
  private String key = null;
  private String base64Image = null;

  
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
  @JsonProperty("base64Image")
  public String getBase64Image() {
    return base64Image;
  }
  public void setBase64Image(String base64Image) {
    this.base64Image = base64Image;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrScanImageCustom {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



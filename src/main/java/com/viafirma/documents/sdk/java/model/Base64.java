package com.viafirma.documents.sdk.java.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class Base64  {
  
  private String base64 = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("base64")
  public String getBase64() {
    return base64;
  }
  public void setBase64(String base64) {
    this.base64 = base64;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64 {\n");
    
    sb.append("  base64: ").append(base64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



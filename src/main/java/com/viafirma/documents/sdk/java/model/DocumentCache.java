package com.viafirma.documents.sdk.java.model;

import java.util.Date;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class DocumentCache  {
  
  private String templateReference = null;
  private String md5 = null;
  private Date expires = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("templateReference")
  public String getTemplateReference() {
    return templateReference;
  }
  public void setTemplateReference(String templateReference) {
    this.templateReference = templateReference;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("md5")
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("expires")
  public Date getExpires() {
    return expires;
  }
  public void setExpires(Date expires) {
    this.expires = expires;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCache {\n");
    
    sb.append("  templateReference: ").append(templateReference).append("\n");
    sb.append("  md5: ").append(md5).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



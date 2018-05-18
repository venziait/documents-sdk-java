package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ImageProviderConfig  {
  
  private String providerId = null;
  private String groupCode = null;
  private String value = null;
  private String extension = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("providerId")
  public String getProviderId() {
    return providerId;
  }
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("groupCode")
  public String getGroupCode() {
    return groupCode;
  }
  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("extension")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageProviderConfig {\n");
    
    sb.append("  providerId: ").append(providerId).append("\n");
    sb.append("  groupCode: ").append(groupCode).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  extension: ").append(extension).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

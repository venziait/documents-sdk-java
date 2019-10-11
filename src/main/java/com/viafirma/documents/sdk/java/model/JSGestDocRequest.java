package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class JSGestDocRequest  {
  
  private String appCode = null;
  private String userCode = null;
  private String deviceCode = null;
  private String identifier = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("appCode")
  public String getAppCode() {
    return appCode;
  }
  public void setAppCode(String appCode) {
    this.appCode = appCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("userCode")
  public String getUserCode() {
    return userCode;
  }
  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("deviceCode")
  public String getDeviceCode() {
    return deviceCode;
  }
  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSGestDocRequest {\n");
    
    sb.append("  appCode: ").append(appCode).append("\n");
    sb.append("  userCode: ").append(userCode).append("\n");
    sb.append("  deviceCode: ").append(deviceCode).append("\n");
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

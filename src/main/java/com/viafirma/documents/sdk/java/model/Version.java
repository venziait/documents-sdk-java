package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Version  {
  
  private String type = null;
  private String version = null;
  private Boolean showUpdate = null;
  private Boolean forceUpdate = null;
  private String installURL = null;
  private String installMessage = null;
  private String iconURL = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("showUpdate")
  public Boolean getShowUpdate() {
    return showUpdate;
  }
  public void setShowUpdate(Boolean showUpdate) {
    this.showUpdate = showUpdate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("forceUpdate")
  public Boolean getForceUpdate() {
    return forceUpdate;
  }
  public void setForceUpdate(Boolean forceUpdate) {
    this.forceUpdate = forceUpdate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("installURL")
  public String getInstallURL() {
    return installURL;
  }
  public void setInstallURL(String installURL) {
    this.installURL = installURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("installMessage")
  public String getInstallMessage() {
    return installMessage;
  }
  public void setInstallMessage(String installMessage) {
    this.installMessage = installMessage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("iconURL")
  public String getIconURL() {
    return iconURL;
  }
  public void setIconURL(String iconURL) {
    this.iconURL = iconURL;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  showUpdate: ").append(showUpdate).append("\n");
    sb.append("  forceUpdate: ").append(forceUpdate).append("\n");
    sb.append("  installURL: ").append(installURL).append("\n");
    sb.append("  installMessage: ").append(installMessage).append("\n");
    sb.append("  iconURL: ").append(iconURL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

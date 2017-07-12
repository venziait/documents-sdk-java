package com.viafirma.documents.sdk.java.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class Version  {
  
  private String type = null;
  private String version = null;
  private Boolean showUpdate = null;
  private String installURL = null;
  private String installMessage = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  showUpdate: ").append(showUpdate).append("\n");
    sb.append("  installURL: ").append(installURL).append("\n");
    sb.append("  installMessage: ").append(installMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



package com.viafirma.documents.sdk.java.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class TemplateList  {
  
  private String code = null;
  private String title = null;
  private String description = null;
  private Date creationDate = null;
  private String groups = null;
  private Boolean onlyWacom = null;
  private String version = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("groups")
  public String getGroups() {
    return groups;
  }
  public void setGroups(String groups) {
    this.groups = groups;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("onlyWacom")
  public Boolean getOnlyWacom() {
    return onlyWacom;
  }
  public void setOnlyWacom(Boolean onlyWacom) {
    this.onlyWacom = onlyWacom;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateList {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  creationDate: ").append(creationDate).append("\n");
    sb.append("  groups: ").append(groups).append("\n");
    sb.append("  onlyWacom: ").append(onlyWacom).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

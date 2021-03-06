package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Mail;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class MenuOption  {
  
  private String className = null;
  private Boolean automatic = null;
  private String name = null;
  private String icon = null;
  private String username = null;
  private String password = null;
  private Mail email = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("className")
  public String getClassName() {
    return className;
  }
  public void setClassName(String className) {
    this.className = className;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("automatic")
  public Boolean getAutomatic() {
    return automatic;
  }
  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("email")
  public Mail getEmail() {
    return email;
  }
  public void setEmail(Mail email) {
    this.email = email;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuOption {\n");
    
    sb.append("  className: ").append(className).append("\n");
    sb.append("  automatic: ").append(automatic).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

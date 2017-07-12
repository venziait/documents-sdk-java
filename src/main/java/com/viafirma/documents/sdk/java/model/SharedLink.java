package com.viafirma.documents.sdk.java.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class SharedLink  {
  
  private String scheme = null;
  private String token = null;
  private String link = null;
  private String appCode = null;
  private String email = null;
  private String subject = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("scheme")
  public String getScheme() {
    return scheme;
  }
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
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
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedLink {\n");
    
    sb.append("  scheme: ").append(scheme).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  appCode: ").append(appCode).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



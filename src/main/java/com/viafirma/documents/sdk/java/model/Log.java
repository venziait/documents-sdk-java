package com.viafirma.documents.sdk.java.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class Log  {
  
  private String user = null;
  private String device = null;
  private String msg = null;
  public enum LevelEnum {
     DEBUG,  INFO,  ERROR,  TRACE,  WARN, 
  };
  private LevelEnum level = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("device")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Log {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("  device: ").append(device).append("\n");
    sb.append("  msg: ").append(msg).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



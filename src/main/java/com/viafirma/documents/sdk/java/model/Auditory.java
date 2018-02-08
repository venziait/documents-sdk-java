package com.viafirma.documents.sdk.java.model;

import java.util.Date;
import com.viafirma.documents.sdk.java.model.Geolocation;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Auditory  {
  
  private Date date = null;
  private String ip = null;
  private Geolocation geolocation = null;
  public enum ActionEnum {
     RECEIVED,   MAIL_SENT,   MAIL_READ,   MAIL_CALLBACK_SENT,   MAIL_CALLBACK_READ, 
  };
  private ActionEnum action = null;
  private String data = null;
  private String detail = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("geolocation")
  public Geolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auditory {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  ip: ").append(ip).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
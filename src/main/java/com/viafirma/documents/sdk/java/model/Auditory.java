package com.viafirma.documents.sdk.java.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Auditory  {
  
  private Date date = null;
  private String ip = null;
  private String coordinates = null;
  private String action = null;
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
  @JsonProperty("coordinates")
  public String getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(String coordinates) {
    this.coordinates = coordinates;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
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
    sb.append("  coordinates: ").append(coordinates).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

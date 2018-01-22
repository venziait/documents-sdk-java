package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Geolocation  {
  
  private Double accuracy = null;
  private Double latitude = null;
  private Double longitude = null;
  private String locationData = null;
  private String locationInfo = null;
  private String type = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("accuracy")
  public Double getAccuracy() {
    return accuracy;
  }
  public void setAccuracy(Double accuracy) {
    this.accuracy = accuracy;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("locationData")
  public String getLocationData() {
    return locationData;
  }
  public void setLocationData(String locationData) {
    this.locationData = locationData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("locationInfo")
  public String getLocationInfo() {
    return locationInfo;
  }
  public void setLocationInfo(String locationInfo) {
    this.locationInfo = locationInfo;
  }

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geolocation {\n");
    
    sb.append("  accuracy: ").append(accuracy).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  locationData: ").append(locationData).append("\n");
    sb.append("  locationInfo: ").append(locationInfo).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

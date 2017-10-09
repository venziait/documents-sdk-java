package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Geolocation;
import com.viafirma.documents.sdk.java.model.Position;
import com.viafirma.documents.sdk.java.model.EvidenceDevice;
import java.util.*;
import com.viafirma.documents.sdk.java.model.JSEvidenceGenericProperty;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EvidenceGeneric  {
  
  private String messageCode = null;
  private String evidenceCode = null;
  private Geolocation geolocation = null;
  private EvidenceDevice device = null;
  private List<Position> positions = new ArrayList<Position>() ;
  private Integer imageQuality = null;
  private Integer imageScaleFactor = null;
  private String providerId;
  private String evidenceDescription;
  private List<JSEvidenceGenericProperty> properties = new ArrayList<JSEvidenceGenericProperty>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("evidenceCode")
  public String getEvidenceCode() {
    return evidenceCode;
  }
  public void setEvidenceCode(String evidenceCode) {
    this.evidenceCode = evidenceCode;
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
  @JsonProperty("device")
  public EvidenceDevice getDevice() {
    return device;
  }
  public void setDevice(EvidenceDevice device) {
    this.device = device;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("positions")
  public List<Position> getPositions() {
    return positions;
  }
  public void setPositions(List<Position> positions) {
    this.positions = positions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("imageQuality")
  public Integer getImageQuality() {
    return imageQuality;
  }
  public void setImageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("imageScaleFactor")
  public Integer getImageScaleFactor() {
    return imageScaleFactor;
  }
  public void setImageScaleFactor(Integer imageScaleFactor) {
    this.imageScaleFactor = imageScaleFactor;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("properties")
  public List<JSEvidenceGenericProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<JSEvidenceGenericProperty> properties) {
    this.properties = properties;
  }

  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("providerId")
  public String getProviderId() {
    return providerId;
  }
  public void setProviderId(String providerId) {
    this.providerId=providerId;
  }
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("evidenceDescription")
  public String getEvidenceDescription() {
    return evidenceDescription;
  }
  public void setEvidenceDescription(String description) {
    this.evidenceDescription=description;
  }
  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceGeneric {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  evidenceCode: ").append(evidenceCode).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  device: ").append(device).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  imageQuality: ").append(imageQuality).append("\n");
    sb.append("  imageScaleFactor: ").append(imageScaleFactor).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.EvidenceDevice;
import com.viafirma.documents.sdk.java.model.EvidenceStroke;
import com.viafirma.documents.sdk.java.model.Position;
import java.util.*;
import com.viafirma.documents.sdk.java.model.Geolocation;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EvidenceSignature  {
  
  private String messageCode = null;
  private String policyCode = null;
  private String evidenceCode = null;
  private String base64Image = null;
  private Geolocation geolocation = null;
  private EvidenceDevice device = null;
  private List<EvidenceStroke> strokes = new ArrayList<EvidenceStroke>() ;
  private Integer signAreaHeight = null;
  private Integer signAreaWidth = null;
  private List<Position> positions = new ArrayList<Position>() ;

  
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
  @JsonProperty("policyCode")
  public String getPolicyCode() {
    return policyCode;
  }
  public void setPolicyCode(String policyCode) {
    this.policyCode = policyCode;
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
  @JsonProperty("base64Image")
  public String getBase64Image() {
    return base64Image;
  }
  public void setBase64Image(String base64Image) {
    this.base64Image = base64Image;
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
  @JsonProperty("strokes")
  public List<EvidenceStroke> getStrokes() {
    return strokes;
  }
  public void setStrokes(List<EvidenceStroke> strokes) {
    this.strokes = strokes;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("signAreaHeight")
  public Integer getSignAreaHeight() {
    return signAreaHeight;
  }
  public void setSignAreaHeight(Integer signAreaHeight) {
    this.signAreaHeight = signAreaHeight;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("signAreaWidth")
  public Integer getSignAreaWidth() {
    return signAreaWidth;
  }
  public void setSignAreaWidth(Integer signAreaWidth) {
    this.signAreaWidth = signAreaWidth;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceSignature {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  policyCode: ").append(policyCode).append("\n");
    sb.append("  evidenceCode: ").append(evidenceCode).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  device: ").append(device).append("\n");
    sb.append("  strokes: ").append(strokes).append("\n");
    sb.append("  signAreaHeight: ").append(signAreaHeight).append("\n");
    sb.append("  signAreaWidth: ").append(signAreaWidth).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

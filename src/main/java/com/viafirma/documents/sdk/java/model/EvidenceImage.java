package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Geolocation;
import com.viafirma.documents.sdk.java.model.Position;
import com.viafirma.documents.sdk.java.model.EvidenceDevice;
import java.util.*;
import com.viafirma.documents.sdk.java.model.OcrData;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EvidenceImage  {
  
  private String messageCode = null;
  private String evidenceCode = null;
  private String base64Image = null;
  private Geolocation geolocation = null;
  private EvidenceDevice device = null;
  private List<Position> positions = new ArrayList<Position>() ;
  private Integer imageQuality = null;
  private Integer imageScaleFactor = null;
  private OcrData ocr = null;
  private String ocrTemplate = null;
  private String ocrFields = null;

  
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
  @JsonProperty("ocr")
  public OcrData getOcr() {
    return ocr;
  }
  public void setOcr(OcrData ocr) {
    this.ocr = ocr;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("ocrTemplate")
  public String getOcrTemplate() {
    return ocrTemplate;
  }
  public void setOcrTemplate(String ocrTemplate) {
    this.ocrTemplate = ocrTemplate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("ocrFields")
  public String getOcrFields() {
    return ocrFields;
  }
  public void setOcrFields(String ocrFields) {
    this.ocrFields = ocrFields;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceImage {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  evidenceCode: ").append(evidenceCode).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  device: ").append(device).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  imageQuality: ").append(imageQuality).append("\n");
    sb.append("  imageScaleFactor: ").append(imageScaleFactor).append("\n");
    sb.append("  ocr: ").append(ocr).append("\n");
    sb.append("  ocrTemplate: ").append(ocrTemplate).append("\n");
    sb.append("  ocrFields: ").append(ocrFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

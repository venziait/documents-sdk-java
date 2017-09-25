package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.OcrData;
import com.viafirma.documents.sdk.java.model.EvidenceSignature;
import com.viafirma.documents.sdk.java.model.Param;
import com.viafirma.documents.sdk.java.model.EvidenceGeneric;
import com.viafirma.documents.sdk.java.model.Position;
import com.viafirma.documents.sdk.java.model.EvidenceImage;
import java.util.*;
import com.viafirma.documents.sdk.java.model.Geolocation;
import com.viafirma.documents.sdk.java.model.EvidenceFingerPrint;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Evidence  {
  
  public enum TypeEnum {
     SIGNATURE,  FINGERPRINT,  IMAGE,  ANNOTATION,  FINGER_PRINT,  OTP_SMS,  GENERIC, 
  };
  private TypeEnum type = null;
  private String code = null;
  public enum StatusEnum {
     PENDING,  RECEIVED,  ADDED, 
  };
  private StatusEnum status = null;
  private String helpText = null;
  private String temporalReference = null;
  private List<Position> positions = new ArrayList<Position>() ;
  private List<Param> metadataList = new ArrayList<Param>() ;
  private String metadata = null;
  private String deviceType = null;
  private List<String> hashPdf = new ArrayList<String>() ;
  private String hashImage = null;
  private String algorithmic = null;
  private String fingerID = null;
  private String typeFormatSign = null;
  private String certificateAlias = null;
  private String certificatePassword = null;
  private String metadataCipherPublicKey = null;
  private String encryptionKeyAlias = null;
  private Boolean optional = null;
  private EvidenceSignature signatureData = null;
  private EvidenceFingerPrint fingerPrintData = null;
  private EvidenceImage imageData = null;
  private String positionsKey = null;
  private Integer stampsMin = null;
  private String stampsPolicy = null;
  private List<String> stylus = new ArrayList<String>() ;
  private Geolocation geolocation = null;
  private Integer imageQuality = null;
  private Integer imageScaleFactor = null;
  private String wacomURL = null;
  private OcrData ocr = null;
  private EvidenceGeneric genericData = null;
  private String phone = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("helpText")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("temporalReference")
  public String getTemporalReference() {
    return temporalReference;
  }
  public void setTemporalReference(String temporalReference) {
    this.temporalReference = temporalReference;
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
  @JsonProperty("metadataList")
  public List<Param> getMetadataList() {
    return metadataList;
  }
  public void setMetadataList(List<Param> metadataList) {
    this.metadataList = metadataList;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("metadata")
  public String getMetadata() {
    return metadata;
  }
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("deviceType")
  public String getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("hashPdf")
  public List<String> getHashPdf() {
    return hashPdf;
  }
  public void setHashPdf(List<String> hashPdf) {
    this.hashPdf = hashPdf;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("hashImage")
  public String getHashImage() {
    return hashImage;
  }
  public void setHashImage(String hashImage) {
    this.hashImage = hashImage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("algorithmic")
  public String getAlgorithmic() {
    return algorithmic;
  }
  public void setAlgorithmic(String algorithmic) {
    this.algorithmic = algorithmic;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fingerID")
  public String getFingerID() {
    return fingerID;
  }
  public void setFingerID(String fingerID) {
    this.fingerID = fingerID;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("typeFormatSign")
  public String getTypeFormatSign() {
    return typeFormatSign;
  }
  public void setTypeFormatSign(String typeFormatSign) {
    this.typeFormatSign = typeFormatSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("certificateAlias")
  public String getCertificateAlias() {
    return certificateAlias;
  }
  public void setCertificateAlias(String certificateAlias) {
    this.certificateAlias = certificateAlias;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("certificatePassword")
  public String getCertificatePassword() {
    return certificatePassword;
  }
  public void setCertificatePassword(String certificatePassword) {
    this.certificatePassword = certificatePassword;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("metadataCipherPublicKey")
  public String getMetadataCipherPublicKey() {
    return metadataCipherPublicKey;
  }
  public void setMetadataCipherPublicKey(String metadataCipherPublicKey) {
    this.metadataCipherPublicKey = metadataCipherPublicKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("encryptionKeyAlias")
  public String getEncryptionKeyAlias() {
    return encryptionKeyAlias;
  }
  public void setEncryptionKeyAlias(String encryptionKeyAlias) {
    this.encryptionKeyAlias = encryptionKeyAlias;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("signatureData")
  public EvidenceSignature getSignatureData() {
    return signatureData;
  }
  public void setSignatureData(EvidenceSignature signatureData) {
    this.signatureData = signatureData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fingerPrintData")
  public EvidenceFingerPrint getFingerPrintData() {
    return fingerPrintData;
  }
  public void setFingerPrintData(EvidenceFingerPrint fingerPrintData) {
    this.fingerPrintData = fingerPrintData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("imageData")
  public EvidenceImage getImageData() {
    return imageData;
  }
  public void setImageData(EvidenceImage imageData) {
    this.imageData = imageData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("positionsKey")
  public String getPositionsKey() {
    return positionsKey;
  }
  public void setPositionsKey(String positionsKey) {
    this.positionsKey = positionsKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("stampsMin")
  public Integer getStampsMin() {
    return stampsMin;
  }
  public void setStampsMin(Integer stampsMin) {
    this.stampsMin = stampsMin;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("stampsPolicy")
  public String getStampsPolicy() {
    return stampsPolicy;
  }
  public void setStampsPolicy(String stampsPolicy) {
    this.stampsPolicy = stampsPolicy;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("stylus")
  public List<String> getStylus() {
    return stylus;
  }
  public void setStylus(List<String> stylus) {
    this.stylus = stylus;
  }

  
  /**
   * (since 3.5.0, internal) geolocation info
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0, internal) geolocation info")
  @JsonProperty("geolocation")
  public Geolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  
  /**
   * (since 3.5.0) calidad de la imagen donde 100 representa el máximo de calidad y 0 el máximo nivel de compresión
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) calidad de la imagen donde 100 representa el máximo de calidad y 0 el máximo nivel de compresión")
  @JsonProperty("imageQuality")
  public Integer getImageQuality() {
    return imageQuality;
  }
  public void setImageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
  }

  
  /**
   * (since 3.5.0) factor multiplicador del tamaño de la imagen, para permitir zoom
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) factor multiplicador del tamaño de la imagen, para permitir zoom")
  @JsonProperty("imageScaleFactor")
  public Integer getImageScaleFactor() {
    return imageScaleFactor;
  }
  public void setImageScaleFactor(Integer imageScaleFactor) {
    this.imageScaleFactor = imageScaleFactor;
  }

  
  /**
   * (since 3.5.0, internal) url que permite el uso de tabletas wacom
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0, internal) url que permite el uso de tabletas wacom")
  @JsonProperty("wacomURL")
  public String getWacomURL() {
    return wacomURL;
  }
  public void setWacomURL(String wacomURL) {
    this.wacomURL = wacomURL;
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
  @JsonProperty("genericData")
  public EvidenceGeneric getGenericData() {
    return genericData;
  }
  public void setGenericData(EvidenceGeneric genericData) {
    this.genericData = genericData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evidence {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  temporalReference: ").append(temporalReference).append("\n");
    sb.append("  positions: ").append(positions).append("\n");
    sb.append("  metadataList: ").append(metadataList).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  deviceType: ").append(deviceType).append("\n");
    sb.append("  hashPdf: ").append(hashPdf).append("\n");
    sb.append("  hashImage: ").append(hashImage).append("\n");
    sb.append("  algorithmic: ").append(algorithmic).append("\n");
    sb.append("  fingerID: ").append(fingerID).append("\n");
    sb.append("  typeFormatSign: ").append(typeFormatSign).append("\n");
    sb.append("  certificateAlias: ").append(certificateAlias).append("\n");
    sb.append("  certificatePassword: ").append(certificatePassword).append("\n");
    sb.append("  metadataCipherPublicKey: ").append(metadataCipherPublicKey).append("\n");
    sb.append("  encryptionKeyAlias: ").append(encryptionKeyAlias).append("\n");
    sb.append("  optional: ").append(optional).append("\n");
    sb.append("  signatureData: ").append(signatureData).append("\n");
    sb.append("  fingerPrintData: ").append(fingerPrintData).append("\n");
    sb.append("  imageData: ").append(imageData).append("\n");
    sb.append("  positionsKey: ").append(positionsKey).append("\n");
    sb.append("  stampsMin: ").append(stampsMin).append("\n");
    sb.append("  stampsPolicy: ").append(stampsPolicy).append("\n");
    sb.append("  stylus: ").append(stylus).append("\n");
    sb.append("  geolocation: ").append(geolocation).append("\n");
    sb.append("  imageQuality: ").append(imageQuality).append("\n");
    sb.append("  imageScaleFactor: ").append(imageScaleFactor).append("\n");
    sb.append("  wacomURL: ").append(wacomURL).append("\n");
    sb.append("  ocr: ").append(ocr).append("\n");
    sb.append("  genericData: ").append(genericData).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

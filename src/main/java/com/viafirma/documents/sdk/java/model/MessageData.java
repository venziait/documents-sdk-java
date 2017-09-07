package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.EvidenceSignature;
import com.viafirma.documents.sdk.java.model.Item;
import com.viafirma.documents.sdk.java.model.EvidenceImage;
import java.util.*;
import com.viafirma.documents.sdk.java.model.EvidenceFingerPrint;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class MessageData  {
  
  private String messageCode = null;
  private List<Item> items = new ArrayList<Item>() ;
  private List<EvidenceSignature> biometricSignaturesData = new ArrayList<EvidenceSignature>() ;
  private List<EvidenceFingerPrint> fingerPrintsData = new ArrayList<EvidenceFingerPrint>() ;
  private List<EvidenceImage> imagesData = new ArrayList<EvidenceImage>() ;

  
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
  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("biometricSignaturesData")
  public List<EvidenceSignature> getBiometricSignaturesData() {
    return biometricSignaturesData;
  }
  public void setBiometricSignaturesData(List<EvidenceSignature> biometricSignaturesData) {
    this.biometricSignaturesData = biometricSignaturesData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fingerPrintsData")
  public List<EvidenceFingerPrint> getFingerPrintsData() {
    return fingerPrintsData;
  }
  public void setFingerPrintsData(List<EvidenceFingerPrint> fingerPrintsData) {
    this.fingerPrintsData = fingerPrintsData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("imagesData")
  public List<EvidenceImage> getImagesData() {
    return imagesData;
  }
  public void setImagesData(List<EvidenceImage> imagesData) {
    this.imagesData = imagesData;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageData {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  biometricSignaturesData: ").append(biometricSignaturesData).append("\n");
    sb.append("  fingerPrintsData: ").append(fingerPrintsData).append("\n");
    sb.append("  imagesData: ").append(imagesData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

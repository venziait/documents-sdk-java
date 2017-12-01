package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class IdenticaOperationStatus  {
  
  private String responseCode = null;
  private String clientId = null;
  private String serviceId = null;
  private String captureFormat = null;
  private String error = null;
  private String serviceResponseCode = null;
  private Long endDate = null;
  private String version = null;
  private String fingerprintReferenceCount = null;
  private String fingerprintReferenceFormat = null;
  private String serviceResponse = null;
  private String authenticationResponse = null;
  private String pin = null;
  private String name1 = null;
  private String name2 = null;
  private String surname1 = null;
  private String surname2 = null;
  private String generationDate = null;
  private String generationLocation = null;
  private String operationCode = null;
  private String fullName = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("responseCode")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("captureFormat")
  public String getCaptureFormat() {
    return captureFormat;
  }
  public void setCaptureFormat(String captureFormat) {
    this.captureFormat = captureFormat;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("serviceResponseCode")
  public String getServiceResponseCode() {
    return serviceResponseCode;
  }
  public void setServiceResponseCode(String serviceResponseCode) {
    this.serviceResponseCode = serviceResponseCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fingerprintReferenceCount")
  public String getFingerprintReferenceCount() {
    return fingerprintReferenceCount;
  }
  public void setFingerprintReferenceCount(String fingerprintReferenceCount) {
    this.fingerprintReferenceCount = fingerprintReferenceCount;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fingerprintReferenceFormat")
  public String getFingerprintReferenceFormat() {
    return fingerprintReferenceFormat;
  }
  public void setFingerprintReferenceFormat(String fingerprintReferenceFormat) {
    this.fingerprintReferenceFormat = fingerprintReferenceFormat;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("serviceResponse")
  public String getServiceResponse() {
    return serviceResponse;
  }
  public void setServiceResponse(String serviceResponse) {
    this.serviceResponse = serviceResponse;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("authenticationResponse")
  public String getAuthenticationResponse() {
    return authenticationResponse;
  }
  public void setAuthenticationResponse(String authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("pin")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("name1")
  public String getName1() {
    return name1;
  }
  public void setName1(String name1) {
    this.name1 = name1;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("name2")
  public String getName2() {
    return name2;
  }
  public void setName2(String name2) {
    this.name2 = name2;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("surname1")
  public String getSurname1() {
    return surname1;
  }
  public void setSurname1(String surname1) {
    this.surname1 = surname1;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("surname2")
  public String getSurname2() {
    return surname2;
  }
  public void setSurname2(String surname2) {
    this.surname2 = surname2;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("generationDate")
  public String getGenerationDate() {
    return generationDate;
  }
  public void setGenerationDate(String generationDate) {
    this.generationDate = generationDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("generationLocation")
  public String getGenerationLocation() {
    return generationLocation;
  }
  public void setGenerationLocation(String generationLocation) {
    this.generationLocation = generationLocation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("operationCode")
  public String getOperationCode() {
    return operationCode;
  }
  public void setOperationCode(String operationCode) {
    this.operationCode = operationCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdenticaOperationStatus {\n");
    
    sb.append("  responseCode: ").append(responseCode).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  serviceId: ").append(serviceId).append("\n");
    sb.append("  captureFormat: ").append(captureFormat).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  serviceResponseCode: ").append(serviceResponseCode).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  fingerprintReferenceCount: ").append(fingerprintReferenceCount).append("\n");
    sb.append("  fingerprintReferenceFormat: ").append(fingerprintReferenceFormat).append("\n");
    sb.append("  serviceResponse: ").append(serviceResponse).append("\n");
    sb.append("  authenticationResponse: ").append(authenticationResponse).append("\n");
    sb.append("  pin: ").append(pin).append("\n");
    sb.append("  name1: ").append(name1).append("\n");
    sb.append("  name2: ").append(name2).append("\n");
    sb.append("  surname1: ").append(surname1).append("\n");
    sb.append("  surname2: ").append(surname2).append("\n");
    sb.append("  generationDate: ").append(generationDate).append("\n");
    sb.append("  generationLocation: ").append(generationLocation).append("\n");
    sb.append("  operationCode: ").append(operationCode).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

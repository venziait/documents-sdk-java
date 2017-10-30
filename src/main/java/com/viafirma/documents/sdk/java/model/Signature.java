package com.viafirma.documents.sdk.java.model;

import java.util.*;
import com.viafirma.documents.sdk.java.model.Stamper;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Signature  {
  
  public enum TypeEnum {
     CLIENT,  SERVER, 
  };
  private TypeEnum type = null;
  private String code = null;
  public enum StatusEnum {
     PENDING,  RECEIVED,  SIGNED,  PREPARED,  CLICKED,  CLIENT_OPENED, 
  };
  private StatusEnum status = null;
  private String helpText = null;
  private String certificateAlias = null;
  private String certificatePassword = null;
  public enum TypeFormatSignEnum {
     PADES_B,  PADES_T,  PADES_LT,  PADES_LTA, 
  };
  private TypeFormatSignEnum typeFormatSign = null;
  private String dataToSign = null;
  private String idSign = null;
  private Boolean custodyDisabled = null;
  private List<Stamper> stampers = new ArrayList<Stamper>() ;
  private Long lastUpdated = null;
  public enum CertificationLevelEnum {
     NOT_CERTIFIED,  CERTIFIED_NO_CHANGES_ALLOWED,  CERTIFIED_FORM_FILLING,  CERTIFIED_FORM_FILLING_AND_ANNOTATIONS, 
  };
  private CertificationLevelEnum certificationLevel = null;

  
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
  @JsonProperty("typeFormatSign")
  public TypeFormatSignEnum getTypeFormatSign() {
    return typeFormatSign;
  }
  public void setTypeFormatSign(TypeFormatSignEnum typeFormatSign) {
    this.typeFormatSign = typeFormatSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("dataToSign")
  public String getDataToSign() {
    return dataToSign;
  }
  public void setDataToSign(String dataToSign) {
    this.dataToSign = dataToSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("idSign")
  public String getIdSign() {
    return idSign;
  }
  public void setIdSign(String idSign) {
    this.idSign = idSign;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("custodyDisabled")
  public Boolean getCustodyDisabled() {
    return custodyDisabled;
  }
  public void setCustodyDisabled(Boolean custodyDisabled) {
    this.custodyDisabled = custodyDisabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("stampers")
  public List<Stamper> getStampers() {
    return stampers;
  }
  public void setStampers(List<Stamper> stampers) {
    this.stampers = stampers;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("lastUpdated")
  public Long getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("certificationLevel")
  public CertificationLevelEnum getCertificationLevel() {
    return certificationLevel;
  }
  public void setCertificationLevel(CertificationLevelEnum certificationLevel) {
    this.certificationLevel = certificationLevel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  certificateAlias: ").append(certificateAlias).append("\n");
    sb.append("  certificatePassword: ").append(certificatePassword).append("\n");
    sb.append("  typeFormatSign: ").append(typeFormatSign).append("\n");
    sb.append("  dataToSign: ").append(dataToSign).append("\n");
    sb.append("  idSign: ").append(idSign).append("\n");
    sb.append("  custodyDisabled: ").append(custodyDisabled).append("\n");
    sb.append("  stampers: ").append(stampers).append("\n");
    sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
    sb.append("  certificationLevel: ").append(certificationLevel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

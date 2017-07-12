package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Item;
import java.util.*;
import com.viafirma.documents.sdk.java.model.Font;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class Document  {
  
  private String templateCode = null;
  private String templateReference = null;
  private Integer templateVersion = null;
  private String draftedCode = null;
  private String draftedReference = null;
  private String signedCode = null;
  private String signedID = null;
  private String signedReference = null;
  public enum TemplateTypeEnum {
     docx,  odt,  url,  pdf,  cache,  base64, 
  };
  private TemplateTypeEnum templateType = null;
  private Boolean formRequired = null;
  private Boolean formDisabled = null;
  private List<Item> items = new ArrayList<Item>() ;
  private Boolean pdfaCompliant = null;
  private Font font = null;
  private String policyCode = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("templateCode")
  public String getTemplateCode() {
    return templateCode;
  }
  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("templateReference")
  public String getTemplateReference() {
    return templateReference;
  }
  public void setTemplateReference(String templateReference) {
    this.templateReference = templateReference;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("templateVersion")
  public Integer getTemplateVersion() {
    return templateVersion;
  }
  public void setTemplateVersion(Integer templateVersion) {
    this.templateVersion = templateVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("draftedCode")
  public String getDraftedCode() {
    return draftedCode;
  }
  public void setDraftedCode(String draftedCode) {
    this.draftedCode = draftedCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("draftedReference")
  public String getDraftedReference() {
    return draftedReference;
  }
  public void setDraftedReference(String draftedReference) {
    this.draftedReference = draftedReference;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("signedCode")
  public String getSignedCode() {
    return signedCode;
  }
  public void setSignedCode(String signedCode) {
    this.signedCode = signedCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("signedID")
  public String getSignedID() {
    return signedID;
  }
  public void setSignedID(String signedID) {
    this.signedID = signedID;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("signedReference")
  public String getSignedReference() {
    return signedReference;
  }
  public void setSignedReference(String signedReference) {
    this.signedReference = signedReference;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("templateType")
  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }
  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("formRequired")
  public Boolean getFormRequired() {
    return formRequired;
  }
  public void setFormRequired(Boolean formRequired) {
    this.formRequired = formRequired;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("formDisabled")
  public Boolean getFormDisabled() {
    return formDisabled;
  }
  public void setFormDisabled(Boolean formDisabled) {
    this.formDisabled = formDisabled;
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
   * generate pdf compliant with PDF/A-3A ISO 19005-3
   **/
  @ApiModelProperty(required = false, value = "generate pdf compliant with PDF/A-3A ISO 19005-3")
  @JsonProperty("pdfaCompliant")
  public Boolean getPdfaCompliant() {
    return pdfaCompliant;
  }
  public void setPdfaCompliant(Boolean pdfaCompliant) {
    this.pdfaCompliant = pdfaCompliant;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("font")
  public Font getFont() {
    return font;
  }
  public void setFont(Font font) {
    this.font = font;
  }

  
  /**
   * (since 3.5.0) code of policy to use
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) code of policy to use")
  @JsonProperty("policyCode")
  public String getPolicyCode() {
    return policyCode;
  }
  public void setPolicyCode(String policyCode) {
    this.policyCode = policyCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("  templateCode: ").append(templateCode).append("\n");
    sb.append("  templateReference: ").append(templateReference).append("\n");
    sb.append("  templateVersion: ").append(templateVersion).append("\n");
    sb.append("  draftedCode: ").append(draftedCode).append("\n");
    sb.append("  draftedReference: ").append(draftedReference).append("\n");
    sb.append("  signedCode: ").append(signedCode).append("\n");
    sb.append("  signedID: ").append(signedID).append("\n");
    sb.append("  signedReference: ").append(signedReference).append("\n");
    sb.append("  templateType: ").append(templateType).append("\n");
    sb.append("  formRequired: ").append(formRequired).append("\n");
    sb.append("  formDisabled: ").append(formDisabled).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  pdfaCompliant: ").append(pdfaCompliant).append("\n");
    sb.append("  font: ").append(font).append("\n");
    sb.append("  policyCode: ").append(policyCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



package com.viafirma.documents.sdk.java.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class JSOcrDefinitionPropertyPage  {
  
  private String propertyKey = null;
  private String groupKey = null;
  private String pageKey = null;
  private Double relativeX = null;
  private Double relativeY = null;
  private Double relativeWidth = null;
  private Double relativeHeight = null;
  private String validationRule = null;
  private Boolean inputRequired = null;
  private String inputType = null;
  private String ocrValidChars = null;
  private Object pageDefinition = null;
  private String blockType = null;
  private String whiteList = null;
  private String regExp = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("propertyKey")
  public String getPropertyKey() {
    return propertyKey;
  }
  public void setPropertyKey(String propertyKey) {
    this.propertyKey = propertyKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("groupKey")
  public String getGroupKey() {
    return groupKey;
  }
  public void setGroupKey(String groupKey) {
    this.groupKey = groupKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("pageKey")
  public String getPageKey() {
    return pageKey;
  }
  public void setPageKey(String pageKey) {
    this.pageKey = pageKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("relativeX")
  public Double getRelativeX() {
    return relativeX;
  }
  public void setRelativeX(Double relativeX) {
    this.relativeX = relativeX;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("relativeY")
  public Double getRelativeY() {
    return relativeY;
  }
  public void setRelativeY(Double relativeY) {
    this.relativeY = relativeY;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("relativeWidth")
  public Double getRelativeWidth() {
    return relativeWidth;
  }
  public void setRelativeWidth(Double relativeWidth) {
    this.relativeWidth = relativeWidth;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("relativeHeight")
  public Double getRelativeHeight() {
    return relativeHeight;
  }
  public void setRelativeHeight(Double relativeHeight) {
    this.relativeHeight = relativeHeight;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("validationRule")
  public String getValidationRule() {
    return validationRule;
  }
  public void setValidationRule(String validationRule) {
    this.validationRule = validationRule;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("inputRequired")
  public Boolean getInputRequired() {
    return inputRequired;
  }
  public void setInputRequired(Boolean inputRequired) {
    this.inputRequired = inputRequired;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("inputType")
  public String getInputType() {
    return inputType;
  }
  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("ocrValidChars")
  public String getOcrValidChars() {
    return ocrValidChars;
  }
  public void setOcrValidChars(String ocrValidChars) {
    this.ocrValidChars = ocrValidChars;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("pageDefinition")
  public Object getPageDefinition() {
    return pageDefinition;
  }
  public void setPageDefinition(Object pageDefinition) {
    this.pageDefinition = pageDefinition;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("blockType")
  public String getBlockType() {
    return blockType;
  }
  public void setBlockType(String blockType) {
    this.blockType = blockType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("whiteList")
  public String getWhiteList() {
    return whiteList;
  }
  public void setWhiteList(String whiteList) {
    this.whiteList = whiteList;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("regExp")
  public String getRegExp() {
    return regExp;
  }
  public void setRegExp(String regExp) {
    this.regExp = regExp;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSOcrDefinitionPropertyPage {\n");
    
    sb.append("  propertyKey: ").append(propertyKey).append("\n");
    sb.append("  groupKey: ").append(groupKey).append("\n");
    sb.append("  pageKey: ").append(pageKey).append("\n");
    sb.append("  relativeX: ").append(relativeX).append("\n");
    sb.append("  relativeY: ").append(relativeY).append("\n");
    sb.append("  relativeWidth: ").append(relativeWidth).append("\n");
    sb.append("  relativeHeight: ").append(relativeHeight).append("\n");
    sb.append("  validationRule: ").append(validationRule).append("\n");
    sb.append("  inputRequired: ").append(inputRequired).append("\n");
    sb.append("  inputType: ").append(inputType).append("\n");
    sb.append("  ocrValidChars: ").append(ocrValidChars).append("\n");
    sb.append("  pageDefinition: ").append(pageDefinition).append("\n");
    sb.append("  blockType: ").append(blockType).append("\n");
    sb.append("  whiteList: ").append(whiteList).append("\n");
    sb.append("  regExp: ").append(regExp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



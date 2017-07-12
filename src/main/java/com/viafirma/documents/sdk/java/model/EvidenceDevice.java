package com.viafirma.documents.sdk.java.model;



import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class EvidenceDevice  {
  
  private String manufacturer = null;
  private String model = null;
  private String osVersion = null;
  private String penType = null;
  private Double maxPressure = null;
  private Double minPressure = null;
  private String ppi = null;
  private Boolean rotationAllowed = null;
  private Integer screenHeight = null;
  private Integer screenWidth = null;
  private String app = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("osVersion")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("penType")
  public String getPenType() {
    return penType;
  }
  public void setPenType(String penType) {
    this.penType = penType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("maxPressure")
  public Double getMaxPressure() {
    return maxPressure;
  }
  public void setMaxPressure(Double maxPressure) {
    this.maxPressure = maxPressure;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("minPressure")
  public Double getMinPressure() {
    return minPressure;
  }
  public void setMinPressure(Double minPressure) {
    this.minPressure = minPressure;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("ppi")
  public String getPpi() {
    return ppi;
  }
  public void setPpi(String ppi) {
    this.ppi = ppi;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("rotationAllowed")
  public Boolean getRotationAllowed() {
    return rotationAllowed;
  }
  public void setRotationAllowed(Boolean rotationAllowed) {
    this.rotationAllowed = rotationAllowed;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("screenHeight")
  public Integer getScreenHeight() {
    return screenHeight;
  }
  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("screenWidth")
  public Integer getScreenWidth() {
    return screenWidth;
  }
  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("app")
  public String getApp() {
    return app;
  }
  public void setApp(String app) {
    this.app = app;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceDevice {\n");
    
    sb.append("  manufacturer: ").append(manufacturer).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  osVersion: ").append(osVersion).append("\n");
    sb.append("  penType: ").append(penType).append("\n");
    sb.append("  maxPressure: ").append(maxPressure).append("\n");
    sb.append("  minPressure: ").append(minPressure).append("\n");
    sb.append("  ppi: ").append(ppi).append("\n");
    sb.append("  rotationAllowed: ").append(rotationAllowed).append("\n");
    sb.append("  screenHeight: ").append(screenHeight).append("\n");
    sb.append("  screenWidth: ").append(screenWidth).append("\n");
    sb.append("  app: ").append(app).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



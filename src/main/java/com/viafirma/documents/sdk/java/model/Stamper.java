package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Stamper  {
  
  public enum TypeEnum {
     PDF417,  QR_BARCODE128,  QR,  BARCODE128,  IMAGE,  TEXT,  MIN_TEXT, 
  };
  private TypeEnum type = null;
  public enum RotationEnum {
     ROTATE_90,  ROTATE_270, 
  };
  private RotationEnum rotation = null;
  private Integer width = null;
  private Integer height = null;
  private Integer xAxis = null;
  private Integer yAxis = null;
  private Integer page = null;
  private String imageBase64 = null;
  private String positionsKey = null;

  
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
  @JsonProperty("rotation")
  public RotationEnum getRotation() {
    return rotation;
  }
  public void setRotation(RotationEnum rotation) {
    this.rotation = rotation;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("xAxis")
  public Integer getXAxis() {
    return xAxis;
  }
  public void setXAxis(Integer xAxis) {
    this.xAxis = xAxis;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("yAxis")
  public Integer getYAxis() {
    return yAxis;
  }
  public void setYAxis(Integer yAxis) {
    this.yAxis = yAxis;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("imageBase64")
  public String getImageBase64() {
    return imageBase64;
  }
  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stamper {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  rotation: ").append(rotation).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  xAxis: ").append(xAxis).append("\n");
    sb.append("  yAxis: ").append(yAxis).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  imageBase64: ").append(imageBase64).append("\n");
    sb.append("  positionsKey: ").append(positionsKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

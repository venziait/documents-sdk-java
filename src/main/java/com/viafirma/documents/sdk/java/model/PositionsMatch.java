package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class PositionsMatch  {
  
  private String id = null;
  private String text = null;
  private Integer xoffset = null;
  private Integer yoffset = null;
  private Integer width = null;
  private Integer height = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("xoffset")
  public Integer getXoffset() {
    return xoffset;
  }
  public void setXoffset(Integer xoffset) {
    this.xoffset = xoffset;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("yoffset")
  public Integer getYoffset() {
    return yoffset;
  }
  public void setYoffset(Integer yoffset) {
    this.yoffset = yoffset;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsMatch {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  xoffset: ").append(xoffset).append("\n");
    sb.append("  yoffset: ").append(yoffset).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

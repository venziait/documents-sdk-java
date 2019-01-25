package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Rectangle;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class AcrofieldPosition  {
  
  private String id = null;
  private Integer page = null;
  private Rectangle rectangle = null;
  private String positionMatchId = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rectangle")
  public Rectangle getRectangle() {
    return rectangle;
  }
  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("positionMatchId")
  public String getPositionMatchId() {
    return positionMatchId;
  }
  public void setPositionMatchId(String positionMatchId) {
    this.positionMatchId = positionMatchId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcrofieldPosition {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  rectangle: ").append(rectangle).append("\n");
    sb.append("  positionMatchId: ").append(positionMatchId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.EvidencePoint;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EvidenceStroke  {
  
  private List<EvidencePoint> points = new ArrayList<EvidencePoint>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("points")
  public List<EvidencePoint> getPoints() {
    return points;
  }
  public void setPoints(List<EvidencePoint> points) {
    this.points = points;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceStroke {\n");
    
    sb.append("  points: ").append(points).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

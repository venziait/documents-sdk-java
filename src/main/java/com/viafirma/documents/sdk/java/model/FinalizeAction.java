package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Param;
import java.util.*;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;



@ApiModel(description = "")
public class FinalizeAction  {
  
  public enum TypeEnum {
     MAIL,  DETAIL,  SHARE,  PRINT, 
  };
  private TypeEnum type = null;
  private List<Param> paramList = new ArrayList<Param>() ;

  
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
  @JsonProperty("paramList")
  public List<Param> getParamList() {
    return paramList;
  }
  public void setParamList(List<Param> paramList) {
    this.paramList = paramList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizeAction {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  paramList: ").append(paramList).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



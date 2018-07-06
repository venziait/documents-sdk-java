package com.viafirma.documents.sdk.java.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class DataToSign  {
  
  private String algorithm = null;
  private String hash = null;
  private String idSign = null;

  
  /**
   * (since 3.5.0) signature algorith
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) signature algorith")
  @JsonProperty("algorithm")
  public String getAlgorithm() {
    return algorithm;
  }
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  
  /**
   * (since 3.5.0) hash to sign
   **/
  @ApiModelProperty(required = false, value = "(since 3.5.0) hash to sign")
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataToSign {\n");
    
    sb.append("  algorithm: ").append(algorithm).append("\n");
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("  idSign: ").append(idSign).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

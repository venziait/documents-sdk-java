package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Byte;
import java.util.*;
import com.viafirma.documents.sdk.java.model.MimeType;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class SignatureDTO  {
  
  private List<Byte> bytes = new ArrayList<Byte>() ;
  private String signatureCode = null;
  private MimeType mimeType = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("bytes")
  public List<Byte> getBytes() {
    return bytes;
  }
  public void setBytes(List<Byte> bytes) {
    this.bytes = bytes;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("signatureCode")
  public String getSignatureCode() {
    return signatureCode;
  }
  public void setSignatureCode(String signatureCode) {
    this.signatureCode = signatureCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("mimeType")
  public MimeType getMimeType() {
    return mimeType;
  }
  public void setMimeType(MimeType mimeType) {
    this.mimeType = mimeType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureDTO {\n");
    
    sb.append("  bytes: ").append(bytes).append("\n");
    sb.append("  signatureCode: ").append(signatureCode).append("\n");
    sb.append("  mimeType: ").append(mimeType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

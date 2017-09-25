package com.viafirma.documents.sdk.java.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.viafirma.documents.sdk.java.model.JSOcrDefinitionPage;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;



@ApiModel(description = "")
public class OcrScanImage  {
  
  private String templateCode = null;
  private String base64Image = null;
  private String imageKey = null;
  private JSOcrDefinitionPage documentDefinition = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
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
  @JsonProperty("base64Image")
  public String getBase64Image() {
    return base64Image;
  }
  public void setBase64Image(String base64Image) {
    this.base64Image = base64Image;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("imageKey")
  public String getImageKey() {
    return imageKey;
  }
  public void setImageKey(String imageKey) {
    this.imageKey = imageKey;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("documentDefinition")
  public JSOcrDefinitionPage getDocumentDefinition() {
    return documentDefinition;
  }
  public void setDocumentDefinition(JSOcrDefinitionPage documentDefinition) {
    this.documentDefinition = documentDefinition;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrScanImage {\n");
    
    sb.append("  templateCode: ").append(templateCode).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("  imageKey: ").append(imageKey).append("\n");
    sb.append("  documentDefinition: ").append(documentDefinition).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



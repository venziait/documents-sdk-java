package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.MenuOption;
import com.viafirma.documents.sdk.java.model.Version;
import java.util.*;
import com.viafirma.documents.sdk.java.model.FinalizeAction;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Configuration  {
  
  private String viafirmaURL = null;
  private Boolean editableURL = null;
  private Boolean frontCamera = null;
  private Boolean autoLogout = null;
  private Boolean showCSV = null;
  private Boolean personMask = null;
  private Boolean registerHide = null;
  private Boolean allowsInvalidSSLCertificate = null;
  private Boolean evidenceBase64 = null;
  private String version = null;
  private Boolean showUpdate = null;
  private String installURL = null;
  private String installMessage = null;
  private String backendVersion = null;
  private List<MenuOption> finalize_menu_options = new ArrayList<MenuOption>() ;
  private Boolean autoRegisterDevice = null;
  private List<Version> versions = new ArrayList<Version>() ;
  private Boolean clientSignature = null;
  private List<FinalizeAction> finalizeActions = new ArrayList<FinalizeAction>() ;
  private Boolean sSLPinningEnabled = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("viafirmaURL")
  public String getViafirmaURL() {
    return viafirmaURL;
  }
  public void setViafirmaURL(String viafirmaURL) {
    this.viafirmaURL = viafirmaURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("editableURL")
  public Boolean getEditableURL() {
    return editableURL;
  }
  public void setEditableURL(Boolean editableURL) {
    this.editableURL = editableURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("frontCamera")
  public Boolean getFrontCamera() {
    return frontCamera;
  }
  public void setFrontCamera(Boolean frontCamera) {
    this.frontCamera = frontCamera;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("autoLogout")
  public Boolean getAutoLogout() {
    return autoLogout;
  }
  public void setAutoLogout(Boolean autoLogout) {
    this.autoLogout = autoLogout;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("showCSV")
  public Boolean getShowCSV() {
    return showCSV;
  }
  public void setShowCSV(Boolean showCSV) {
    this.showCSV = showCSV;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("personMask")
  public Boolean getPersonMask() {
    return personMask;
  }
  public void setPersonMask(Boolean personMask) {
    this.personMask = personMask;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("registerHide")
  public Boolean getRegisterHide() {
    return registerHide;
  }
  public void setRegisterHide(Boolean registerHide) {
    this.registerHide = registerHide;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("allowsInvalidSSLCertificate")
  public Boolean getAllowsInvalidSSLCertificate() {
    return allowsInvalidSSLCertificate;
  }
  public void setAllowsInvalidSSLCertificate(Boolean allowsInvalidSSLCertificate) {
    this.allowsInvalidSSLCertificate = allowsInvalidSSLCertificate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("evidenceBase64")
  public Boolean getEvidenceBase64() {
    return evidenceBase64;
  }
  public void setEvidenceBase64(Boolean evidenceBase64) {
    this.evidenceBase64 = evidenceBase64;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("showUpdate")
  public Boolean getShowUpdate() {
    return showUpdate;
  }
  public void setShowUpdate(Boolean showUpdate) {
    this.showUpdate = showUpdate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("installURL")
  public String getInstallURL() {
    return installURL;
  }
  public void setInstallURL(String installURL) {
    this.installURL = installURL;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("installMessage")
  public String getInstallMessage() {
    return installMessage;
  }
  public void setInstallMessage(String installMessage) {
    this.installMessage = installMessage;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("backendVersion")
  public String getBackendVersion() {
    return backendVersion;
  }
  public void setBackendVersion(String backendVersion) {
    this.backendVersion = backendVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("finalize_menu_options")
  public List<MenuOption> getFinalize_menu_options() {
    return finalize_menu_options;
  }
  public void setFinalize_menu_options(List<MenuOption> finalize_menu_options) {
    this.finalize_menu_options = finalize_menu_options;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("autoRegisterDevice")
  public Boolean getAutoRegisterDevice() {
    return autoRegisterDevice;
  }
  public void setAutoRegisterDevice(Boolean autoRegisterDevice) {
    this.autoRegisterDevice = autoRegisterDevice;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("versions")
  public List<Version> getVersions() {
    return versions;
  }
  public void setVersions(List<Version> versions) {
    this.versions = versions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("clientSignature")
  public Boolean getClientSignature() {
    return clientSignature;
  }
  public void setClientSignature(Boolean clientSignature) {
    this.clientSignature = clientSignature;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("finalizeActions")
  public List<FinalizeAction> getFinalizeActions() {
    return finalizeActions;
  }
  public void setFinalizeActions(List<FinalizeAction> finalizeActions) {
    this.finalizeActions = finalizeActions;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("sSLPinningEnabled")
  public Boolean getSSLPinningEnabled() {
    return sSLPinningEnabled;
  }
  public void setSSLPinningEnabled(Boolean sSLPinningEnabled) {
    this.sSLPinningEnabled = sSLPinningEnabled;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Configuration {\n");
    
    sb.append("  viafirmaURL: ").append(viafirmaURL).append("\n");
    sb.append("  editableURL: ").append(editableURL).append("\n");
    sb.append("  frontCamera: ").append(frontCamera).append("\n");
    sb.append("  autoLogout: ").append(autoLogout).append("\n");
    sb.append("  showCSV: ").append(showCSV).append("\n");
    sb.append("  personMask: ").append(personMask).append("\n");
    sb.append("  registerHide: ").append(registerHide).append("\n");
    sb.append("  allowsInvalidSSLCertificate: ").append(allowsInvalidSSLCertificate).append("\n");
    sb.append("  evidenceBase64: ").append(evidenceBase64).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  showUpdate: ").append(showUpdate).append("\n");
    sb.append("  installURL: ").append(installURL).append("\n");
    sb.append("  installMessage: ").append(installMessage).append("\n");
    sb.append("  backendVersion: ").append(backendVersion).append("\n");
    sb.append("  finalize_menu_options: ").append(finalize_menu_options).append("\n");
    sb.append("  autoRegisterDevice: ").append(autoRegisterDevice).append("\n");
    sb.append("  versions: ").append(versions).append("\n");
    sb.append("  clientSignature: ").append(clientSignature).append("\n");
    sb.append("  finalizeActions: ").append(finalizeActions).append("\n");
    sb.append("  sSLPinningEnabled: ").append(sSLPinningEnabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

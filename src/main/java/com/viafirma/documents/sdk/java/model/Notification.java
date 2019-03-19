package com.viafirma.documents.sdk.java.model;

import com.viafirma.documents.sdk.java.model.Customization;
import com.viafirma.documents.sdk.java.model.Device;
import com.viafirma.documents.sdk.java.model.Param;
import java.util.*;
import com.viafirma.documents.sdk.java.model.SharedLink;
import java.util.Date;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Notification  {
  
  private String code = null;
  private String messageCode = null;
  private String validateCode = null;
  private String validateCodeFinish = null;
  private String text = null;
  private String detail = null;
  private String sound = null;
  public enum StatusEnum {
     SENT,  RECEIVED,  READ,  ERROR,  REJECTED,  EXPIRED,  RESENT,  DISPATCHED,  DISPOSED,  COMPLETED,  WAITING,  INVALID, 
  };
  private StatusEnum status = null;
  public enum NotificationTypeEnum {
     PUSH_IOS,  PUSH_ANDROID,  CALLBACK,  CALLBACK_MAIL,  MAIL,  SMS,   MAIL_SMS, 
  };
  private NotificationTypeEnum notificationType = null;
  private String location = null;
  private SharedLink sharedLink = null;
  private Date updateDate = null;
  private Long retryTime = null;
  private Customization customization = null;
  private List<Param> metadata = new ArrayList<Param>() ;
  private List<Device> devices = new ArrayList<Device>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("validateCode")
  public String getValidateCode() {
    return validateCode;
  }
  public void setValidateCode(String validateCode) {
    this.validateCode = validateCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("validateCodeFinish")
  public String getValidateCodeFinish() {
    return validateCodeFinish;
  }
  public void setValidateCodeFinish(String validateCodeFinish) {
    this.validateCodeFinish = validateCodeFinish;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("sound")
  public String getSound() {
    return sound;
  }
  public void setSound(String sound) {
    this.sound = sound;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("notificationType")
  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }
  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("sharedLink")
  public SharedLink getSharedLink() {
    return sharedLink;
  }
  public void setSharedLink(SharedLink sharedLink) {
    this.sharedLink = sharedLink;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("updateDate")
  public Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("retryTime")
  public Long getRetryTime() {
    return retryTime;
  }
  public void setRetryTime(Long retryTime) {
    this.retryTime = retryTime;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("customization")
  public Customization getCustomization() {
    return customization;
  }
  public void setCustomization(Customization customization) {
    this.customization = customization;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("metadata")
  public List<Param> getMetadata() {
    return metadata;
  }
  public void setMetadata(List<Param> metadata) {
    this.metadata = metadata;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("devices")
  public List<Device> getDevices() {
    return devices;
  }
  public void setDevices(List<Device> devices) {
    this.devices = devices;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  validateCode: ").append(validateCode).append("\n");
    sb.append("  validateCodeFinish: ").append(validateCodeFinish).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("  sound: ").append(sound).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  notificationType: ").append(notificationType).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  sharedLink: ").append(sharedLink).append("\n");
    sb.append("  updateDate: ").append(updateDate).append("\n");
    sb.append("  retryTime: ").append(retryTime).append("\n");
    sb.append("  customization: ").append(customization).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  devices: ").append(devices).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

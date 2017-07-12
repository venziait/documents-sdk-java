package com.viafirma.documents.sdk.java.api;

import com.viafirma.documents.sdk.java.ApiException;
import com.viafirma.documents.sdk.java.ApiInvoker;

import com.viafirma.documents.sdk.java.model.*;

import java.util.*;

import com.viafirma.documents.sdk.java.model.Check;


import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;


public class V3checkApi {

  private static final V3checkApi INSTANCE = new V3checkApi();
  private V3checkApi(){}
  public static V3checkApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Check confirmCheck (String messageCode, String checkCode, String validateCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/check/confirm/{messageCode}/{checkCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "checkCode" + "\\}", ApiInvoker.getInstance().escapeString(checkCode.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      hasFields = true;
      mp.field("validateCode", validateCode, MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("validateCode", validateCode);
      
    }

    try {
      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Check) ApiInvoker.deserialize(response, "", Check.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
    
  public Check rejectCheck (String messageCode, String checkCode, String comment, String validateCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/check/reject/{messageCode}/{checkCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageCode" + "\\}", ApiInvoker.getInstance().escapeString(messageCode.toString()))
      .replaceAll("\\{" + "checkCode" + "\\}", ApiInvoker.getInstance().escapeString(checkCode.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      hasFields = true;
      mp.field("comment", comment, MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("validateCode", validateCode, MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("comment", comment);
      formParams.put("validateCode", validateCode);
      
    }

    try {
      String response = ApiInvoker.getInstance().invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Check) ApiInvoker.deserialize(response, "", Check.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
}


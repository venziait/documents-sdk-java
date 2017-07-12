package com.viafirma.documents.sdk.java.api;

import com.viafirma.documents.sdk.java.ApiException;
import com.viafirma.documents.sdk.java.ApiInvoker;

import com.viafirma.documents.sdk.java.model.*;

import java.util.*;

import com.viafirma.documents.sdk.java.model.Evidence;
import com.viafirma.documents.sdk.java.model.EvidenceFingerPrint;
import com.viafirma.documents.sdk.java.model.EvidenceImage;
import com.viafirma.documents.sdk.java.model.EvidenceSignature;


import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;


public class V3evidencesApi {

  private static final V3evidencesApi INSTANCE = new V3evidencesApi();
  private V3evidencesApi(){}
  public static V3evidencesApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public Evidence addFingerPrintAsEvidence (EvidenceFingerPrint body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/evidences/fingerprint".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/json"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Evidence) ApiInvoker.deserialize(response, "", Evidence.class);
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
  
    
  public Evidence addImageAsEvidence (EvidenceImage body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/evidences/image".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/json"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Evidence) ApiInvoker.deserialize(response, "", Evidence.class);
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
  
    
  public Evidence addSignatureAsEvidence (EvidenceSignature body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/evidences/signature".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      "application/json"
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = ApiInvoker.getInstance().invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Evidence) ApiInvoker.deserialize(response, "", Evidence.class);
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


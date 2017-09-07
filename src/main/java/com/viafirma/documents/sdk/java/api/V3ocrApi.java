package com.viafirma.documents.sdk.java.api;

import com.viafirma.documents.sdk.java.ApiException;
import com.viafirma.documents.sdk.java.ApiInvoker;

import com.viafirma.documents.sdk.java.model.*;

import java.util.*;

import com.viafirma.documents.sdk.java.model.OcrMaskImage;
import com.viafirma.documents.sdk.java.model.OcrPageResult;
import com.viafirma.documents.sdk.java.model.OcrScanImageCustom;

import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class V3ocrApi {

  private static final V3ocrApi INSTANCE = new V3ocrApi();
  private V3ocrApi(){}
  public static V3ocrApi getInstance() {
    return INSTANCE;
  }
  
  
    
  public OcrMaskImage mask (String template, String width) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/v3/ocr/mask/{template}/{width}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "template" + "\\}", ApiInvoker.getInstance().escapeString(template.toString()))
      .replaceAll("\\{" + "width" + "\\}", ApiInvoker.getInstance().escapeString(width.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
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
      String response = ApiInvoker.getInstance().invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (OcrMaskImage) ApiInvoker.deserialize(response, "", OcrMaskImage.class);
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
  
    
  public OcrPageResult parse (OcrScanImageCustom body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v3/ocr/parse".replaceAll("\\{format\\}","json");

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
        return (OcrPageResult) ApiInvoker.deserialize(response, "", OcrPageResult.class);
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

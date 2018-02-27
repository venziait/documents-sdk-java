package com.viafirma.documents.sdk.retrofit;

import com.viafirma.documents.sdk.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Alive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface V3systemApi {
  /**
   * Returns true if service is alive
   * 
   * @return Call&lt;Alive&gt;
   */
  @GET("v3/system/alive")
  Call<Alive> isAlive();
    

}

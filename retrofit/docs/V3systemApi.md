# V3systemApi

All URIs are relative to *http://localhost/documents/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**isAlive**](V3systemApi.md#isAlive) | **GET** v3/system/alive | Returns true if service is alive


<a name="isAlive"></a>
# **isAlive**
> Alive isAlive()

Returns true if service is alive



### Example
```java
// Import classes:
//import com.viafirma.documents.sdk.ApiException;
//import com.viafirma.documents.sdk.retrofit.V3systemApi;


V3systemApi apiInstance = new V3systemApi();
try {
    Alive result = apiInstance.isAlive();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V3systemApi#isAlive");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Alive**](Alive.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


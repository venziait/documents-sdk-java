package com.viafirma.documents.sdk.retrofit;

import com.viafirma.documents.sdk.ApiClient;
import io.swagger.client.model.Alive;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for V3systemApi
 */
public class V3systemApiTest {

    private V3systemApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(V3systemApi.class);
    }

    
    /**
     * Returns true if service is alive
     *
     * 
     */
    @Test
    public void isAliveTest() {
        // Alive response = api.isAlive();

        // TODO: test validations
    }
    
}

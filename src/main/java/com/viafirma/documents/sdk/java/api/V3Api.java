package com.viafirma.documents.sdk.java.api;

import com.viafirma.documents.sdk.java.ApiException;
import com.viafirma.documents.sdk.java.ApiInvoker;
import com.viafirma.documents.sdk.java.model.Token;

public class V3Api {

    Boolean firstAttempt = true;
    String user = null;
    String password = null;
    String auth_mode = null;
    Boolean validateResponse = false;
    
    ApiInvoker apiInvoker = ApiInvoker.getInstance();

    public ApiInvoker getInvoker() {
        return apiInvoker;
    }

    public void setBasePath(String basePath) {
        apiInvoker.setBasePath(basePath);
    }

    public String getBasePath() {
        return apiInvoker.getBasePath();
    }

    public void setConsumerKey(String consumerKey) {
       apiInvoker.setConsumerKey(consumerKey);
    }

    public String getConsumerKey() {
        return apiInvoker.getConsumerKey();
    }

    public void setConsumerSecret(String consumerSecret) {
        apiInvoker.setConsumerSecret(consumerSecret);
    }

    public String getConsumerSecret() {
        return apiInvoker.getConsumerSecret();
    }

    public String getToken() {
        return apiInvoker.getToken();
    }

    public void setToken(String token) {
        apiInvoker.setToken(token);
    }

    public String getTokenSecret() {
        return apiInvoker.getTokenSecret();
    }

    public void setTokenSecret(String tokenSecret) {
        apiInvoker.setTokenSecret(tokenSecret);
    }
    
    public String getProxyHost() {
        return apiInvoker.getProxyHost();
    }

    public void setProxyHost(String proxyHost) {
        apiInvoker.setProxyHost(proxyHost);
    }

    public int getProxyPort() {
        return apiInvoker.getProxyPort();
    }

    public void setProxyPort(int proxyPort) {
        apiInvoker.setProxyPort(proxyPort);
    }

    public Boolean getFirstAttempt() {
        return firstAttempt;
    }

    public void setFirstAttempt(Boolean firstAttempt) {
        this.firstAttempt = firstAttempt;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuth_mode() {
        return auth_mode;
    }

    public void setAuth_mode(String auth_mode) {
        this.auth_mode = auth_mode;
    }

    public Boolean getValidateResponse() {
        return validateResponse;
    }

    public void setValidateResponse(Boolean validateResponse) {
        this.validateResponse = validateResponse;
    }

    public void generateNewToken() throws ApiException {
        setToken(null);
        setTokenSecret(null);
        
        Token token = requestToken();
        setToken(token.getOauth_token());
        setTokenSecret(token.getOauth_token_secret());
        token = accessToken(user, password, auth_mode);
        setToken(token.getOauth_token());
        setTokenSecret(token.getOauth_token_secret());
    }

    public Token requestToken() throws ApiException {
        return V3oauthApi.getInstance().requestToken();
    }

    public Token accessToken(String x_auth_username, String x_auth_password, String x_auth_mode) throws ApiException {
        return V3oauthApi.getInstance().accessToken(x_auth_mode, x_auth_username, x_auth_password);
    }
}
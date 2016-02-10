```java
            V3Api api = new V3Api();
            api.setBasePath(API_URL);
            api.setConsumerKey(CONSUMER_KEY);
            api.setConsumerSecret(CONSUMER_SECRET);
            
            //Configure proxy
            //api.setProxyHost("127.0.0.1");
            //api.setProxyPort(3128);

            if (OAUTH_TYPE == OAuthType.OAUTH_USER) {
                api.setUser(USER_CODE);
                api.setPassword(USER_PASSWORD);
                api.setAuth_mode(AUTH_MODE);
                api.generateNewToken();
            }
```

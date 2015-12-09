```java
                    Download download = V3documentsApi.getInstance().downloadSigned(messageCode);
                    byte[] pdf = IOUtils.toByteArray((new URL(download.getLink())).openStream());
```

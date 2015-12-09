```java
            int count = 100;
            String status = null;
            while (count > 0) {
                count--;
                Message msg = V3messagesApi.getInstance().getMessageByCode(messageCode);
                status = msg.getWorkflow().getCurrent();

                if ("RESPONSED".equals(status)) {
                    Download download = V3documentsApi.getInstance().downloadSigned(messageCode);
                    byte[] pdf = IOUtils.toByteArray((new URL(download.getLink())).openStream());
                    Assert.assertNotNull(pdf);
                } else {
                    Thread.sleep(1000);
                }
            }
```

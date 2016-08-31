```java
            String comment = "Reject message in JUnit test";
            Message rejected = V3messagesApi.getInstance().rejectMessageByCode(messageCode, comment);
            Assert.assertNotNull(rejected);
            Assert.assertEquals("REJECTED", rejected.getWorkflow().getCurrent());
            Assert.assertEquals(comment, rejected.getCommentReject());
```

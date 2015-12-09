```java
            Message message = new Message();

            //Find device in user device list
            Device device = null;
            List<Device> devices = V3devicesApi.getInstance().findDeviceByUser(USER_CODE);
            for (Device d: devices) {
                if (DEVICE_CODE.equals(d.getCode())) {
                    device = d;
                    break;
                }
            }

            // Create notification info
            Notification notification = new Notification();
            notification.setText("External document demo");
            notification.setDetail("Sign a document available at URL");
            notification.setDevices(new ArrayList<Device>());
            notification.getDevices().add(device);
            message.setNotification(notification);

            // Create a template document
            Document document = new Document();
            document.setTemplateReference("http://descargas.viavansi.com/mobile-services/example-sign.pdf");
            document.setTemplateType(TemplateTypeEnum.url);
            message.setDocument(document);

            message.setPolicies(new ArrayList<Policy>());
            Policy policy = new Policy();

            policy.setEvidences(new ArrayList<Evidence>());
            Evidence evidence = new Evidence();
            evidence.setType(TypeEnum.SIGNATURE);
            evidence.setHelpText("User signature");
            evidence.setTypeFormatSign("XADES_B");
            policy.getEvidences().add(evidence);

            policy.setSignatures(new ArrayList<Signature>());
            Signature signature = new Signature();
            signature.setType(com.viafirma.documents.sdk.java.model.Signature.TypeEnum.SERVER);
            signature.setHelpText("Server signature");
            signature.setTypeFormatSign(com.viafirma.documents.sdk.java.model.Signature.TypeFormatSignEnum.PADES_LTA);
            policy.getSignatures().add(signature);

            message.getPolicies().add(policy);

            //java example in https://github.com/viavansi/ms-callback
            message.setCallbackURL("https://localhost:8080/ms-callback/response");

            //send document by email (optional)
            message.setCallbackMails("user1@mail.com,user2@mail.com");

            String messageCode = V3messagesApi.getInstance().sendMessage(message);
            Assert.assertNotNull(messageCode);
```

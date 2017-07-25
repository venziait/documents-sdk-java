```java
        Message message = new Message();

        Document document = new Document();
        document.setTemplateCode(TEMPLATE_CODE);
        document.setTemplateType(TEMPLATE_TYPE);
        document.setItems(new ArrayList<Item>());

        Item item01 = new Item();
        item01.setKey("KEY_01");
        item01.setValue("Jhon");
        document.getItems().add(item01);

        Item item02 = new Item();
        item02.setKey("KEY_02");
        item02.setValue("Doe");
        document.getItems().add(item02);

        Item item03 = new Item();
        item03.setKey("KEY_03");
        item03.setValue("11111111T");
        document.getItems().add(item03);

        message.setDocument(document);

        //Find device in user device list
        Device device = null;
        List<Device> devices = V3devicesApi.getInstance().findDeviceByUser(USER_CODE);
        for (Device d: devices) {
            if (DEVICE_CODE.equals(d.getCode())) {
                device = d;
                break;
            }
        }

        Notification notification = new Notification();
        notification.setText("Notification Example");
        notification.setDevices(new ArrayList<Device>());
        notification.getDevices().add(device);

        message.setNotification(notification);

        message.setPolicies(new ArrayList<Policy>());
        Policy policy = new Policy();

        policy.setEvidences(new ArrayList<Evidence>());
        Evidence evidence = new Evidence();
        evidence.setType(TypeEnum.SIGNATURE);
        evidence.setHelpText("User signature");
        evidence.setTypeFormatSign("XADES_B");
        policy.getEvidences().add(evidence);
        
        //Add ocr image evidence
        evidence = new Evidence();
        evidence.setType(TypeEnum.IMAGE);
        evidence.setHelpText("DNI front page");
        evidence.setTypeFormatSign("XADES_B");
        List<Position> positions = new LinkedList<Position>();
        Position position = new Position();
        position.setPage(1);
        Rectangle rectangle = new Rectangle();                    
        rectangle.setHeight(50);
        rectangle.setWidth(100);
        rectangle.setX(275);
        rectangle.setY(400);
        position.setRectangle(rectangle);
        positions.add(position);
        evidence.setPositions(positions);
        OcrData ocr = new OcrData();
        ocr.setKey(OCR_TEMPLATE_KEY);
        ocr.setOffline(false);
        ocr.setVersion(1.0);
        evidence.setOcr(ocr);
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
```

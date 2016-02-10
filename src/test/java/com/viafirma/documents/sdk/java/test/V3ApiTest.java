/* Copyright (C) 2012 Viafirma - Viavansi Servicios Avanzados para las Instituciones S.L. (VIAVANSI)
   For any commercial use of this software contact info@viafirma.com.
   Encoding: UTF-8
 */
package com.viafirma.documents.sdk.java.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.viafirma.documents.sdk.java.ApiException;
import com.viafirma.documents.sdk.java.api.V3Api;
import com.viafirma.documents.sdk.java.api.V3devicesApi;
import com.viafirma.documents.sdk.java.api.V3documentsApi;
import com.viafirma.documents.sdk.java.api.V3messagesApi;
import com.viafirma.documents.sdk.java.api.V3templateApi;
import com.viafirma.documents.sdk.java.model.Container;
import com.viafirma.documents.sdk.java.model.Device;
import com.viafirma.documents.sdk.java.model.Document;
import com.viafirma.documents.sdk.java.model.Document.TemplateTypeEnum;
import com.viafirma.documents.sdk.java.model.Download;
import com.viafirma.documents.sdk.java.model.ErrorResponse;
import com.viafirma.documents.sdk.java.model.Evidence;
import com.viafirma.documents.sdk.java.model.Evidence.TypeEnum;
import com.viafirma.documents.sdk.java.model.Form;
import com.viafirma.documents.sdk.java.model.Item;
import com.viafirma.documents.sdk.java.model.Message;
import com.viafirma.documents.sdk.java.model.Notification;
import com.viafirma.documents.sdk.java.model.Policy;
import com.viafirma.documents.sdk.java.model.Row;
import com.viafirma.documents.sdk.java.model.Signature;
import com.viafirma.documents.sdk.java.model.Template;
import com.viafirma.documents.sdk.java.model.Workflow;

enum OAuthType{
    OAUTH_APPLICATION,
    OAUTH_USER
}

/**
 * JUnit Test
 */
public class V3ApiTest {

    private static final String TEMPLATE_CODE = "301_example";
    private static final TemplateTypeEnum TEMPLATE_TYPE = TemplateTypeEnum.docx;

    private static final String USER_CODE = "user";
    private static final String USER_PASSWORD = "12345";
    private static final String DEVICE_CODE = "ipad-user";

    private static final OAuthType OAUTH_TYPE = OAuthType.OAUTH_APPLICATION;
    private static final String API_URL = "http://localhost:7080/documents/api";
    private static final String CONSUMER_KEY = "com.viafirma.mobile.services.crm";
    private static final String CONSUMER_SECRET = "XXXXXXXX";
    private static final String AUTH_MODE = "client_auth";

    private static final String MESSAGE_CODE = "XXXXXXXXXX";

    @BeforeClass
    public static void setupOnce() {
        try {
            //BEGIN-SNIPPET: api_initialize
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
            //END-SNIPPET
        } catch (ApiException e) {
            Assert.assertEquals(e.getCode(), 401);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void t01FindDeviceByUser() {
        try {
            //BEGIN-SNIPPET: api_v3_user_devices
            List<Device> devices = V3devicesApi.getInstance().findDeviceByUser(USER_CODE);
            //END-SNIPPET
            Assert.assertNotNull(devices);
        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        }
    }

    @Test
    public void t02FindTemplateByCode() {
        try {
            //BEGIN-SNIPPET: api_v3_find_template
            Template template = V3templateApi.getInstance().findTemplateByCode(TEMPLATE_CODE);
            //END-SNIPPET

            //BEGIN-SNIPPET: api_v3_find_template_items
            //Find items in template form
            Form form = template.getForm();
            for(Container container: form.getContainers()){
                for(Row row: container.getRows()){
                    for(Item item: row.getItems()){
                        if (item.getKey().equals("KEY_01")) {
                            item.setValue("Jhon");
                        } else if (item.getKey().equals("KEY_02")) {
                            item.setValue("Doe");
                        } else if (item.getKey().equals("KEY_03")) {
                            item.setValue("11111111T");
                        }
                    }
                }
            }
            //END-SNIPPET

            Message message = new Message();
            //BEGIN-SNIPPET: api_v3_find_template_policies
            // Copy policies form template
            message.setPolicies(template.getForm().getSettings().getPolicies());
            //END-SNIPPET

            Assert.assertNotNull(template);
        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        }
    }

    @Test
    public void t02SendMessage() {
        try {

            //BEGIN-SNIPPET: api_v3_send_message
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
            //END-SNIPPET

            Assert.assertNotNull(messageCode);

            //BEGIN-SNIPPET: api_v3_send_messages_poll
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
            //END-SNIPPET
        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void t04GetMessageByCode() {
        try {
            //BEGIN-SNIPPET: api_v3_get_message
            Message message = V3messagesApi.getInstance().getMessageByCode(MESSAGE_CODE);
            //END-SNIPPET
            Assert.assertNotNull(message);
        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        }
    }

    @Test
    public void t05GetDocument() {

        InputStream in = null;
        try {
            String url = V3documentsApi.getInstance().downloadSigned(MESSAGE_CODE).getLink();
            int size = 1024;
            byte[] bytes;

            final URL u = new URL(url);
            URLConnection connection = u.openConnection();
            in = connection.getInputStream();
            if (in instanceof ByteArrayInputStream) {
                size = in.available();
                bytes = new byte[size];
                in.read(bytes, 0, size);
            } else {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                bytes = new byte[size];
                int len;
                while ((len = in.read(bytes, 0, size)) != -1) {
                    bos.write(bytes, 0, len);
                }
                bytes = bos.toByteArray();
            }
            Assert.assertNotNull(bytes);
        } catch (IOException e) {
            Assert.assertNotNull(testApiException(new ApiException()));
        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    Assert.assertNotNull(testApiException(new ApiException()));
                }
            }
        }
    }

    @Test
    public void t06CreateDocument() throws Exception {

        // Build a new document (PDF) from a template. This user case implements EX005 workflow code, usseful to print 
        // your document when iOS/Android devices are not availables.

        String messageCode = null;
        try {

            //BEGIN-SNIPPET: api_v3_create_document
            Message message = new Message();

            // Create notification info
            Notification notification = new Notification();
            notification.setText("Title");
            notification.setDetail("Detail");
            message.setNotification(notification);

            Workflow workflow = new Workflow();
            // only generate PDF from template. It´s not sent to mobile devices.
            workflow.setCode("EX005"); 
            message.setWorkflow(workflow);

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

            //java example in https://github.com/viavansi/ms-callback
            message.setCallbackURL("https://localhost:8080/ms-callback/response");

            //send document by email (optional)
            message.setCallbackMails("user1@mail.com,user2@mail.com");

            messageCode = V3messagesApi.getInstance().sendMessage(message);
            //END-SNIPPET
            Assert.assertNotNull(messageCode);

        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        }

        try{
            //BEGIN-SNIPPET: api_v3_create_document_poll
            int count = 100;
            String status = null;
            while (count > 0) {
                count--;
                Message msg = V3messagesApi.getInstance().getMessageByCode(messageCode);
                status = msg.getWorkflow().getCurrent();

                if ("RESPONSED".equals(status)) {
                    Download download = V3documentsApi.getInstance().downloadTemporal(messageCode);
                    byte[] pdf = IOUtils.toByteArray((new URL(download.getLink())).openStream());
                    Assert.assertNotNull(pdf);
                } else {
                    Thread.sleep(1000);
                }
            }
            //END-SNIPPET
        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        }
    }

    public void t07CreateMessageWithTemplate() throws Exception {

        try {
            //BEGIN-SNIPPET: api_v3_send_message_template
            Message message = new Message();

            // Create notification info
            Notification notification = new Notification();
            notification.setText("Title");
            notification.setDetail("Detail");

            // Find user device
            Device device = V3devicesApi.getInstance().findDeviceByUser(USER_CODE).get(0);
            notification.setDevices(new ArrayList<Device>());
            notification.getDevices().add(device);
            message.setNotification(notification);

            Document document = new Document();
            document.setTemplateCode(TEMPLATE_CODE);
            document.setTemplateType(TEMPLATE_TYPE);
            document.setItems(new ArrayList<Item>());

            //GET Template info
            Template template = V3templateApi.getInstance().findTemplateByCode(TEMPLATE_CODE);

            //Find items in template form
            Form form = template.getForm();
            for(Container container: form.getContainers()){
                for(Row row: container.getRows()){
                    for(Item item: row.getItems()){
                        if (item.getKey().equals("KEY_01")) {
                            item.setValue("Jhon");
                        } else if (item.getKey().equals("KEY_02")) {
                            item.setValue("Doe");
                        } else if (item.getKey().equals("KEY_03")) {
                            item.setValue("11111111T");
                        }
                        //Add item to document
                        document.getItems().add(item);
                    }
                }
            }

            message.setDocument(document);

            // Copy policies form template
            message.setPolicies(template.getForm().getSettings().getPolicies());

            //java example in https://github.com/viavansi/ms-callback
            message.setCallbackURL("https://localhost:8080/ms-callback/response");

            //send document by email (optional)
            message.setCallbackMails("user1@mail.com,user2@mail.com");

            String messageCode = V3messagesApi.getInstance().sendMessage(message);
            //END-SNIPPET
            System.out.println(messageCode);
            Assert.assertNotNull(messageCode);

            int count = 100;
            String status = null;
            while (count > 0) {
                count--;
                Message msg = V3messagesApi.getInstance().getMessageByCode(messageCode);
                status = msg.getWorkflow().getCurrent();

                if ("RESPONSED".equals(status)) {
                    //BEGIN-SNIPPET: api_v3_download_document
                    Download download = V3documentsApi.getInstance().downloadSigned(messageCode);
                    byte[] pdf = IOUtils.toByteArray((new URL(download.getLink())).openStream());
                    //END-SNIPPET
                    Assert.assertNotNull(pdf);
                } else {
                    Thread.sleep(10000);
                }
            }
            //END-SNIPPET

        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        }
    }

    public void t08SignExternalDocument() throws Exception {

        try {
            //BEGIN-SNIPPET: api_v3_send_external_doc
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
            //END-SNIPPET
        } catch (ApiException e) {
            Assert.assertNotNull(testApiException(e));
        }
    }

    public ErrorResponse testApiException(ApiException e) {
        try {
            Assert.assertFalse(e.getMessage().contains("<"));
            ObjectMapper mapper = new ObjectMapper();
            ErrorResponse error = mapper.readValue(e.getMessage(), ErrorResponse.class);
            Assert.assertNotNull(error);
            Assert.assertTrue(String.valueOf(e.getMessage()), false);
            return error;
        } catch (Exception e1) {
            return null;
        }
    }

}

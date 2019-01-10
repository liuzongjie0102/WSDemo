package com.service.service;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;

public class WebServiceClient {
    public static void main(String[] args){
        ClientProxyFactoryBean factory = new ClientProxyFactoryBean(new JaxWsClientFactoryBean());
        factory.setAddress("http://127.0.0.1:8989/service");
        factory.setServiceClass(IWebService.class);
        IWebService service = (IWebService) factory.create();
        String rsp = service.sayHello();
        System.out.println("rsp:" + rsp);
    }
}

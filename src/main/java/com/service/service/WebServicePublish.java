package com.service.service;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

public class WebServicePublish {
    public static void main(String[] args){
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setAddress("http://127.0.0.1:8989/service");
        factory.setServiceClass(WebServiceImpl.class);
        factory.create();
//        String address = "http://127.0.0.1:8989/service";
//        Endpoint.publish(address, new WebServiceImpl());
        System.out.println("succeed");
    }
}

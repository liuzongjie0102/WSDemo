package com.service.service;

public class
WebServiceImpl implements IWebService {

    public String sayHello() {
        String name = "Zongjiedda";

        return "hello world" + name;
    }
}

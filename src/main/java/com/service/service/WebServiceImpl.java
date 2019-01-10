package com.service.service;

public class
WebServiceImpl implements IWebService {

    public String sayHello() {
        String name = "Zongjied";

        return "hello world" + name;
    }
}

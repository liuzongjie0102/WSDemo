package com.service.service;

public class
WebServiceImpl implements IWebService {

    public String sayHello() {
        String name = "Zongjieddafe";

        return "hello world" + name;
    }
}

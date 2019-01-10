package com.service.service;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IWebService {
    @WebMethod
    String sayHello();
    @WebMethod
    String localTest();

    @WebMethod
    String testSay();
}

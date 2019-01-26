package com.service.service;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;


@config
public class WsConfig {


    ClientProxyFactoryBean getFactory(){


        return factory;
    }


}

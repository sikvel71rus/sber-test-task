package ru.ibs.gasu.ws.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.ibs.gasu.service.HelloService;
import ru.ibs.gasu.ws.HelloWebService;

import javax.jws.WebService;

/**
 * Created by evgeniy on 11.12.18.
 */
@WebService(endpointInterface = "ru.ibs.gasu.ws.HelloWebService", serviceName = "HelloSoap")
public class HelloWebServiceImpl implements HelloWebService {

    @Autowired
    private HelloService helloService;

    @Override
    public String hello(String userName) {
        return helloService.hello(userName);
    }

}

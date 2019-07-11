package ru.ibs.gasu.ws.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.ibs.gasu.domain.Message;
import ru.ibs.gasu.ws.HelloWebService;

import javax.jws.WebService;

/**
 * Created by evgeniy on 11.12.18.
 */
@WebService(endpointInterface = "ru.ibs.gasu.ws.HelloWebService", serviceName = "HelloSoap")
public class HelloWebServiceImpl implements HelloWebService {

    @Override
    public Message hello(String userName) {
        Message result = new Message();
        result.setId(1L);
        result.setMessage("Hello from message " + userName);
        return result;
    }

}

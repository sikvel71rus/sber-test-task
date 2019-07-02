package ru.ibs.gasu.service;

import org.springframework.stereotype.Service;
import ru.ibs.gasu.ws.HelloWebService;

/**
 * Created by evgeniy on 11.12.18.
 */
@Service
public class HelloService implements HelloWebService {

    @Override
    public String hello(String userName) {
        return "Hello " + userName + "!";
    }
}

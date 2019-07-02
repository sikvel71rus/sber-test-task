package ru.ibs.gasu.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by evgeniy on 11.12.18.
 */
@WebService
public interface HelloWebService {

    @WebMethod
    @WebResult(name = "helloResponse")  String hello(@WebParam(name = "userName") String userName);

}

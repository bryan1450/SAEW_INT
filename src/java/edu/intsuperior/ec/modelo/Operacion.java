/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.intsuperior.ec.modelo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author Bryan
 */
@WebService(serviceName = "Operacion")
public class Operacion {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public int operation(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        //TODO write your implementation code here:
        return numero1+numero2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation_1")
    @RequestWrapper(className = "edu.operation_1")
    @ResponseWrapper(className = "edu.operation_1Response")
    public String operation() {
        //TODO write your implementation code here:
        return null;
    }
}

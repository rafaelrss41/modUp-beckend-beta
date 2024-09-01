package com.modUp.beta.controller;

import com.modUp.beta.exceptions.ClientNullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class ClientsControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ClientNullException.class)
    public ResponseEntity<Object> captureClientsException(){

        Map<String, Object> body = new HashMap<String,Object>();

        body.put("message", "O campo nome não pode ser vazio");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

}

package com.hh.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ExceptionHandlerGlobal {

       @ExceptionHandler(Exception.class)
       public String exception(Exception e){
           String message = e.getMessage();
           return message;
       }


}

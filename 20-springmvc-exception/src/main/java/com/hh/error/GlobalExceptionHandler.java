package com.hh.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//handler-操作者 advice建议
@ControllerAdvice  //转发  重定向 静态资源 的yic
@RestControllerAdvice //多加了json返回的异常
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String GlobalException(Exception e){
        String message = e.getMessage();//获取异常信息
        return  message;
    }
}

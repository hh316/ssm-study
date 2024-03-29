package com.hh.Advice;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
@Component
public class xmlAdvice {
    //前置通知
    public void beFore(JoinPoint joinPoint){
        System.out.println("xml方法开始了");

    }
    //后置通知
    public void afterReturning(Object result){
        result ="haha";
        System.out.println("xml方法结束了");
    }
    //异常通知
    public void afterThrowing(JoinPoint joinPoint,Throwable t){
        System.out.println("xml方法报错了");
    }
}

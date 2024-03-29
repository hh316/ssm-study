package com.hh.Advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Order(3)
public class AdviceAround {
    @Around("com.hh.pointcut.MyPointCut.pc()")
    public Object Advice(ProceedingJoinPoint proceedingJoinPoint){
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;
        try {
            System.out.println("开启事物");
            result = proceedingJoinPoint.proceed(args);
            System.out.println("关闭事物");
        } catch (Throwable throwable) {
            System.out.println("事物回滚");
            throwable.printStackTrace();
        }finally {
            System.out.println("最终通知");
        }
        return result;
    }
}

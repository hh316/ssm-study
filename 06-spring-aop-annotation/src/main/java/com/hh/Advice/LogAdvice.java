package com.hh.Advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

@Component
//@Aspect
@Order(2)
public class LogAdvice {
    //前置通知
    @Before("com.hh.pointcut.MyPointCut.pc()")
    public void beFore(JoinPoint joinPoint){
        //1.获取方法属于类的信息
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        System.out.println("类的信息："+simpleName);
        //2.获得方法名称
        int modifiers = joinPoint.getSignature().getModifiers();
        String s = Modifier.toString(modifiers);
        System.out.println("方法名称1："+s);
        String name = joinPoint.getSignature().getName();
        System.out.println("方法名称2"+name);
        //3.获取形参列表
        Object[] args = joinPoint.getArgs();
        System.out.println("args = " + args);
        System.out.println("方法开始了");
    }
    //后置通知
    @AfterReturning("com.hh.pointcut.MyPointCut.pc()")
    public void afterReturning(){
        System.out.println("方法结束了");
    }
    //异常通知
    @AfterThrowing("com.hh.pointcut.MyPointCut.pc()")
    public void afterThrowing(){
        System.out.println("方法报错了");
    }
    //最后通知
    @After("com.hh.pointcut.MyPointCut.pc()")
    public void after(){
        System.out.println("最终通知");
    }
//    @Around("execution(* com.hh.service.*.*(..))")
//    public void around(){
//        System.out.println("环绕通知");
//    }

}

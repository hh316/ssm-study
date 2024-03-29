package com.hh.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointCut {
    @Pointcut("execution(* com.hh.service.*.*(..))")
    public void pc(){

    }
}

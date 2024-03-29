package com.hh;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
public class ComponentBean {
    //周期方法需要导坐标
    @PostConstruct
    public  void init(){
        System.out.println("初始化周期方法PostConstruct");
    }
    @PreDestroy
    public void  destroy(){
        System.out.println("销毁周期方法PreDestroy");

    }}

package com.hh;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
//多例模式
//多例模式的销毁周期方法不会生效
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Dao1 implements Dao{
    @PostConstruct
    public void init(){
        System.out.println("多例模式的init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("多例模式的destroy");
    }
    public String daoShow(){
        return  "dao1";

    }}

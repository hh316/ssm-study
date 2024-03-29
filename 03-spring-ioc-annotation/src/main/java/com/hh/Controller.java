package com.hh;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@org.springframework.stereotype.Controller
//单例模式
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Controller {
    @PostConstruct
    public void init(){
        System.out.println("单例模式的init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("单例模式的destroy");
    }
}

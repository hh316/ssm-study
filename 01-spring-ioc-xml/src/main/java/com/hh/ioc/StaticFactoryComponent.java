package com.hh.ioc;
//静态工厂实例化
public class StaticFactoryComponent {

    private static  StaticFactoryComponent staticFactoryComponent = new StaticFactoryComponent();

    public  static  StaticFactoryComponent createInstance(){
        return staticFactoryComponent;
    }
}

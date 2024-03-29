package com.hh.ioc;
//非静态工厂实例化
public class NoStaticFactoryComponent {
       private static  People people = new People();

       public People creatNoStaticFactoryInstance(){
           return people;
       }
}

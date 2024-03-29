package com.hh.ioc;

import org.springframework.beans.factory.FactoryBean;
//FactoryBean工厂创建对象，如mybatis创建对象就用这个
public class SpringFactoryBean implements FactoryBean<People>{
    private String value ;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public People getObject() throws Exception {
        People people = new People();
         people.setName(value);
        return people;
    }

    @Override
    public Class<?> getObjectType() {
        return People.class;
    }
}

package com.hh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//基本数据类型的DI
@Component
public class JavaBean {
    //方式1：直接赋值
    private String name = "二狗子";
    //方式2：@Value赋值
    @Value("admin")
    private String username;
    @Value("${jdbc.password:123456}")
    private String password;

    @Override
    public String toString() {
        return "JavaBean{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

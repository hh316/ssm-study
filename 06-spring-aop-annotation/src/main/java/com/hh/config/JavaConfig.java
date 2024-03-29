package com.hh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.hh")
@Configuration
@EnableAspectJAutoProxy//开启aop的注解-aspect
public class JavaConfig {


}

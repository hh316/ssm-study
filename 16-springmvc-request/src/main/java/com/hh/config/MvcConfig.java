package com.hh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@ComponentScan("com.hh.controller")
public class MvcConfig {

   @Bean
    public RequestMappingHandlerMapping handlerMapping(){
       //秘书分配请求
       return new RequestMappingHandlerMapping();
   }
   @Bean
    public RequestMappingHandlerAdapter handlerAdapter(){
       //经理-简化请求和响应
       return new RequestMappingHandlerAdapter();
   }
}

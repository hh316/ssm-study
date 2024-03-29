package com.hh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc //会添加HandlerMapping 和 HandlerAdapter并且给handlerAdapter配置json转换器 --
@Configuration
@ComponentScan("com.hh.controller")
public class SpringMvcConfig {
    //秘书-分配请求
//    @Bean
//    public RequestMappingHandlerMapping requestMappingHandlerMapping(){
//        return new RequestMappingHandlerMapping();
//    }
//    //经理-简化请求和响应
//    @Bean
//    public RequestMappingHandlerAdapter requestMappingHandlerAdapter(){
//        return new RequestMappingHandlerAdapter();
//    }
}

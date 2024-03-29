package com.hh.config;

import com.hh.interceptor.InterceptorHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
/*
 * 1.扫描controller层包,全局异常处理error包
 * 2.开启注解@EnableWebMvc:                     handlerMapping handlerAdapter json转化器
 * 3.静态资源处理 jsp视图解析器前后缀 拦截器:    configureDefaultServletHandling configureViewResolvers addInterceptors
 */
@Configuration
@ComponentScan({"com.hh.controller","com.hh.error"})
@EnableWebMvc
public class ControllerConfig  implements WebMvcConfigurer {
    //1.开启静态资源
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    //2.视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views","jsp");
    }
    //3.拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorHandler());
    }
}

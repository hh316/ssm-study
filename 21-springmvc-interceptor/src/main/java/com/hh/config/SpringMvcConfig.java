package com.hh.config;


import com.hh.interceptor.InterceptorHandler2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.hh.controller")
@EnableWebMvc//开启springmvc和json转换器的注解
public class SpringMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //代表所有的handler方法都被拦截
        //addPathPatterns指定拦截路径  * 一层下的所有路径  ** 任意曾下的所有路径
        //excludePathPatterns排除拦截路径
        registry.addInterceptor(new InterceptorHandler2()).addPathPatterns("/interceptor/**").excludePathPatterns("/interceptor/data");
    }
}

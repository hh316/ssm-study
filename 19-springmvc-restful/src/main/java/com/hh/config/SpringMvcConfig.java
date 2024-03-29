package com.hh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.hh.controller")
public class SpringMvcConfig implements WebMvcConfigurer {
    //实现WebmvcConfigurer--可以配置视图解析器和静态资源的访问

}

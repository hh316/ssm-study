package com.hh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.hh.controller")
@EnableWebMvc//开启springmvc和json转换器的注解
public class SpringMvcConfig implements WebMvcConfigurer {

}

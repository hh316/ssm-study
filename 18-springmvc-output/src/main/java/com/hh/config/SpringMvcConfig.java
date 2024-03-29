package com.hh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.hh.controller")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
// @EnableWebMvc   handlerMapping分配请求 handlerAdapter简化请求和响应 json转换器

    @Override
    //视图解析器
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/Views/",".jsp");
    }

    //开启静态资源查询
    //WEB-INF下的文件外部访问不到
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}

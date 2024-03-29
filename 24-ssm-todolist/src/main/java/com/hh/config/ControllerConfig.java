package com.hh.config;

import com.hh.utils.InterceptorHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan({"com.hh.controller","com.hh.utils"})
@EnableWebMvc
public class ControllerConfig implements WebMvcConfigurer {
    //1.开启静态资源 -28
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    //2.开启视图解析器 -46
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views","jsp");
    }
    //3.拦截器  -34
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorHandler()).addPathPatterns("/**");
    }
}

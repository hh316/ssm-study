package com.hh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //ioc的配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    //内涵ioc容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }
    //servlet拦截的地址-拦截所有地址
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

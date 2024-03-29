package com.hh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//-自动装配核心容器-ioc
public class springMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //mybatis配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    //springMvc配置
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    //拦截路径配置
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

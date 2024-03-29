package com.hh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    //root容器的配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ServiceConfig.class,MapperConfig.class,DataSourceConfig.class};
    }
    //web容器的配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ControllerConfig.class};
    }
    //拦截路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

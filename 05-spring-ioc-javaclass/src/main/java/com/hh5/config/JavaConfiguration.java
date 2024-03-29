package com.hh5.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

@Import(JavaConfigurationB.class)
//配置类代替xml文件
@Configuration
@ComponentScan({"com.hh5","com.hh6"})
@PropertySource("classpath:jdbc.properties")
public class JavaConfiguration {
    //可以放在形参上
    @Value("${hh.url}")
    private String url;
    @Value("${hh.username}")
    private String userName;
    @Value("${hh.password}")
    private String passWord;
    @Value("${hh.driver}")
    private String driverClassName;
   //方法名就是beanId也可以自己起名
   @Bean(value = "dddd")
   public DruidDataSource druidDataSource(){
       DruidDataSource druidDataSource = new DruidDataSource();
       druidDataSource.setUrl(url);
       druidDataSource.setUsername(userName);
       druidDataSource.setPassword(passWord);
       druidDataSource.setDriverClassName(driverClassName);
       return druidDataSource;
   }
   //bean作用域
   @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
   //bean的周期方法
   @Bean(initMethod = "",destroyMethod = "")
   //两种注入方式形参或者方法名
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
       JdbcTemplate jdbcTemplate = new JdbcTemplate();
       jdbcTemplate.setDataSource(druidDataSource());
       return jdbcTemplate;
   }


}

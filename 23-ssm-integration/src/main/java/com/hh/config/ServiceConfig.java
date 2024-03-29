package com.hh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
/*
   1.扫描service层包
   2.开启@EnableAspectJAutoProxy  :    aop-面向切面注解:aspect : @Before @After @AfterReturning @AfterThrowing @Around  @Aspect @Order
   3.开启EnableTransactionManagement:  tx-声明式事务注解和配置对应的连接池事务: new DataSourceTransactionManager()
 */

@Configuration
@ComponentScan("com.hh.service")
@EnableAspectJAutoProxy      //aop
@EnableTransactionManagement //tx
public class ServiceConfig {
     //DataSource-连接池
     //transactionManager-事务
     @Bean
    public TransactionManager transactionManager(DataSource dataSource){
         DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
         dataSourceTransactionManager.setDataSource(dataSource);
         return dataSourceTransactionManager;
     }

}

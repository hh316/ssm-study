package com.hh.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.hh")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class TxConfig {
    @Value("${hh.driver}")
    private String driver;
    @Value("${hh.url}")
    private String url;
    @Value("${hh.username}")
    private String userName;
    @Value("${hh.password}")
    private String passWord;



    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
       druidDataSource.setUrl(url);
       druidDataSource.setUsername(userName);
       druidDataSource.setPassword(passWord);
       return druidDataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    @Bean
    public TransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;

    }
}

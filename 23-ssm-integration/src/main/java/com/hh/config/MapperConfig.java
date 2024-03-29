package com.hh.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/*
  1.扫描mapper层包
  2.sqlSessionFactory,mapper加入Ioc:    new SqlSessionFactoryBean()  new MapperScannerConfigurer()
 */
@Configuration
@ComponentScan("com.hh.mapper")
public class MapperConfig {
     @Bean
     public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
         SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
         //指定数据库连接池
         sqlSessionFactoryBean.setDataSource(dataSource);
//       方式1：
//       xml形式的配置文件-运行效率不好-由代码替代
//       Resource resource = new ClassPathResource("mybatis-config.xml");
//       sqlSessionFactoryBean.setConfigLocation(resource)
//       方式2：
         //配置mybatis的功能-代替xml
         org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
         //开启驼峰映射
         configuration.setMapUnderscoreToCamelCase(true);//Underscore 下划线 CamelCase 骆驼
         //开启日志输出
         configuration.setLogImpl(Slf4jImpl.class);
         //开启resultMap的自动映射
         configuration.setAutoMappingBehavior(AutoMappingBehavior.FULL);
         //存储<setting>标签的配置
         sqlSessionFactoryBean.setConfiguration(configuration);
         //别名设置
         sqlSessionFactoryBean.setTypeAliasesPackage("com.hh.pojo");
         //开启分页插件-插件拦截器-new PageInterceptor()
         PageInterceptor pageInterceptor = new PageInterceptor();
         Properties properties = new Properties();
         properties.setProperty("helperDialect","mysql");
         pageInterceptor.setProperties(properties);
         sqlSessionFactoryBean.addPlugins(pageInterceptor);
         return sqlSessionFactoryBean;
     }


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.hh.mapper");//创建出所有mapper的代理对象
        return mapperScannerConfigurer;
    }
}

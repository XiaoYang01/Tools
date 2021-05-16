package com.g9.work.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 20:15 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
@Configuration
@ComponentScan("com.g9.work.service")
@EnableTransactionManagement //开启事务
@Import(MybatisSpring.class)
public class ServiceConfig {
    //dataSource提交给事务
    @Bean(name = "dataSourceTransactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(DriverManagerDataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        //赋值
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}

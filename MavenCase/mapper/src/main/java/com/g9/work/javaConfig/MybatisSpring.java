package com.g9.work.javaConfig;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 19:11 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("com.g9.work.mapper")
@ComponentScan("com.g9.work.entity")
public class MybatisSpring {
    //赋值
    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${root}")
    private String root;
    @Value("${password}")
    private String password;

    //dataSource
    @Bean(name = "driverManagerDataSource")
    public DriverManagerDataSource getDriverManagerDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //赋值
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(root);
        dataSource.setPassword(password);
        return dataSource;
    }

    //SqlSessionFactoryBean
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactoryBean(DriverManagerDataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        //绑定数据源
        sessionFactory.setDataSource(dataSource);
        //绑定mybatis-config.xml
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        return sessionFactory.getObject();
    }

    //sqlsession
    @Bean(name = "sqlsession")
    public SqlSessionTemplate getSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        SqlSessionTemplate sqlSession = new SqlSessionTemplate(sqlSessionFactory);
        return sqlSession;
    }
}

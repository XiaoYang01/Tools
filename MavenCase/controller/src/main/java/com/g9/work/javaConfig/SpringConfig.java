package com.g9.work.javaConfig;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.*;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 18:24 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
@Configuration
@Import(ServiceConfig.class)
public class SpringConfig {
    //jackson
    @Bean(name = "obj")
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }


}

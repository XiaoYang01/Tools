package com.g9.work.javaConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 18:46 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
public class MyWebappInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //Spring配置文件
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //SpringMVC配置文件
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    //DispatcherServlet的映射
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

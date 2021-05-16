package com.g9.work.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 20:28 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
@Aspect
@Component
public class AccountAdvice {
    //增强
    @After("execution(* com.g9.work.service.impl.*.*(..))")
    public void addAdvice(){
        System.out.println("\"aop增强了该方法\" = " + "aop增强了该方法");
    }
}

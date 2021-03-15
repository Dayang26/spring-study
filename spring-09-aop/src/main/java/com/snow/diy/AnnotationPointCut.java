package com.snow.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

/**
 * @author Snow
 * @create 2021-03-15 12:51
 * 使用注解方式实现AOP
 * @Aspect 标注此类为切面
 */
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.snow.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前————————");
    }

    @After("execution(* com.snow.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后————————");
    }

    //在环绕增强中,我们可以给定一个参数,代表我们要获取处理切入的点
    @Around("execution(* com.snow.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");

        Signature signature = joinPoint.getSignature();
        System.out.println(signature);
        Object proceed = joinPoint.proceed();

        System.out.println("环绕后");

    }

}

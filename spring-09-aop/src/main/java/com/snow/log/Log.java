package com.snow.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


/**
 * @author Snow
 * @create 2021-03-14 22:58
 */
public class Log implements MethodBeforeAdvice {
    /**
     * Callback before a given method is invoked.
     *
     * @param method the method being invoked
     * @param args   the arguments to the method
     * @param target the target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了!");
    }
}

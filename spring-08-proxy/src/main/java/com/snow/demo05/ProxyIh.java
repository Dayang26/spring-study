package com.snow.demo05;

import com.snow.demo04.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Snow
 * @create 2020-12-22 10:21
 * 自动生成代理类
 */
public class ProxyIh implements InvocationHandler {
    /**
     * 被代理的接口
     */
    private Object target;


    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    /**
     * 处理代理实例，并返回结果集
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了 "+msg+" 方法!");
    }

}

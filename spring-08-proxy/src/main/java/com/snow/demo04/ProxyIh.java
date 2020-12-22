package com.snow.demo04;

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
    private Rent rent;


    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成得到代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }


    /**
     * 处理代理实例，并返回结果集
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(rent, args);

        return result;
    }
}

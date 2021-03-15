package com.snow.demo3;

import java.lang.reflect.InvocationHandler;

/**
 * @author Snow
 * @create 2021-03-14 22:08
 */
public class Client {
    public static void main(String[] args) {

        //真实角色
        Host host = new Host();

        //代理角色 暂时没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象。

        /**
         * 总结一下就是 ：先把真实角色放入程序处理角色 ，然后通过调用程序处理角色来调用真实角色的接口对象
         */
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();

    }
}

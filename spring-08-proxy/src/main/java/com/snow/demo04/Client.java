package com.snow.demo04;

/**
 * @author Snow
 * @create 2020-12-22 10:45
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        ProxyIh proxyIh = new ProxyIh();

        //通过调用程序处理角色来处理我们要调用的接口对象。
        proxyIh.setRent(host);

        Rent proxy = (Rent) proxyIh.getProxy();

        proxy.rent();

    }
}
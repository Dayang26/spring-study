package com.snow.demo01;

/**
 * @author Snow
 * @create 2020-12-21 15:35
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}

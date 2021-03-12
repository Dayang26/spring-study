package com.snow.demo01;

/**
 * @author Snow
 * @create 2021-03-12 12:57
 */
public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //房东把房子给到中介
        Proxy proxy = new Proxy(host);
        //代理把房子出租给租客
        proxy.rent();
        proxy.lookHouse();

    }
}

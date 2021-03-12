package com.snow.demo01;

/**
 * @author Snow
 * @create 2021-03-12 12:59
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void lookHouse(){
        System.out.println("中介带你看房！");
    }

    public void fare(){
        System.out.println("收中介费！");
    }

    public void  signContract(){
        System.out.println("签合同！");
    }
}

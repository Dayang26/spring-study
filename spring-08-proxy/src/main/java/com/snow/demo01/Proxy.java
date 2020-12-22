package com.snow.demo01;

/**
 * @author Snow
 * @create 2020-12-21 15:36
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    @Override
    public void rent() {
        host.rent();
        seeHouse();
        signContract();
        fee();
    }

    public void seeHouse() {
        System.out.println("the proxy carry you see a house");
    }

    public void signContract(){
        System.out.println("signContract");
    }

    public void fee() {
        System.out.println("fee money");
    }
}

package com.snow.demo04;


/**
 * @author Snow
 * @create 2020-12-21 15:32
 * 房东
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}

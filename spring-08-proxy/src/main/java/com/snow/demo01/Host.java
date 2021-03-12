package com.snow.demo01;

/**
 * @author Snow
 * @create 2021-03-12 12:56
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}

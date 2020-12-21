package com.snow.demo03;

import com.snow.demo01.Proxy;

/**
 * @author Snow
 * @create 2020-12-21 19:21
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.syb();

    }
}

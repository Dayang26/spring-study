package com.snow.demo02;

/**
 * @author Snow
 * @create 2020-12-21 16:30
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userServiceImpl);
        userServiceProxy.add();

    }
}

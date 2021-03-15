package com.snow.demo04;

import com.snow.demo02.UserService;
import com.snow.demo02.UserServiceImpl;

/**
 * @author Snow
 * @create 2021-03-14 22:32
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();


    }
}

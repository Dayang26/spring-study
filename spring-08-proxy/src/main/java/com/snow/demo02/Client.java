package com.snow.demo02;

/**
 * @author Snow
 * @create 2021-03-12 13:14
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();
    }
}

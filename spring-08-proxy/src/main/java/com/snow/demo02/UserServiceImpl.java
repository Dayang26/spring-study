package com.snow.demo02;

/**
 * @author Snow
 * @create 2020-12-21 16:28
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("add one User");
    }

    @Override
    public void delete() {
        System.out.println("delete one User");
    }

    @Override
    public void update() {
        System.out.println("update one User");
    }

    @Override
    public void search() {
        System.out.println("search one User");
    }
}

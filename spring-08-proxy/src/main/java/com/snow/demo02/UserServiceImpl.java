package com.snow.demo02;

/**
 * @author Snow
 * @create 2021-03-12 13:13
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("add a user");
    }

    @Override
    public void delete() {
        System.out.println("delete a user");
    }

    @Override
    public void update() {
        System.out.println("update a user");
    }

    @Override
    public void search() {
        System.out.println("search a user");
    }
}

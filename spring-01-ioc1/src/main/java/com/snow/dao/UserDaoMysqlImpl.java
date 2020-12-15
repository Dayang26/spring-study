package com.snow.dao;

/**
 * @author Snow
 * @create 2020-12-15 23:06
 */
public class UserDaoMysqlImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("通过mysql获取用户数据");
    }
}


package com.snow.service;

import com.snow.dao.UserDao;
import com.snow.dao.UserDaoImpl;

/**
 * @author Snow
 * @create 2020-12-15 22:40
 */
public class UserServiceImpl implements UserService {


    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * dfs
     */
    @Override
    public void getUser() {
        userDao.getUser();
    }
}

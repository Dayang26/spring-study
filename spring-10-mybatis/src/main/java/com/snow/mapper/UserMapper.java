package com.snow.mapper;

import com.snow.pojo.User;

import java.util.List;

/**
 * @author Snow
 * @create 2021-03-15 20:13
 */
public interface UserMapper {
    public List<User> selectUser();
}

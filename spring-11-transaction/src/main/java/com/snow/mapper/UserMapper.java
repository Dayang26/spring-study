package com.snow.mapper;

import com.snow.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Snow
 * @create 2021-03-15 20:13
 */
public interface UserMapper {
    public List<User> selectUser();

    public int addUser(User user);

    public int deleteUser(int id);

}

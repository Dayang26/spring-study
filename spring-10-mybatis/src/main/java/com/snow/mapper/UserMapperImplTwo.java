package com.snow.mapper;

import com.snow.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author Snow
 * @create 2021-03-15 21:36
 */
public class UserMapperImplTwo extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }


}

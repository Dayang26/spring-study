package com.snow.mapper;

import com.snow.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author Snow
 * @create 2021-03-15 21:06
 * 以前我们的所有操作的通过SqlSession来执行，
 * 今时不同往日，现在SqlSession将由SqlSessionTemplate全权代替！
 */

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectUser() {
        User user = new User(6, "acc", "666");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        int i = mapper.addUser(user);
        int i1 = mapper.deleteUser(5);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}

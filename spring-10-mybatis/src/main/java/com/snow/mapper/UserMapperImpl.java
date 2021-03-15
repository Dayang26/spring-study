package com.snow.mapper;

import com.snow.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author Snow
 * @create 2021-03-15 21:06
 * 以前我们的所有操作的通过SqlSession来执行，
 * 今时不同往日，现在SqlSession将由SqlSessionTemplate全权代替！
 */

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}

package com.snow.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Snow
 * @create 2021-03-11 16:39
 */

@Component  //这个注解说明这个类被Spring接管，注入到容器中了
public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("acc") //注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

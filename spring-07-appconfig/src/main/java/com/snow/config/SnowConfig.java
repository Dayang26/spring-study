package com.snow.config;

import com.snow.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

/**
 * @author Snow
 * @create 2021-03-11 16:41
 */

@Configuration
public class SnowConfig {


    @Bean
    public User getUser(){
        return new User();
    }

}

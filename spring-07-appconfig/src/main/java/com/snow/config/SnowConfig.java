package com.snow.config;

import com.snow.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Snow
 * @create 2020-12-18 8:47
 */

@Configuration

public class SnowConfig {
    @Bean
    public User user() {
        return new User();
    }
}

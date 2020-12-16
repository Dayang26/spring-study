package com.snow.pojo;

/**
 * @author Snow
 * @create 2020-12-16 14:51
 */
public class User {
    private String name;

    public User() {
        System.out.println("无参User");
    }

    public User(String name) {
        System.out.println("有参User");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name:" + name);
    }
}

package com.snow.pojo;

/**
 * @author Snow
 * @create 2020-12-16 15:26
 */
public class UserT {
    private String name;

    public UserT(String name) {
        this.name = name;
        System.out.println("有参T");
    }

    public UserT() {
        System.out.println("无参T");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

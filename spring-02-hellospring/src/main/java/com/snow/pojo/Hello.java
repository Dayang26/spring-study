package com.snow.pojo;

/**
 * @author Snow
 * @create 2020-12-16 10:49
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Hello(String str) {
        this.str = str;
    }

    public Hello() {
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}

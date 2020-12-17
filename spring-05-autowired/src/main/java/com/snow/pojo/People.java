package com.snow.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

/**
 * @author Snow
 * @create 2020-12-17 14:56
 */
public class People {
    @Resource
    private Cat cat;
    @Resource
    private Dog dog;
    private String name;

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat.toString() +
                ", dog=" + dog.toString() +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

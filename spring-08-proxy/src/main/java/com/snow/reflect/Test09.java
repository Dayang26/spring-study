package com.snow.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Snow
 * @create 2020-12-23 19:19
 */
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得Class对象
        Class c1 = Class.forName("com.snow.reflect.User");

        //构造一个对象，本质上通过无参构造
//        User user =(User) c1.newInstance();
//        System.out.println(user);

//        //通过构造器创造对象
//        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
//        User acv =(User) declaredConstructor.newInstance("acv", 123, 123);   nb
//        System.out.println(acv);

        //通过反射获取方法
        User user2 = (User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);

        //调用方法
        setName.invoke(user2,"afa");
        System.out.println(user2);


        User user3= (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");

        //暴力反射，关掉安全检测
        name.setAccessible(true);
        name.set(user3,"snow2");
        System.out.println(user3);
    }
}

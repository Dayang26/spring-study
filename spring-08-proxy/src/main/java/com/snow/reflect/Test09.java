package com.snow.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Snow
 * @create 2020-12-23 19:19
 */
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //获得Class对象
        Class c1 = Class.forName("com.snow.reflect.User");

        //构造一个对象，本质上通过无参构造
//        User user =(User) c1.newInstance();
//        System.out.println(user);

//        //通过构造器创造对象
//        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
//        User acv =(User) declaredConstructor.newInstance("acv", 123, 123);
//        System.out.println(acv);

         //通过反射调用方法
        User user2 = (User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);

    }
}

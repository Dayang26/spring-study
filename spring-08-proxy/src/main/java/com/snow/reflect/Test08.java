package com.snow.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Snow
 * @create 2020-12-23 16:25
 */
public class Test08 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.snow.reflect.User");
        User user = new User();

        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());


        System.out.println("==============================");
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("==============================");
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("==============================");
        System.out.println(c1.getDeclaredField("name"));

        System.out.println("==============================");

        for (Method method : c1.getMethods()) {
            System.out.println(method);
        }
        System.out.println("==============================");
        for (Method declaredMethod : c1.getDeclaredMethods()) {
            System.out.println(declaredMethod);
        }

        System.out.println("==============================");
        System.out.println(c1.getMethod("getName"));
        System.out.println(c1.getMethod("setAge", int.class));

        System.out.println("==============================");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);
    }
}

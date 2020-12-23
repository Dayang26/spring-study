package com.snow.reflect;

/**
 * @author Snow
 * @create 2020-12-23 16:02
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //系统加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //根加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        ClassLoader classLoader = Class.forName("com.snow.reflect.Test07").getClassLoader();
        System.out.println(classLoader);

        ClassLoader object = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(object);

        System.out.println(System.getProperty("java.class.path"));

    }
}

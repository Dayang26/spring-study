package com.snow.reflect;

/**
 * @author Snow
 * @create 2020-12-23 15:33
 */
public class Test06 {
    static {
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        Son son = new Son();

//        Class aClass = Class.forName ("com.snow.reflect.Son");
//        System.out.println(aClass);

//        System.out.println(Son.b);

//        Son[] sons = new Son[4];
        System.out.println(Son.M);
    }
}

class Father {

    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;

    static final int M = 1;
}

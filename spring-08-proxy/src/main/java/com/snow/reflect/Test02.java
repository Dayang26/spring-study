package com.snow.reflect;

/**
 * @author Snow
 * @create 2020-12-23 9:00
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是 " + person.getName());

        //通过对象获取Class类
        Class c1 = person.getClass();
        System.out.println(c1);
        Class c99 = c1.getClass();
        System.out.println(c99);

        //通过报名来获取Class类
        Class c2 = Class.forName("com.snow.reflect.Person");
        System.out.println(c2);
    }
}

class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    public Student() {

        this.setName("学生");
    }
}

class Teacher extends Person {
    public Teacher() {

        this.setName("老师");
    }
}



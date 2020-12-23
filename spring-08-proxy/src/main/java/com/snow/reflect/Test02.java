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
        System.out.println(c1.hashCode());

        Class superclass = c1.getSuperclass();
        System.out.println(superclass);
        System.out.println(superclass.hashCode());

        Class superclass1 = superclass.getSuperclass();
        System.out.println(superclass1);
        System.out.println(superclass1.hashCode());


        //通过报名来获取Class类
        Class c2 = Class.forName("com.snow.reflect.Student");
        System.out.println(c2);
        System.out.println(c2.hashCode());

        //通过类名.class获取Class类
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);
        System.out.println(studentClass.hashCode());

        Class type = Integer.TYPE;
        System.out.println(type);
        System.out.println(type.hashCode());


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



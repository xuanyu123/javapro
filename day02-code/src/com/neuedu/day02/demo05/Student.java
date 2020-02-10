package com.neuedu.day02.demo05;

/**
 * @author xuanyu
 * @date 2020-02-05 11:35 上午
 * 一个标准的类要拥有下面四个组成部分
 * 1、所有的成员变量都要使用private关键字进行修饰
 * 2、为每一对成员变量编写一堆Getter/Setter方法
 * 3、编写一个无参数的构造方法
 * 4、编写一个有参数的构造方法
 */
public class Student {
    private String name;//姓名
    private int age;//年龄

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.neuedu.test.demo01API01.Static;

/**
 * @author xuanyu
 * @date 2020-02-07 9:47 下午
 */
public class Student {
    //成员变量
    private int id;
    private String name;//姓名
    private int age;//年龄
    //static关键字修饰，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享一份数据
    static String room;//所在教室
    //学号计数器，每当new了一个新对象的时候，计数器++
    private static int idCounter = 0;
    //无参构造方法
    public Student() {
        this.id = ++idCounter;
    }

    //有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    //Getter/Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

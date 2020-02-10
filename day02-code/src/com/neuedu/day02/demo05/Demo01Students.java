package com.neuedu.day02.demo05;

/**
 * @author xuanyu
 * @date 2020-02-05 11:41 上午
 */
public class Demo01Students {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("joes");
        stu1.setAge(20);
        System.out.println("name:"+stu1.getName()+",age:"+stu1.getAge());
        System.out.println();

        Student stu2 = new Student("mike",21);
        stu2.setAge(30);
        System.out.println("name:"+stu2.getName()+",age:"+stu2.getAge());
    }
}

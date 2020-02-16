package com.neuedu.day10.demo01ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author xuanyu
 * @date 2020-02-16 10:44 上午
 * 题目：
 * 自定义4个学生对象，添加到集合，并遍历
 *
 * 思路：
 * 1、自定义Student学生类，四个部分
 * 2、创建一个集合，用来存储学生对象。泛型：<Student>
 * 3、根据类，创建4个学生对象
 * 4、将4个学生对象添加到集合当中
 * 5、遍历集合：for/size/get
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公",20);
        Student two = new Student("欧阳锋",30);
        Student three = new Student("黄药师",40);
        Student four = new Student("段誉",50);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+",年龄："+stu.getAge());
        }
    }
}

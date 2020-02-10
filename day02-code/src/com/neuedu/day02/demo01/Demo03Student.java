package com.neuedu.day02.demo01;

/**
 * @author xuanyu
 * @date 2020-02-04 10:50 上午
 */

public class Demo03Student {
    public static void main(String[] args) {
        //1、导包  处于同一目录下，省略导包语句不写

        //2、创建格式
        Student stu = new Student();

        //3、使用
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("===========");

        //改变对象当中的成员变量数值内容
        //将右侧的字符串，赋值交给stu当中的name成员变量
        stu.name = "赵丽因";
        //将右侧的数值，赋值交给stu当中的age成员变量
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("===========");
        //4、使用对象的成员方法，格式
        //对象名.成员方法名（）
        stu.eat();
    }
}

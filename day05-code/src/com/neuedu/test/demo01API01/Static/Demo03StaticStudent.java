package com.neuedu.test.demo01API01.Static;

/**
 * @author xuanyu
 * @date 2020-02-08 11:11 上午
 */
public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "101教室";

        Student one = new Student("joes",20);
        System.out.println("姓名："+one.getName()+"，年龄："+one.getAge()
                +"，教室："+Student.room);
        Student two = new Student("mike",30);
        System.out.println("姓名："+two.getName()+"，年龄："+two.getAge()
                +"，教室："+Student.room);
    }
}

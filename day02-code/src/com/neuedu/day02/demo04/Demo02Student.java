package com.neuedu.day02.demo04;

/**
 * @author xuanyu
 * @date 2020-02-05 11:26 上午
 */
public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();    //无参数构造
        System.out.println("==========");

        Student stu2 = new Student("joes",20);//有参数
        System.out.println("name:"+stu2.getName()+"，age："+stu2.getAge());
        //如果需要改变对象当中的成员变量的数据内容，仍然需要使用setXxx的方法
        stu2.setAge(30);
        System.out.println("name:"+stu2.getName()+"，age："+stu2.getAge());
    }
}

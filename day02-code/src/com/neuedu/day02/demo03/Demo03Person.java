package com.neuedu.day02.demo03;

/**
 * @author xuanyu
 * @date 2020-02-04 10:49 下午
 */
public class Demo03Person {
    public static void main(String[] args) {
        //根据类创建一个对象，创建格式
        Person p = new Person();
        //使用：对象点成员变量名
        p.name = "joes";
        //私有成员属性，无法访问，可以通过getAge/setAge访问
//        p.age = 10;
        //对象点成员方法
        p.setAge(20);
//        p.getAge();
        p.show();
    }
}

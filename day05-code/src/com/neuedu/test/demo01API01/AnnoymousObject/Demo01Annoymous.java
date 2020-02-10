package com.neuedu.test.demo01API01.AnnoymousObject;

/**
 * @author xuanyu
 * @date 2020-02-07 4:25 下午
 */
public class Demo01Annoymous {
    public static void main(String[] args) {
        //左边one就是对象的格式
        Person one  = new Person();
        one.name="jose";
        one.showName();
        System.out.println("=======");

        new Person().name="Mike";

    }
}

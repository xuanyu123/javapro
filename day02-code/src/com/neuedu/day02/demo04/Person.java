package com.neuedu.day02.demo04;

/**
 * @author xuanyu
 * @date 2020-02-04 11:50 下午
 */
public class Person {
    String name;  //我自己的名字

    public void sayHello(String name) {
        System.out.println(name + ",你好。我是"+ this.name);
        System.out.println(this);
    }

}

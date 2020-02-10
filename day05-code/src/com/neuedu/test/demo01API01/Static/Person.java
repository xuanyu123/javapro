package com.neuedu.test.demo01API01.Static;

/**
 * @author xuanyu
 * @date 2020-02-08 11:59 上午
 */
public class Person {
    static {
        System.out.println("静态代码块");
    }
    //构造方法不能写void
    public Person(){
        System.out.println("构造方法");
    }
}

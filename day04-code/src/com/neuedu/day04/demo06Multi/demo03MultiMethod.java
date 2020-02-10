package com.neuedu.day04.demo06Multi;

/**
 * @author xuanyu
 * @date 2020-02-06 9:07 下午
 */
public class demo03MultiMethod {

    public static void main(String[] args) {
        Fu2 obj = new Zi2();
        //父子都有，优先用子
        obj.method();
        //子类没有，向上找，找到父类
        obj.methodFu();

        //错误写法
        //原因：左边是Fu，Fu类没有methodZi方法，编译报错
//        obj.methodZi();
    }
}

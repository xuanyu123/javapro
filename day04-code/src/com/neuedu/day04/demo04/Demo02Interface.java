package com.neuedu.day04.demo04;

/**
 * @author xuanyu
 * @date 2020-02-06 12:47 下午
 */
public class Demo02Interface {
    public static void main(String[] args) {
        //错误写法
/*        MyInterfaceStaticImpl imp = new MyInterfaceStaticImpl();
        impl.menthodStatic();*/

        MyInterfaceStatic.methodStatic();
    }
}

package com.neuedu.day04.demo04;

/**
 * @author xuanyu
 * @date 2020-02-06 12:31 下午
 */
public class DemoInterface {
    public static void main(String[] args) {
        MyInterfaceDefaultA myInterfaceDefaultA = new MyInterfaceDefaultA();
        myInterfaceDefaultA.methodAbs();
        //调用默认方法，如果实现类没有，会向上找接口
        myInterfaceDefaultA.methodAbs1();

        System.out.println("=========");
        MyInterfaceDefaultB myInterfaceDefaultB = new MyInterfaceDefaultB();
        myInterfaceDefaultB.methodAbs();
        //调用默认方法，如果实现类没有，会向上找接口
        myInterfaceDefaultB.methodAbs1();
    }
}

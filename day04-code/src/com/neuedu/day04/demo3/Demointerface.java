package com.neuedu.day04.demo3;

/**
 * @author xuanyu
 * @date 2020-02-06 11:56 上午
 */
public class Demointerface {
    public static void main(String[] args) {
        //错误写法，不能直接new接口对象使用
//        MyInterfaceAbstract myInterfaceAbstract = new MyInterfaceAbstract();
        //创建实现类的对象使用
        MyInterfaceAbstractImpl myInterfaceAbstract = new MyInterfaceAbstractImpl();
        myInterfaceAbstract.methodAbs1();
        myInterfaceAbstract.methodAbs2();
    }
}

package com.neuedu.day04.demo04;

/**
 * @author xuanyu
 * @date 2020-02-06 12:50 下午
 * java9开始，接口允许定义私有方法
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("这是一个默认方法1");
        methodCommon();
    }
    public default void methodDefault2(){
        System.out.println("这是一个默认方法2");
        methodCommon();
    }
    //需要改为私有方法
    public default void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

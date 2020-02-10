package com.neuedu.day02.demo01;

/**
 * @author xuanyu
 * @date 2020-02-04 9:14 上午
 * 方法重载：方法名称一样，参数列表不一样
 */
public class Demo02MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        int a=10;
        method(a);
        System.out.println(a);
    }
    public static int sum(int a,int b) {
        return a + b;
    }
    public static int sum(int a,int b,int c) {
        return a + b +c;
    }
    public static void method(int a) {
        a = 100;
    }
}

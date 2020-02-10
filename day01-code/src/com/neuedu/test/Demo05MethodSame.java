package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 8:47 下午
 * 题目要求：
 * 定义一个方法，用来判断两个数字是否相同
 */
public class Demo05MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame1(10,20));//false
        System.out.println(isSame2(10,10));//true
        System.out.println(isSame3(20,30));//false
        System.out.println(isSame4(20,20));//true
    }

    /*
     * 三要素：
     * 返回值类型：boolean
     * 方法名称：isSame
     * 参数列表：int a,int b
     * */
    public static boolean isSame1(int a, int b) {
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame2(int a, int b) {
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame3(int a, int b) {
        boolean same = a == b;
        return same;
    }

    public static boolean isSame4(int a, int b) {
        return a == b;
    }
}

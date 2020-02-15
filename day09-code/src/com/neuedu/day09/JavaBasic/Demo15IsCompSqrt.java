package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 5:23 下午
 * 13.求未知数  完全平方数
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 *
 * 程序分析：在 10万 以内判断，先将该数加上 100 后再 开方，再将该数加上 268 后 再开方，
 *         如果开方后的结果满足如下条件，即是结果。
 */
public class Demo15IsCompSqrt {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i <= 100000 ; i++) {
            if (isCompSqrt(i+100)&&isCompSqrt(i+268)){
                n = i;
                break;
            }
        }
        System.out.println("所求的数是："+n);
    }
    //判断完全平方数
    public static boolean isCompSqrt(int n){
        boolean flag = false;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n==Math.pow(i,2)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}

package com.neuedu.day08.demo01;

/**
 * @author xuanyu
 * @date 2020-02-14 12:05 上午
 * 一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
 */
public class Demo04Number {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int m = (int) Math.sqrt((i+100));
            int n = (int) Math.sqrt((i+100+168));
            if ((m*m==i+100)&&(n*n==i+100+168)){
                System.out.println(i);
            }
        }
    }
}

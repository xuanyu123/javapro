package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 7:13 下午
 * 打印一个5*5的矩形，用 * 号
 */
public class Demo01Square {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
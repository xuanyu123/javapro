package com.neuedu.day02.test;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-04 2:25 下午
 * 定义两个int变量  m、n， 计算m的n次方
 */
public class MyTest3 {
    public static void main(String[] args) {
/*        int c = getPower(2,5);
        System.out.println(c);*/
        System.out.println(getPower());
    }
    public static int getPower(int m,int n){  //2^3
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= m;
        }
        return result;
    }
    public static int getPower(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数m：");
        int m = input.nextInt();
        System.out.print("请输入一个整数n：");
        int n = input.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= m;
        }
        return result;
    }
}

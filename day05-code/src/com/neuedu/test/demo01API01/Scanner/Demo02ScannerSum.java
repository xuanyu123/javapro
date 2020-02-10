package com.neuedu.test.demo01API01.Scanner;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-07 3:40 下午
 * 题目要求：键盘输入两个数字，并且求出和。
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter num1:");
        int num1 = sc.nextInt();
        System.out.print("Please enter num2:");
        int num2 = sc.nextInt();
        System.out.println("Sum:"+getSum(num1,num2));
    }
    public static int getSum(int a, int b){
        return a+b;
    }
}

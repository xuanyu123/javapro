package com.neuedu.test.demo01API01.Scanner;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-07 3:57 下午
 * 题目要求：
 * 键盘输入三个数字比较大小得出最大值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter num1：");
        int num1 = sc.nextInt();
        System.out.print("Please enter num2：");
        int num2 = sc.nextInt();
        System.out.print("Please enter num3：");
        int num3 = sc.nextInt();
        System.out.println("Max："+getMax(num1,num2,num3));
    }
    public static int getMax(int a,int b,int c){
        /*int max;
        if(a>b&&a>c){
            max = a;
        }else if(b>a&&b>c){
            max = b;
        }else{
            max = c;
        }
        return max;*/
        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        return max;
    }
}

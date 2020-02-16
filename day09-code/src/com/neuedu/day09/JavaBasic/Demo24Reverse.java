package com.neuedu.day09.JavaBasic;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-15 11:47 下午
 * 24.倒序打印
 * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class Demo24Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个不多于5位的正整数：");
        int num = sc.nextInt();
        sc.close();
        reverse(num);
    }
    //逆序打印
    public static void reverse(int n){
        if (n<0||n>99999){
            System.out.println("非法输入，请重新输入");
        }else {
            int len =0;
            int[] array = new int[5];
            int i = 0;
            while (n%10!=0){
                len++;
                array[i]=n%10;
                i++;
                n /= 10;
            }
            System.out.print("它是"+len+"位数，分别为：");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+" ");
            }
        }
    }
}

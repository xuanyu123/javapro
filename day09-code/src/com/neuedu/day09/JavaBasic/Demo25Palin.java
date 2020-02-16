package com.neuedu.day09.JavaBasic;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-16 12:13 上午
 * 25.回文数
 * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * 思路：
 * 1、判断输入是不是5位数  if  n<10000||n>99999
 * 2、将每一位放入到数组中  array
 * 3、判断是不是回文数，array[0]==array[4] && array[1]==array[3]
 */
public class Demo25Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个5位数：");
        int num = sc.nextInt();
        palin(num);
    }
    //判断是不是回文数
    public static void palin(int n){
        int num = n;
        if (n<10000||n>99999){
            System.out.println(num+"不是5位数");
        }else {
            int[] array = new int[5];
            for (int i = 0; i < 5; i++) {
                array[i]=n%10;
                n = n/10;
            }
            if ((array[0]==array[4])&&array[1]==array[3]){
                System.out.println(num+"是回文数");
            }else {
                System.out.println(num+"不是回文数");
            }
        }
    }
}

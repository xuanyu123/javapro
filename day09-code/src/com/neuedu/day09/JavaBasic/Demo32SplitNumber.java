package com.neuedu.day09.JavaBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-17 12:18 上午
 * 32.取一个整数a从右端开始的4～7位。
 * 思路：
 * 1、用a%10，然后a=a/10
 * 2、将每一位放到数组中
 * 3、最后遍历数组4——7位
 */
public class Demo32SplitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个7位以上的整数：");
        int num = sc.nextInt();
        sc.close();
        splitNumber(num);
    }

    public static void splitNumber(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n < 1000000) {
            System.out.println("输入小于7位，重新输入");
        } else {
            while (n != 0) {
                int a = n % 10;
                list.add(a);
                n = n / 10;
            }
            Collections.reverse(list);
            System.out.print("4-7位数字为：");
            for (int i = 3; i < 7; i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}

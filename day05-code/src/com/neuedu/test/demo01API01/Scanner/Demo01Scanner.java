package com.neuedu.test.demo01API01.Scanner;
//1、导包
import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-07 3:33 下午
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2、创建
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter:");
        int num = sc.nextInt();
        System.out.println("输入的数字为："+ num);
        System.out.println("==========");

        System.out.print("Please enter:");
        String str = sc.next();
        System.out.println("输入的字符串为："+str);
    }
}

package com.neuedu.test.demo01API01.AnnoymousObject;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-07 4:34 下午
 */
public class Demo02Annoymous {
    public static void main(String[] args) {
        /*//普通使用方式
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
        System.out.println("==============");

        //匿名对象的方式
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("输入的是："+num);
        System.out.println("==============");

        //使用一般方法写入传参数
        Scanner sc1 = new Scanner(System.in);
        methodParam(sc1);*/

        //使用匿名对象进行传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num  = sc.nextInt();
        System.out.println("输入的是："+ num);
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}

package com.neuedu.day10.demo02String;

/**
 * @author xuanyu
 * @date 2020-02-16 12:18 下午
 */
public class Demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] array = {'H','e','l','l','o'};
        String str3 = new String(array);

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals("Hello"));//true
        System.out.println("Hello".equals(str1));//true
        System.out.println("hello".equals(str1));//false
    }
}

package com.neuedu.day10.demo02String;

/**
 * @author xuanyu
 * @date 2020-02-16 11:55 上午
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();//小括号留空，说明字符串没什么内容
        System.out.println("第一个字符串："+str1);

        //根据字符数组创建字符串
        char[] array = {'A','B','C'};
        String str2 = new String(array);
        System.out.println("第二个字符串："+str2);

        //根据字节数组创建字符串
        byte[] bytes = {97,98,99};
        String str3 = new String(bytes);
        System.out.println("第三个字符串："+str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串："+str4);
    }
}

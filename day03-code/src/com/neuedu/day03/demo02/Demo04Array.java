package com.neuedu.day03.demo02;

/**
 * @author xuanyu
 * @date 2020-02-05 10:53 上午
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //原始输出
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("============");
        //for循环
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");
        //for循环,优化
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

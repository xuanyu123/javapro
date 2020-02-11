package com.neuedu.test.demo06;

/**
 * @author xuanyu
 * @date 2020-02-11 7:08 下午
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //数组角标越界异常  java.lang.ArrayIndexOutOfBoundsException: 3
        System.out.println(arr[3]);
    }
}

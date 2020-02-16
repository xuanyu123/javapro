package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-16 11:54 下午
 * 31.将一个数组逆序输出。
 * 程序分析：用第一个与最后一个交换。
 */
public class Demo31ReverseSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        reverse(array);
        print(array);
    }

    //数组逆序
    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    //打印数组
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

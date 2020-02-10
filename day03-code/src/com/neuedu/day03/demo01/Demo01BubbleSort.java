package com.neuedu.day03.demo01;

import java.util.Arrays;

/**
 * @author xuanyu
 * @date 2020-02-05 9:33 上午
 * 问题描述：
 * 冒泡排序：给定一个数组，相邻两个元素比较大小，大的往后放
 * 解决方案：两层循环、临时交换变量temp
 */
public class Demo01BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 18, 4, 90, 54, 100};
        bubbleSort(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("==========");

        int[] array2 = {10, 2, 18, 4, 90, 54, 100};
        bubbleSort2(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println();
        System.out.println("==========");

        int[] array3 = {10, 2, 18, 4, 90, 54, 100};
        bubbleSort(array3);
        System.out.println(Arrays.toString(array3));
    }

    public static void bubbleSort(int[] array) {
        //从小到大全部比较
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] array) {
        //从小到大全部比较，改进优化版
        for (int i = 0; i < array.length - 1; i++) {
            // -i 让每次参与比较的元素依次递减
            // -1 避免角标越界
            for (int j = 0; j < array.length -1 -i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort3(int[] array) {
        //从小到大全部比较，改进优化版
        int flag = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag++;
                }
            }
            //优化判断  若没有进行交换则排序完成，直接跳出
            if (flag == 0) {
                break;
            }
        }
    }
}

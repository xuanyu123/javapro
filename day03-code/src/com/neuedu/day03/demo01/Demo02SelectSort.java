package com.neuedu.day03.demo01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-05 9:49 上午
 * 问题描述：
 * 简单选择排序的基本思想：给定数组：int[] arr={里面n个数据}；
 * 第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据，将它与arrr[1]交换；
 * 第2趟，在待排序数据arr[2]~arr[n]中选出最小的数据，将它与r[2]交换；
 * 以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成。
 */
public class Demo02SelectSort {
    public static void main(String[] args) {
/*        int[] array = {5,2,8,4,9};
        selectSort(array);
        System.out.println(Arrays.toString(array));*/

        System.out.print("请输入数组个数：");
        Scanner a = new Scanner(System.in);
        while(a.hasNext()){
            int m = a.nextInt();
            System.out.print("请输入数组：");
            int[] array2 = new int[m];
            for (int i = 0; i < m; i++) {
                array2[i]=a.nextInt();
            }
            System.out.println("排序前的数组");
            printArray(array2);
            selectSort(array2);
            System.out.println("排序后的数组");
//            System.out.println(Arrays.toString(array2));
            printArray(array2);
        }
    }
    /*
    * 打印数组中的元素
    * */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    /*
    * 数组排序：选择排序
    * */
    public static void selectSort(int[] array){
        int temp=0;
        for (int i = 0; i < array.length; i++) {
            //为什么j的初始化值为i+1？因为每一次比较，都是x角标上的元素和下一个元素比较
            for (int j = i+1; j < array.length; j++) {
                //当前元素比下一个元素大的时候，进行位置互换
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

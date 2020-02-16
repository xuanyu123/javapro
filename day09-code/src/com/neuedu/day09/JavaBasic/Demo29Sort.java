package com.neuedu.day09.JavaBasic;

import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-16 7:54 下午
 * 28.对10个数进行排序
 * 程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，
 * 下次类推，即用第二个元素与后8个进行比较，并进行交换。
 */
public class Demo29Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\s");
        System.out.print("请输入需要排序的个数：");
        int n =sc.nextInt();
        int[] array = new int[n];
        System.out.print("请输入要排序的数：");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.print("排序后的顺序为：");
        selectSort(array);
    }
    //选择排序
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

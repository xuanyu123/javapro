package com.neuedu.day03.demo01;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author xuanyu
 * @date 2020-02-08 11:19 下午
 */
public class DemoSort {
    public static void main(String[] args) {
        int[] arr = {4,1,3,6,2};
        Arrays.sort(arr);
        printArray(arr);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

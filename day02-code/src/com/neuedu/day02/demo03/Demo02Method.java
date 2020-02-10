package com.neuedu.day02.demo03;

/**
 * @author xuanyu
 * @date 2020-02-04 9:13 下午
 * 问题描述：给定一个数组，找出其中最大值
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array={2,18,100,10};
        int max = getMax(array);
        System.out.println("最大值为"+max);
    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length;i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}

package com.neuedu.day03.demo01;

/**
 * @author xuanyu
 * @date 2020-02-08 9:47 下午
 * 获取数组中的最小值
 *
 */
public class Demo05GetMin {

    public static void main(String[] args) {
        int[] array = new int[]{2,14,1,8,9};
        int min = getMin(array);
        System.out.println("Min:"+min);
    }
    public static int getMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}

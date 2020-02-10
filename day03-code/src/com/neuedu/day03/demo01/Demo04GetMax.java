package com.neuedu.day03.demo01;

/**
 * @author xuanyu
 * @date 2020-02-08 9:31 下午
 * 获取数组中的最大值
 * 1、首先定义一个变量，记录住数组中比较大的元素，因为该元素不确定，该变量的初始化，需要初始化成
 *    数组中任意的一个元素
 * 2、遍历数组，让数组中的每一个元素和该变量的元素进行比较
 * 3、当遍历到的元素比变量中记录的元素大时，需要让变量记录这个比较大的元素
 * 当循环结束时，该变量记录的就是数组中的最大值
 */
public class Demo04GetMax {

    public static void main(String[] args) {
        int[] array = {2,1,4,10,8};
        System.out.println("Max:"+getMax(array));
    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}

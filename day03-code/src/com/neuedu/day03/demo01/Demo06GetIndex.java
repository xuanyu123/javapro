package com.neuedu.day03.demo01;

/**
 * @author xuanyu
 * @date 2020-02-08 11:31 下午
 * 对数组中的元素进行查找，获取元素第一次出现的位置
 * 如果找到了，返回元素对应的角标
 * 如果没找到，就返回 -1 表示该元素并不在数组中存在
 */
public class Demo06GetIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int index = getIndex(arr,5);
        System.out.println("Index:"+index);
    }

    public static int getIndex(int[] array,int key){
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]){
                return i;
            }
        }
        return -1;
    }
}

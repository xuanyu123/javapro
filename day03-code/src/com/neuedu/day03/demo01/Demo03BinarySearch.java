package com.neuedu.day03.demo01;

/**
 * @author xuanyu
 * @date 2020-02-05 10:31 上午
 * 折半查找数组必须是有序的
 */
public class Demo03BinarySearch {
    public static void main(String[] args) {
//        int[] array = {1,3,5,7,9,11};
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i+1;
//            System.out.print(array2[i]+" ");
        }
        int a=13;
        int pos = binarySearch(array2,a);
        if (pos==-1){
            System.out.println("查找的是"+a+",序列中没有该数");
        }else{
            System.out.println("查找的是"+a+",找到的位置为："+pos);
        }
    }
    public static int binarySearch(int[] array,int value){
        int min=0;
        int max=array.length-1;
        int mid;
        int count = 0;
        //如果min>max，说明元素不存在
        //array[mid] != key
        while(min<=max){
            count++;
            mid = (min+max)/2;
            if (value == array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(value<mid){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return -1;
    }
}

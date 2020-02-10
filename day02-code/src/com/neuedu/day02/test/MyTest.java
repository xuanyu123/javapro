package com.neuedu.day02.test;

/**
 * @author xuanyu
 * @date 2020-02-04 1:38 下午
 * 从1-4中拿出三个数字来，组成的数字
 */
import java.util.Scanner;
public class MyTest {
    public static void main(String[] args) {
        //创建一个长度为4的数组
//        int[] arr = new int[4];
//        Scanner input = new Scanner(System.in);
//        //循环将用户的输入的数据放入数组中
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("输入第" + (i + 1) + "个数");
//            arr[i] = input.nextInt();
//        }
        int[] arr = {1,2,3,4};
        //依次将数组中的所有数都遍历出来
        for (int j = 0; j < arr.length; j++) {
            for (int j2 = 0; j2 < arr.length; j2++) {
                for (int k = 0; k < arr.length; k++) {
                    //判断遍历后的数是否有重复的数字，剔除所有重复的数字之后打印出来
                    if (arr[j] != arr[j2] && arr[j] != arr[k] && arr[j2] != arr[k]) {
                        System.out.print((arr[j] * 100 + arr[j2] * 10 + arr[k]) + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}

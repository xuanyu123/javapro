package com.neuedu.day08.demo01;

/**
 * @author xuanyu
 * @date 2020-02-13 3:39 下午
 * 输出斐波那契数列第n项
 *  1  1  2  3  5  8  13
 * 实现方式:数组
 */
public class Demo02FibArray {
    public static void main(String[] args) {
        int s = fibArray(7);
        System.out.println(s);
    }
    public static int fibArray(int n){
        if (n<=0){
            return -1;
        }else if (n==1||n==2){
            return 1;
        }else {
            int[] array = new int[n+1];
            array[0]=array[1]=1;
            for (int i = 2; i <= n ; i++) {
                array[i]=array[i-1]+array[i-2];
            }
            return array[n-1];
        }
    }
}

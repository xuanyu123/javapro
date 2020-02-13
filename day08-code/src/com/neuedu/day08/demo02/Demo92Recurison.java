package com.neuedu.day08.demo02;

/**
 * @author xuanyu
 * @date 2020-02-13 3:21 下午
 * 使用递归计算阶乘
 */
public class Demo92Recurison {
    public static void main(String[] args) {
        int s = jc(5);
        System.out.println(s);
    }
    public static int jc(int n){
         if (n==1){
             return 1;
         }
         return n*jc(n-1);
    }
}

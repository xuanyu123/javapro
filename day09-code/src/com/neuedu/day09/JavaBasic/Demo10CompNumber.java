package com.neuedu.day09.JavaBasic;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuanyu
 * @date 2020-02-15 1:54 下午
 * 9.指定范围的完数
 *      一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 *      例如6=1＋2＋3.编程找出1000以内的所有完数。
 *
 * 解题思路：
 * 1、判断该数是否为完数。for循环，从1到该数，用该数取模 n%i==0，则i是该数的因子，否则不是
 * 2、再判断因子之和是否等于该数，如果等于则输出，否则继续循环
 */
public class Demo10CompNumber {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 1000;
        System.out.print(n+"以内的完数为：");
        for (int i = 1; i <= n ; i++) {
            if (compNUmber2(i)){
                System.out.print(i+" ");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("共耗时："+(end-start)+"毫秒");
    }
    //判断是不是完数
    public static boolean compNUmber(int n){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n>>1; i++) {
            if (n%i==0&&n!=i){
                list.add(i);
            }
        }
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            sum += list.get(j);
        }
        boolean flag = true;
        if (n==sum){
            return true;
        }else
            return false;
    }
    //判断是不是完数
    public static boolean compNUmber2(int n){
        int temp = 0;
        for (int i = 1; i <= n>>1; i++) {
            if (n%i==0){
                temp = temp + i;
            }
        }
        boolean flag = true;
        if (n==temp){
            return true;
        }else
            return false;
    }
}

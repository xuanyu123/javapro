package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 11:11 下午
 * 21.求1+2!+3!+...+20!的和
 *  程序分析：此程序只是把累加变成了累乘。
 */
public class Demo21 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20 ; i++) {
            sum += factorial(i);
        }
        System.out.println(sum);
    }
    public static long factorial(int n){
        int mutli = 1;
        for (int i = 1; i < n+1; i++) {
            mutli *= i;
        }
        return mutli;
    }
}

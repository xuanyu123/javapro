package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 10:16 上午
 * 6.公约数和公倍数
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 利用辗转相除法
 */
public class Demo06Max_Min {
    public static void main(String[] args) {
        System.out.println(max(6,3));
        System.out.println(min(6,3));
    }
    //最大公约数
    public static int max(int m,int n){
        //保证m大于n，若m小于n，进行数据交换
        if (m<n){
            int temp = n;
            n = m;
            m = temp;
        }
        //在余数不为0，进行循环
        while (m%n!=0){
            int temp = m%n;
            m = n;
            n = temp;
        }
        return n;
    }
    //最小公倍数
    public static int min(int m,int n){
        return m*n/max(m,n);
    }
}

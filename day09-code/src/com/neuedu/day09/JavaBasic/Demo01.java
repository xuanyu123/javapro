package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-14 11:32 下午
 * 1.指数计算问题
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子对数为多少？
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */
public class Demo01 {
    public static void main(String[] args) {
        int n =4;
        System.out.println("第"+n+"个月有"+fun(n)+"对兔子");
    }
    public static int fun(int n){
        if (n==1||n==2){
            return 1;
        }else
            return fun(n-1)+fun(n-2);
    }
}

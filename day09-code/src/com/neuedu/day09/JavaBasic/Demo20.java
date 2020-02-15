package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 9:54 下午
 * 20.数列求和
 *      有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
 *      求出这个数列的前20项之和。
 *
 * 程序分析：请抓住分子与分母的变化规律。
 *  n1 = 1
 *  n2 = 1
 *  fraction = n1/n2
 *  sum = 0
 *  n1 = n1+n2
 *
 */
public class Demo20 {
    public static void main(String[] args) {
        double n1 = 1;
        double n2 = 1;
        double fraction = n1 / n2;
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            double t1 = n1;
            double t2 = n2;
            n1 = t1+t2;
            n2 = t1;
            fraction = n1/n2;
            sum = sum + fraction;
        }
        System.out.println(sum);

    }
}

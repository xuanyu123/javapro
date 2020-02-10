package com.neuedu.day02.test;

/**
 * @author xuanyu
 * @date 2020-02-04 3:03 下午
 * 两个正整数  计算最大公约数 和  最小公倍数
 * 几个自然数公有的约数，叫做这几个数的公约数；其中最大的一个，叫做这几个数的最大公约数。
 * 辗转相除法
 * 又称“欧几里得算法”，是求最大公约数的算法
 * 求两个数的最大公约数：
 * 如果m > n，令余数remainder = m%n，如果余数不为0，则令m = n， n = remainder，
 * 再次remainder = m%n，直到remainder = 0，此时n就是最大公约数。
 *
 * 求多个数的最大公约数：
 * 先求出其中两个数的最大公约数，再求这个最大公约数与第三个数的最大公约数，
 * 依次求下去，直到最后一个为止，最后所得的那个最大公约数，就是所求的几个数的最大公约数
 *
 * 最小公倍数
 * ①定义
 * 两个或多个整数公有的倍数叫做它们的公倍数，其中除0以外最小的一个公倍数就叫做这几个整数的最小公倍数
 *
 * ②短除算法
 * 两个数相乘等于这两个数的最大公约数和最小公倍数的积。
 */
public class MyTest5 {
    public static void main(String[] args) {
        int c = maxCommonDivisor(12,6);
        System.out.println(c);
        int d = minCommonMultiple(12,6);
        System.out.println(d);
    }
    public static int maxCommonDivisor(int m, int n) {
        if (m < n) {     // 保证被除数大于除数
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {  // 在余数不能为0时,进行循环
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;    // 返回最大公约数
    }
    public static int minCommonMultiple(int m, int n) {
        return m * n / maxCommonDivisor(m, n);
    }
}

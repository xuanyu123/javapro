package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 4:06 下午
 * 计算1——100的质数和
 * 质数又称素数，是指一个大于1的自然数中,除了1和其自身外,没法被其他自然数整除的数。
 */
public class Is_Prime {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j <= i >> 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }
        System.out.println();
        System.out.println("1--100之间的素数（也称质数）的个数 -->" + count);
        System.out.println("1--100之间的素数（也称质数）的个数之和 -->" + sum);
    }
}

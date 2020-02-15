package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 9:38 上午
 * 4.分解质因数
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n!=k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 */
public class Demo04Decompse {
    public static void main(String[] args) {
        decompse(100);
    }
    public static void decompse(int n){
        System.out.print(n+"=");
        //如果n不能被k整除，则用k+1作为k的值
        for (int k = 2; k <= n ; k++) {
            //如果n!=k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n
            while (n%k==0&&n!=k){
                n = n/k;
                System.out.print(k+"*");
            }
            //如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可
            if (n==k){
                System.out.println(k);
                break;
            }
        }
    }
}

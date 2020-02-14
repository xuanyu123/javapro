package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 12:02 上午
 * 2.指定范围包含的素数
 * 判断101-200之间有多少个素数，并输出所有素数。
 * <p>
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，
 * 如果能被整除，则表明此数不是素数，反之是素数。
 */
public class Demo02 {
    public static void main(String[] args) {
        int count = 0;
        int m =101;
        int n = 200;
        for (int i = m; i <=n ; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("在"+m+"和"+n+"之间共有"+count+"个素数");
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 1)
            flag = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0 || n == 1) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        return flag;
    }
}

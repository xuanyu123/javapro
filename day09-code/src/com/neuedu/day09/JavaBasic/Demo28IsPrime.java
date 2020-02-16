package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-16 7:28 下午
 * 27.求100之内的素数
 *
 */
public class Demo28IsPrime {
    public static void main(String[] args) {
        int n = 100;
        int count=0;
        System.out.println("100以内的素数：");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("共有"+count+"个素数");
    }
    public static boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i <= n>>1; i++) {
            if (n%i==0){
                flag = false;
                break;
            }
        }
        return flag;

    }
}

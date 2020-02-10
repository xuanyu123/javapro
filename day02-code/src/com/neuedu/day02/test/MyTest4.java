package com.neuedu.day02.test;

/**
 * @author xuanyu
 * @date 2020-02-04 2:33 下午
 * 100——999之间的水仙花数，  例如：153=1^3+5^3+3^3
 */
public class MyTest4 {
    public static void main(String[] args) {
        /*int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (i==ge*ge*ge+shi*shi*shi+bai*bai*bai){
                System.out.println(i+"是水仙花数");
                count++;
            }
        }
        System.out.println("共有"+count+"个水仙花数");*/
        int count = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int a = i*100+j*10+k;
                    int b = i*i*i+j*j*j+k*k*k;
                    if (a==b){
                        System.out.println(a);
                        count++;
                    }
                }
            }
        }
        System.out.println("共有"+count+"水仙花数");
   }
}

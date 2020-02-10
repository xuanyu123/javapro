package com.neuedu.day02.test;

/**
 * @author xuanyu
 * @date 2020-02-04 2:11 下午
 * 计算1——100之间的偶数和
 */
public class MyTest2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.print(i+ " ");
                sum = sum +i;
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println(sum);
    }
}

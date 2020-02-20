package com.neuedu.Demo03System;

import java.util.Arrays;

/**
 * @author xuanyu
 * @date 2020-02-20 9:54 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        demo02();
    }

    public static void demo01(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.print(i+"  ");
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("耗时："+(end-start)+"毫秒");
    }
    public static void demo02(){
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));
    }
}

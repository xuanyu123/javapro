package com.neuedu.day09.JavaBasic;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-15 6:46 下午
 * 15.排序
 * 输入三个整数x,y,z，请把这三个数由小到大输出。
 *
 * 程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，
 *         如果x>y则将x与y的值进行交换，然后再用x与z进行比较，
 *         如果x>z则将x与z的值进行交换，这样能使x最小。
 */
public class Demo17Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\s");
        System.out.print("请输入三个数：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        System.out.println("排序结果为："+sort(x,y,z));

    }
    public static String sort(int x,int y,int z){
        String s = null;
        if (x>y){
            int temp = x;
            x = y;
            y = temp;
        }
        if (x>z){
            int temp = x;
            x = z;
            z = temp;
        }
        if (y>z){
            int temp = y;
            y = z;
            z = temp;
        }
        return s = x+" "+y+" "+z;
    }
}

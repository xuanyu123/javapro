package com.neuedu.test;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-03 3:22 下午
 */
public class Is_Runnian {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if(year < 0){
            System.out.println("输入有误，重新输入");
            System.exit(0);
        }else if ((year % 4 == 0&& year%100 !=0) || (year % 400 == 0)){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
}

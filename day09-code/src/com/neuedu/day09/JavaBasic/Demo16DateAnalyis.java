package com.neuedu.day09.JavaBasic;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-15 5:50 下午
 * 14.日期计算
 * 输入某年某月某日，判断这一天是这一年的第几天？
 *
 * 程序分析：以3月5日为例，应该先把前两个月的加起来，
 *         然后再加上5天即本年的第几天，特殊情况，
 *         闰年且输入月份大于3时需考虑多加一天。
 */
public class Demo16DateAnalyis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\\D");
        System.out.print("请输入当前日期（年-月-日）:");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int date = scan.nextInt();
        scan.close();
        System.out.println("今天是"+year+"年的第"+analysis(year,month,date)+"天");
    }
    public static int analysis(int year,int month,int date){
        int n=0;
        //1月设置为0，12月不需要设置
        int[] month_date = new int[]{0,31,28,31,30,31,30,31,31,30,31,30};
        //判断闰年
        if ((year%400)==0||((year%4==0)&&(year%100!=0)))
            month_date[2]=29;

        for (int i = 0; i < month; i++) {
            n = n+month_date[i];
        }
        return n+date;
    }
}

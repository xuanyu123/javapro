package com.neuedu.day09.JavaBasic;

import sun.net.idn.Punycode;

import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-15 12:57 下午
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值
 *      求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 *      例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 *
 * 程序分析：关键是计算出每一项的值。
 */
public class Demo09Expressed {
    public static void main(String[] args) {
        System.out.print("求s=a+aa+aaa+aaaa+aa...a的值，请输入a的值：");
        Scanner sc = new Scanner(System.in).useDelimiter("\\s*");//以空格作为分隔符
        int a = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        System.out.println(expressed(2,5)+add(2,5));
    }
    //求和表达式
    public static String expressed(int a,int n){
        StringBuffer sb = new StringBuffer();
        StringBuffer subSB = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            subSB = subSB.append(a);
            sb = sb.append(subSB);
            if (i<n){
                sb = sb.append("+");
            }

        }
        sb.append("=");
        return sb.toString();
    }
    //求和
    public static long add(int a,int n){
        long sum = 0;
        long subSum = 0;
        for (int i = 1; i <= n ; i++) {
            subSum = subSum*10+a;
            sum = sum + subSum;
        }
        return sum;
    }
}

package com.neuedu.day08.demo02;

/**
 * @author xuanyu
 * @date 2020-02-13 3:07 下午
 * 递归计算1-n之间的和
 */
public class Demo01Recurison {
    public static void main(String[] args) {
        int s = sum(100);
        System.out.println(s);
    }
    /*
    * 定义一个方法，使用递归计算1-n之间的和
    * 1+2+3+......+n
    * n+（n-1）+(n-2)+.....+1
    * 已知：
    *   最大值：n
    *   最小值：1
    * 使用递归必须明确的条件
    *   1、递归结束的条件   获取到1的时候结束
    *   2、递归的目的      获取下一个被加的数字n-1
    * */
    public static int sum(int n){
        //获取到1的时候结束
        if (n==1){
            return 1;
        }
        //获取下一个被加的数字（n-1）
        return n+sum(n-1);
    }
}

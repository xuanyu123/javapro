package com.neuedu.day08.demo01;

/**
 * @author xuanyu
 * @date 2020-02-13 3:31 下午
 * 输出裴波那契数列的第n项
 *  1 1  2  3  5  8  13......
 */
public class Demo01FibRecurison {
    public static void main(String[] args) {
        int s = fibRecurison(5);
        System.out.println(s);
    }
    /*
        递归法
    * */
    public static int fibRecurison(int n){
        if (n<=0){
            return -1;
        }else if (n==1||n==2){
            return 1;
        }else {
            return fibRecurison(n-1)+fibRecurison(n-2);
        }
    }
}

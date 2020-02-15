package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 11:26 下午
 * 22.利用递归方法求5!。
 * 程序分析：递归公式：fn=fn_1*4!
 */
public class Demo22 {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }
    public static long fun(int n){
        if (n==1)
            return 1;
        else
            return fun(n-1)*n;
    }
}

package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 9:33 下午
 */
public class Demo06MethodSum {
    public static void main(String[] args) {
        System.out.println("result is："+getSum());
    }
    /*
     *三要素：
     *返回值类型：int
     *方法名称：getSum
     *参数列表：无条件
     */
    public static int getSum() {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

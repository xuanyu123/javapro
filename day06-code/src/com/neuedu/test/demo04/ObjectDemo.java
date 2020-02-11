package com.neuedu.test.demo04;

/**
 * @author xuanyu
 * @date 2020-02-11 6:23 下午
 * equals  比较的是地址值
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(2);
        Demo d2 = new Demo(2);
        Demo d3 = new Demo(3);

        boolean result1 = d1.equals(d2);
        boolean result2 = d1.equals(d3);
        System.out.println(result1);
        System.out.println(result2);
    }
}

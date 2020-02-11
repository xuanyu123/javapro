package com.neuedu.test.demo04;

/**
 * @author xuanyu
 * @date 2020-02-11 6:36 下午
 * toString   hashCode
 */
public class ObjectDemo2 {
    public static void main(String[] args) {
        Demo d1 = new Demo(2);
        System.out.println(d1);//当直接打印一个对象的时候，默认会调用这个对象的toString方法
        System.out.println(d1.toString());
        System.out.println(d1.hashCode());
        System.out.println(Integer.toHexString(d1.hashCode()));
    }
}

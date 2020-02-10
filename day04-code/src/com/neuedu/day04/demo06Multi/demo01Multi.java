package com.neuedu.day04.demo06Multi;

/**
 * @author xuanyu
 * @date 2020-02-06 8:35 下午
 */
public class demo01Multi {
    public static void main(String[] args) {
        // 使用多态
        // 左边父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();
        // new谁，用谁
        obj.method();
        obj.methodFu();
//        obj.methodZi();
    }
}

package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 8:59 上午
 */
public class Demo04SetName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread03 mt = new MyThread03();
        //开启start
        mt.setName("Neuedu");
        mt.start();

        //开启多线程
        new MyThread03("Neuedu2").start();
    }
}

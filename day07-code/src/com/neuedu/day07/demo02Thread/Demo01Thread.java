package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 12:16 上午
 * 创建多线程的第一种方式：创建Thread类的子类
 */
public class Demo01Thread {
    public static void main(String[] args) {
        //3、创建Thread类的子类对象
        MyThread mt = new MyThread();
        //4、调用Thread类中的方法start方法，开启新的线程，执行run方法
        mt.start();

        for (int i = 1; i <=20 ; i++) {
            System.out.println("main:"+i);
        }
    }
}

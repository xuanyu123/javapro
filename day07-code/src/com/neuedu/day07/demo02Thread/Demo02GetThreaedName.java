package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 12:25 上午
 */
public class Demo02GetThreaedName {
    public static void main(String[] args) {
        //3、创建Thread类的子类对象
        MyThread02 mt = new MyThread02();
        //4、调用Thread类中的方法start方法，开启新的线程，执行run方法
        mt.start();
        new MyThread02().start();
        new MyThread02().start();

        System.out.println(Thread.currentThread().getName());
    }
}

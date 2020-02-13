package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 12:26 上午
 * 获取线程名称：
 *  1、使用Thread类中的方法getName（）
 *      String  getName（） 返回该线程的名称
 *  2、可以现货区当前正在执行的线程，使用线程的方法getName（）获取线程的名称
 *      static  Thread  currentThread（） 返回当前正在执行的线程对象的引用
 */
//1、创建Thread类的子类
public class MyThread02 extends Thread {
    //2、重写Thread类中的run方法， 设置线程任务

    @Override
    public void run() {
        /*String name = getName();
        System.out.println(name);*/

        /*Thread t = Thread.currentThread();
        System.out.println(t);

        String name = t.getName();
        System.out.println(name);*/

        System.out.println(Thread.currentThread().getName());

    }
}

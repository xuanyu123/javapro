package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 12:17 上午
 *
 */
//1、创建一个Thread类的子类
public class MyThread extends Thread{
    //2.在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
    @Override
    public void run() {
        for (int i = 1; i <= 20 ; i++) {
            System.out.println("run:"+i);
        }
    }
}

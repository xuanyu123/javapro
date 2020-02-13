package com.neuedu.day07.demo03Runnable;

/**
 * @author xuanyu
 * @date 2020-02-13 12:03 下午
 */
//1、创建Runnable接口的实现类
public class RunnableImpl2 implements Runnable {
    //2、重写Runnable接口的run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            System.out.println("HelloWorld"+"--->"+i);
        }
    }
}

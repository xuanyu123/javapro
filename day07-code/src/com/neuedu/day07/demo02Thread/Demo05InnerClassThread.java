package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 2:32 下午
 * 匿名内部类方式实现线程的创建
 *  格式：
 *      new 父类/接口(){
 *          重写父类/接口中的方法
 *      }
 */
public class Demo05InnerClassThread {
    public static void main(String[] args) {
        //线程的父类Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        }.start();
        //线程的接口Runnable
        //Runnable r = new RunnableImpl();///多态
        Runnable r = new Runnable(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        };
        new Thread(r).start();

        //简化接口方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        }).start();
    }
}

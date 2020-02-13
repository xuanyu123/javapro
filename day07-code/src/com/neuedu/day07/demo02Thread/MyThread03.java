package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 8:59 上午
 */
//创建Thread类的子类
public class MyThread03 extends Thread{
    public MyThread03() {

    }

    public MyThread03(String name) {
        super(name);//把线程名称传递给父类，让父类给子线程起名字
    }

    //重写Thread类中的run方法，设置任务
    @Override
    public void run() {
        //获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}

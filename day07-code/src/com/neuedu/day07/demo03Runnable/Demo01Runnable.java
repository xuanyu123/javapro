package com.neuedu.day07.demo03Runnable;

/**
 * @author xuanyu
 * @date 2020-02-13 12:02 下午
 * 创建多线程的第二种方式：实现Runnable接口
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        //3、创建一个Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //4、创建Thread类对象，构造方法中传递Runnable接口的实现类对象
//        Thread t = new Thread(run);
        Thread t = new Thread(new RunnableImpl2());
        //5、调用Thread类中的start方法，开启新的线程执行
        t.start();

        //main线程
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }

}

package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 12:37 上午
 * sleep 使当前正在执行的程序以指定的毫秒数暂停，毫秒数结束以后，继续运行
 */
public class Demo03Sleep {
    public static void main(String[] args) {
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);
            //使用Thread 类的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

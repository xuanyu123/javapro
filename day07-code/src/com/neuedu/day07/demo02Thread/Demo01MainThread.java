package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 12:01 上午
 * 主线程：执行main方法的线程
 * 单线程程序：java中只有一个线程
 * 执行从main方法开始，从上到下依次执行
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();

        Person p2 = new Person("李华");
        p2.run();
    }
}

package com.neuedu.day04.demo07Laptop;

/**
 * @author xuanyu
 * @date 2020-02-06 11:49 下午
 * 键盘就是一个USB设备
 */
public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
    public void type(){
        System.out.println("键盘输入");
    }
}

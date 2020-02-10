package com.neuedu.day04.demo07Laptop;

/**
 * @author xuanyu
 * @date 2020-02-06 11:49 下午
 * 鼠标就是一个USB设备
 */
public class MOuse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}

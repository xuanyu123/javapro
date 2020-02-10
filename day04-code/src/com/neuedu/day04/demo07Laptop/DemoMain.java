package com.neuedu.day04.demo07Laptop;

/**
 * @author xuanyu
 * @date 2020-02-06 11:56 下午
 */
public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();//打开电脑

        //准备一个鼠标，供电脑使用
        //首先向上转型
        USB usbMouse = new MOuse();//使用了多态写法
        //参数是USB类型，我正好传递进去的仅是USB鼠标
        computer.usbDevice(usbMouse);

        //创建一个键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传进去的是实现类对象
        computer.usbDevice(keyboard);//正确写法
        //使用子类对象、匿名对象，也可以
//        computer.usbDevice(new Keyboard());

        computer.powerOff();//关闭电脑
    }
}

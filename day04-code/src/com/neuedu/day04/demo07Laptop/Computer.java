package com.neuedu.day04.demo07Laptop;

import java.security.Key;

/**
 * @author xuanyu
 * @date 2020-02-06 11:46 下午
 */
public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
    public void usbDevice(USB usb){
        usb.open();
        if (usb instanceof MOuse){//一定要先判断
            MOuse mouse = (MOuse) usb;//向下转型
            mouse.click();
        }else if (usb instanceof Keyboard){//先判断
            Keyboard keyboard = (Keyboard) usb;//向下转型
            keyboard.type();
        }
        usb.close();
    }
}

package com.neuedu.day03.demo07;

/**
 * @author xuanyu
 * @date 2020-02-05 4:20 下午
 */
public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();//继承了Phone
        System.out.println("show name") ;
        System.out.println("show pic");
    }
}

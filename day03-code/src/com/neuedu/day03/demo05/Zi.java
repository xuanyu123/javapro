package com.neuedu.day03.demo05;

/**
 * @author xuanyu
 * @date 2020-02-05 2:58 下午
 */
public class Zi extends Fu{
    int num = 20;
    public void methodZi(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num );
    }
}

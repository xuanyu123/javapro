package com.neuedu.day03.demo08;

/**
 * @author xuanyu
 * @date 2020-02-05 4:34 下午
 */
public class Zi extends Fu{
    public Zi(){
//        super();//调用父类无参的构造方法
        super(10);//调用父类重载的构造方法
        System.out.println("子类构造方法");
    }
}

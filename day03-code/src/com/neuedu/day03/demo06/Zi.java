package com.neuedu.day03.demo06;

/**
 * @author xuanyu
 * @date 2020-02-05 3:05 下午
 */
public class Zi extends Fu{
    public void methodZi(){
        System.out.println("子类方法执行");
    }
    public void method(){
        System.out.println("子类方法重名执行");
    }
    @Override
    public String  method3(){
        return null;
    }
}

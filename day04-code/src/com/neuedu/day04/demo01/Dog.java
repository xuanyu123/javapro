package com.neuedu.day04.demo01;

/**
 * @author xuanyu
 * @date 2020-02-06 10:24 上午
 * 如果父类的所有抽象方法不全部重写，子类也必须是一个抽象类
 */
public abstract class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("eat something");
    }
//    public void sleep();
}

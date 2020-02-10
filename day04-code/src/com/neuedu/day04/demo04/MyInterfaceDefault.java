package com.neuedu.day04.demo04;

/**
 * @author xuanyu
 * @date 2020-02-06 12:28 下午
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();
    //添加一个抽象方法
//    public abstract void methodsAbs1();
    //新添加的方法，改成默认方法
    public default void methodAbs1(){
        System.out.println("默认方法");
    }
}

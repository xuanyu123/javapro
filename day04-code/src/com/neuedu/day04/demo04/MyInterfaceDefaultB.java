package com.neuedu.day04.demo04;

/**
 * @author xuanyu
 * @date 2020-02-06 12:29 下午
 */
public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {
        System.out.println("BBB");
    }

    @Override
    public void methodAbs1() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}

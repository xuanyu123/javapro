package com.neuedu.day03.demo04;

/**
 * @author xuanyu
 * @date 2020-02-05 2:27 下午
 */
public class Demo01ExtendsFiled {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类内容
        System.out.println("============");

        Zi zi = new Zi();

        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20
        System.out.println("============");

        //等号左边是谁，优先用谁
        System.out.println(zi.num);//优先子类，200
//        System.out.println(zi.abc);//到处没有，编译报错
        //这个方法是子类的，优先用子类的，没有向上找
        zi.methodZi();//200
        //这个方法是父类的
        zi.methodFu();//100
    }
}

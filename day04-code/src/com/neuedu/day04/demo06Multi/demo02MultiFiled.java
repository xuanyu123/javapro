package com.neuedu.day04.demo06Multi;

/**
 * @author xuanyu
 * @date 2020-02-06 8:54 下午
 */
public class demo02MultiFiled {
    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象
        Fu2 obj = new Zi2();
        System.out.println(obj.num);
        System.out.println("===========");
        //子类没有覆盖重写，就是父
        //子类如果覆盖重写，就是子
        obj.showNum();
    }
}

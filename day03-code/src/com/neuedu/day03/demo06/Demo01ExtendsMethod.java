package com.neuedu.day03.demo06;

/**
 * @author xuanyu
 * @date 2020-02-05 3:06 下午
 * 在父子类的继承关系当中，创建子类对象，访问成员方法的规则
 * 创建的对象是谁，就优先用谁，如果没有则向上找。
 * 注意事项：
 * 无论是成员方法还是成员变量，如果没有都是向上找父类，绝不会向下找子类的。
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();
        //创建的是new了子类对象，所以优先用子类方法
        zi.method();
        //子类对象没有，向上找
        zi.method2();

        zi.method3();
    }
}

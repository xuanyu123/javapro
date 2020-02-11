package com.neuedu.test.demo05;

/**
 * @author xuanyu
 * @date 2020-02-11 6:46 下午
 */
public class InnerPack {
    public void method(){
        Inner inner = new Inner();
        inner.show();
    }

    public static void main(String[] args) {
        //静态方法无法直接调用内部类
        InnerPack innerPack = new InnerPack();
        innerPack.method();
        //静态内部类可以直接在外部类的main函数中调用
        Inner2 inner2 = new Inner2();
        inner2.show();
    }

    //内部类
    class Inner{
        void show(){
            System.out.println("inner show");
        }
    }
    //静态内部类
    public static class Inner2{
        void show(){
            System.out.println("inner show2");
        }
    }
}

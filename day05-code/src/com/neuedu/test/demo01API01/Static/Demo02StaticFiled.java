package com.neuedu.test.demo01API01.Static;

/**
 * @author xuanyu
 * @date 2020-02-08 10:41 上午
 * 一旦使用了static关键字，那么该方法就不再属于对象，而是属于所在的类
 *
 * 如果没有static关键字，就必须创建对象，然后通过对象才能使用它
 */
public class Demo02StaticFiled {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();//首先创建对象
        myClass.method();//然后才能使用没有static关键字的内容

        //静态方法，可以通过对象名调用，也可以通过类名直接调用
        myClass.methodStatic();//正确，不推荐

        MyClass.methodStatic();//正确，推荐

        //本类中的静态方法访问时，可以省略类名，编译时完全等效于下面一种
        Mymethod();
        Demo02StaticFiled.Mymethod();
    }
    public static void Mymethod(){
        System.out.println("自己的静态方法");
    }
}

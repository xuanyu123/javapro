package com.neuedu.work.Shape;

/**
 * @author xuanyu
 * @date 2020-02-05 9:10 下午
 * 编写测试类，在main方法中，分别使用父类引用指向子类对象，声明创建一个矩形和圆的对象，
 * 并调用2个子类的showAll方法。
 */
public class DemoTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,3,"red");
        rectangle.showAll();

        Circle circle = new Circle(3,"yellow");
        circle.showAll();
    }
}

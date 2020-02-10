package com.neuedu.work.Shape;

/**
 * @author xuanyu
 * @date 2020-02-05 8:26 下午
 * 设计Shape表示图形类
 * 1、有面积属性area、周长属性per，颜色属性color，
 * 2、有两个构造方法（一个是默认的、一个是为颜色赋值的），
 * 3、还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息
 */
public abstract class Shape {
    protected double area;
    protected double per;
    protected String color;

    public Shape(){

    }
    public Shape(String color){
        this.color = color;
    }
    public abstract double getArea();

    public abstract double getPer();

    public abstract void showAll();

}

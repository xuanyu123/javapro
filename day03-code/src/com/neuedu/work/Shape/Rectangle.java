package com.neuedu.work.Shape;

/**
 * @author xuanyu
 * @date 2020-02-05 8:48 下午
 * 1）Rectangle表示矩形类，
 * a) 增加2个属性，width表示长度、height表示宽度，
 * b) 重写getPer、getArea和showAll三个方法，
 * c) 另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPer() {
        return (width + height) * 2;
    }

    @Override
    public void showAll() {
        System.out.println("面积为："+getArea()+",周长为："+getPer()+",颜色为："+color);
    }
}

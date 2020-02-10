package com.neuedu.work.Shape;

import java.text.DecimalFormat;

/**
 * @author xuanyu
 * @date 2020-02-05 9:06 下午
 * 2）Circle表示圆类，
 * a) 增加1个属性，radius表示半径，
 * b) 重写getPer、getArea和showAll三个方法，
 * c) 另外又增加两个构造方法（为半径、颜色赋值的）
 */
public class Circle extends Shape {
    private  double radius;
    //控制输出小数位
    DecimalFormat df = new DecimalFormat("0.0000");

    public Circle() {

    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPer() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void showAll() {
        System.out.println("面积为：" + df.format(getArea()) + ",周长为：" + getPer()+ ",颜色为：" + color);
    }
}

package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 2:29 下午
 * 10.反指数计算
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Demo11Distance {
    public static void main(String[] args) {
        distance(100,10);
    }
    public static void distance(double h,int n){
        double length = 0;
        for (int i = 1; i <= n; i++) {
            length = length + h;
            h = h*0.5;
            length = length + h;
        }
        System.out.println("经过第"+n+"次反弹后，小球共经过"+length+
                "米，"+"第"+n+"次反弹高度为："+h+"米");
    }
}

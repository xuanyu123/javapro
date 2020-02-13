package com.neuedu.day08.demo01;

/**
 * @author xuanyu
 * @date 2020-02-13 3:52 下午
 * 一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后反弹多高
 */
public class Demo03Ball {
    public static void main(String[] args) {
        //记录球的初始高度
        double h = 100;
        //记录小球的反弹高度
        double up = 0;
        //记录小球下落的距离
        double down = 0;
        for (int i = 1; i < 10; i++) {
            down = down + h;
            up = up + h/2;
            h = h/2;
        }
        System.out.println("第10次落地共经过"+(down+up+h)+"米");
        System.out.println("第10次反弹高度："+h/2);
    }
}

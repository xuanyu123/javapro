package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 12:09 下午
 * 题目：计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 *
 * 分析：
 * 1、for循环
 * 2、起点位置-10.8应该转换-10，两种办法：
 *    - 可以使用math.ceil向上（向正方向）取整
 *    - 强转成为int，自动舍弃所有小数位
 * 3、每一个数字都是整数，所以步进表达式num++，这样每次都是+1
 * 4、如何拿到绝对值，Math.abs
 * 5、一旦发现了满足条件的整数，计数器就+1
 * 备注：如果使用Math.ceil,-10.8转换成-10.0，double也是可以进行++的。
 */
public class Demo08Abs {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (int i = (int)min; i < max ; i++) {
            int abs = Math.abs(i);
            if (abs>6||abs<2.1){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("共有"+count+"个满足条件的整数");
    }
}

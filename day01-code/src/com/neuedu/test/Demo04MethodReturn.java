package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 8:27 下午
 */
/*
题目要求：定义一个方法，用来求两个数字之和。（你帮我算，算完之后把结果告诉我）
题目要求：定义一个方法，用来求打印数字之和。（你来计算，算完之后你自己负责显示结果，不用告诉我）

注意事项：
对于有返回值的方法，可以使用单独调用、打印调用、赋值调用
但是对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用
*/
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法，我来调用你
        //我调用你，你来帮我计算一下，算完了之后，把结果告诉我的number变量
        int number = getSum(10, 20);
        System.out.println("返回值：" + number);
        System.out.println("=================");

        printSum(100,200);
    }

    //我是一个方法，我负责两个数字相加
    //我有返回值，谁调用我，我就把计算结果告诉谁
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }
    public static void printSum(int a,int b) {
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}

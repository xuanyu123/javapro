package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 8:08 下午
 */
/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数
    例如两个数字相加，必须知道两个数字是各自有多少，才能相加

无参数：小括号当中留空。一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数
    例如定义一个方法，打印固定10次HelloWord
*/
public class Demo03MethodParam {
    public static void main(String[] args) {
        //有参数
        method1(10,20);
        //无参数
        method2();
    }
    public static void method1(int a,int b){
        int result = a * b;
        System.out.println("结果是："+result);
    }
    public static void method2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello,World");
        }
    }
}

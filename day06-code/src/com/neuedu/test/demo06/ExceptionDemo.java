package com.neuedu.test.demo06;

/**
 * @author xuanyu
 * @date 2020-02-11 7:02 下午
 * 异常
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        //算数异常 java.lang.ArithmeticException: / by zero
        ExceptionDemo demo = new ExceptionDemo();
        try {
            int res = demo.div(4,0);
            System.out.println(res);
        }catch (Exception e){//定义一个异常类，用于接收发生异常的对象
            System.out.println("出现异常");
            System.out.println("message:"+ e.getMessage());
            System.out.println("toString:"+ e.toString());
            e.printStackTrace();
        }
        System.out.println("==========");
    }

    //除法运算
    public int div(int a,int b){
        return a/b;
    }
}

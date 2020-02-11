package com.neuedu.test.demo06;

/**
 * @author xuanyu
 * @date 2020-02-11 7:02 下午
 * 异常
 */
public class ExceptionDemo4 {
    //mian函数也不处理异常，最终抛给了jvm
    public static void main(String[] args) throws Exception {
        //算数异常 java.lang.ArithmeticException: / by zero
        ExceptionDemo4 demo = new ExceptionDemo4();
        int res = demo.div(4,0);
        System.out.println(res);
    }

    //除法运算
    public int div(int a,int b) throws Exception{
        return a/b;
    }
}

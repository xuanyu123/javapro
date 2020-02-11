package com.neuedu.test.demo06;

/**
 * @author xuanyu
 * @date 2020-02-11 7:02 下午
 * 异常
 */
public class ExceptionDemo3 {

    public static void main(String[] args) {
        //算数异常 java.lang.ArithmeticException: / by zero
        ExceptionDemo3 demo = new ExceptionDemo3();
        try {
            int res = demo.div(4,0);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //除法运算
    public int div(int a,int b) throws Exception{
        return a/b;
    }
}

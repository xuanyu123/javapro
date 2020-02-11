package com.neuedu.test.demo06;

/**
 * @author xuanyu
 * @date 2020-02-11 7:02 下午
 * 异常
 */
public class ExceptionDemo6 {

    public static void main(String[] args) {
        //算数异常 java.lang.ArithmeticException: / by zero
        ExceptionDemo6 demo = new ExceptionDemo6();
        try {
            int res = demo.div(4,0);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.exit(0);//退出jvm虚拟机，这种情况下执行不到finally
        }finally {//表示总是执行的代码
            System.out.println("finally");
        }
    }

    //除法运算
    public int div(int a,int b) throws Exception{
        return a/b;
    }
}

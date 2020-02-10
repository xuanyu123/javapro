package com.neuedu.day03.demo06;

/**
 * @author xuanyu
 * @date 2020-02-05 3:05 下午
 */
public class Fu {
    public void methodFu(){
        System.out.println("父类方法执行");
    }
    public void method(){
        System.out.println("父类方法重名执行");
    }
    public void method2(){
        System.out.println("父类方法重名执行2");
    }
    //覆盖重写
    public Object method3(){
        return null;
    }
}

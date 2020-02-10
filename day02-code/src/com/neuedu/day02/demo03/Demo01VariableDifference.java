package com.neuedu.day02.demo03;

/**
 * @author xuanyu
 * @date 2020-02-04 1:00 下午
 */
public class Demo01VariableDifference {
    String name;  //成员变量，整个类中都可以使用

    public void methodA(){
        int num= 20;   //局部变量，只能在本类方法中使用，除了本类就无法使用
        System.out.println(num);
    }
    public void methodB(int param){  //方法的参数就是局部变量
        //参数在方法调用时，必然会被赋值
        System.out.println(param);
        int age;  //局部变量
//        System.out.println(age);//局部变量没有默认值，不赋值不能用
//        System.out.println(num);//局部变量，其他方法无法调用
        System.out.println(name);
    }
}

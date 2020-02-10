package com.neuedu.test;


public class MyTest {
    public static String getType(Object test) {
        return test.getClass().getName().toString();

    }
    public static void main(String[] args) {
/*        //左边是long类型，右边是默认int类型，左右不一样
        //int——>long   符合数据范围小到大的规则
        //发生了自动转换
        long num1 = 100;
        System.out.println(getType(num1));
        System.out.println(num1);

        //左边是double类型，右边是float类型，左右不一样
        //int——>long   符合数据范围小到大的规则
        //发生了自动转换
        double num2 = 2.5F;
        System.out.println(getType(num2));
        System.out.println(num2);

        //左边是long类型，右边是默认int类型，左右不一样
        //int——>long   符合数据范围小到大的规则
        //发生了自动转换
        float num3 = 100;
        System.out.println(getType(num3));
        System.out.println(num3);

        //左边是int类型，右边是float类型，左右不一样
        //double——>int   符合数据范围小到大的规则
        //发生了自动转换
        int num4 = (int)3.99;  //这不是四舍五入，而是所有的小数位都会被舍弃
        System.out.println(getType(num4));
        System.out.println(num4);

        */

        //解决数值的取值范围，例如age不能超过100，sex只能输入男女
/*        Person p1 = new Person();
        p1.setAge(50);
        System.out.println(p1.getAge());*/

/*        int sum = p1.add(10,30);
        System.out.println(sum);*/

        Dog d1 = new Dog();
        d1.setAge(10);
        System.out.println(d1.getAge());

        d1.setSex('公');
        System.out.println(d1.getSex());
    }
}

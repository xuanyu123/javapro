package com.neuedu.day02.demo03;

/**
 * @author xuanyu
 * @date 2020-02-04 10:45 下午
 * 问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来
 * 解决方案：用Private关键字将需要保护的成员变量进行修饰。
 *
 * 一旦使用了private关键字进行修饰。那么本类当中仍然可以随意访问
 * 超出了本类范围就不可以直接访问了
 *间接访问private成员变量，就是定义一堆Getter/Setter方法
 * 对于Getter来说，不能有参数，返回值类型和成员变量对应
 * 对于Setter来说，不能有返回值，参数类型和成员变量对应
 */
public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫"+name+"年龄："+age);
    }
//这个成员方法，专门用于向age设置数据
    public void setAge(int age) {
        if (age<130&&age>0) {
            this.age = age;
        }else{
            System.out.println("输入有误，重新输入");
        }
    }
//这个成员方法，专门用于获取age的数据
    public int getAge() {
        return age;
    }
}

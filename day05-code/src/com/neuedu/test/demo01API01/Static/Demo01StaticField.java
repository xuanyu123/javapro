package com.neuedu.test.demo01API01.Static;

/**
 * @author xuanyu
 * @date 2020-02-07 10:00 下午
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("jose",10);
        one.room = "101教室";
        System.out.println("姓名："+one.getName()+"，年龄："+one.getAge()
                    +"，教室："+one.room+"，学号："+one.getId());

        Student two = new Student("mike",16);
        two.room = "101教室";
        System.out.println("姓名："+two.getName()+"，年龄："+two.getAge()
                    +"，教室："+two.room+"，学号："+two.getId());
    }
}

package com.neuedu.day02.demo03;

/**
 * @author xuanyu
 * @date 2020-02-04 11:21 下午
 */
public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("joes");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("name:"+stu.getName());
        System.out.println("age:"+stu.getAge());
        System.out.println("male:"+stu.isMale());
    }
}

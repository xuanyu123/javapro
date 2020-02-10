package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 1:45 下午
 */
public class Person {
    private int age;
    private int no;
    private char sex;

    /*public int add(int a, int b) {
        int c = a + b;
        return c;
    }*/

    public void setAge(int age) {
        if (age < 0 || age > 130) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        if (sex != '男' && sex != '女') {
            System.out.println("输入错误，必须是男或者女");
        } else {
            this.sex = sex;
        }
    }
}

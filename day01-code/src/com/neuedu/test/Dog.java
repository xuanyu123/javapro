package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 2:17 下午
 */
public class Dog {
    private int age;
    private char sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<1 || age > 20){
            System.out.println("输入有误");
        }else{
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex != '公' && sex != '母'){
            System.out.println("输入有误，请重新输入");
        }
        this.sex = sex;
    }
}

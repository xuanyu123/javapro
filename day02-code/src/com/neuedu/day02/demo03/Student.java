package com.neuedu.day02.demo03;

/**
 * @author xuanyu
 * @date 2020-02-04 11:18 下午
 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<130) {
            this.age = age;
        } else {
            System.out.println("输入不合理，请重新输入");
        }
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}

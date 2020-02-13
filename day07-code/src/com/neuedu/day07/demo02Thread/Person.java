package com.neuedu.day07.demo02Thread;

/**
 * @author xuanyu
 * @date 2020-02-13 12:02 上午
 */
public class Person {
    private String name;

    public void run(){
        //定义循环，执行20次
        for (int i = 1; i <= 20; i++) {
            System.out.println(name+"——>"+i);
        }

    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

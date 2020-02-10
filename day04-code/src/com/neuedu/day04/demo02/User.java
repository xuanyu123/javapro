package com.neuedu.day04.demo02;

/**
 * @author xuanyu
 * @date 2020-02-06 10:39 上午
 */
public class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    //展示一下当前用户有多少钱
    public void show(){
        System.out.println("name:"+name+",money:"+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

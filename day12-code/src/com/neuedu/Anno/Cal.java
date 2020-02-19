package com.neuedu.Anno;

/**
 * @author xuanyu
 * @date 2020-02-19 4:00 下午
 */
public class Cal {
    @Check
    public void add(){
        int i = 3/0;
        System.out.println(i);
    }
    @Check
    public void sub(){
        System.out.println("sub");
    }
    @Check
    public void mutli(){
        System.out.println("mutli");
    }
    @Check
    public void div(){
        String name = null;
        name.toString();
    }

    public void show(){
        System.out.println("No Bug");
    }
}

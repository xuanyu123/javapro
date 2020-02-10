package com.neuedu.day03.demo03;

/**
 * @author xuanyu
 * @date 2020-02-05 2:20 下午
 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建了一个子类对象:讲师
        Teacher teacher = new Teacher();
        teacher.method();
        //创建另一个子类对象：助理
        Assistant assistant = new Assistant();
        assistant.method();
    }
}

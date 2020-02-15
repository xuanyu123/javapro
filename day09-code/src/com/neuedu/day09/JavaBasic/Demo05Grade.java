package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 10:01 上午
 * 5.条件运算符使用
 * 利用条件运算符的嵌套来完成此题：
 * 学习成绩>=90分的同学用A表示，
 * 60-89分之间的用B表示，
 * 60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
public class Demo05Grade {
    public static void main(String[] args) {
        grade(100);
    }
    public static void grade(int n){
        if (n<0||n>100)
            System.out.println("输入无效，重新输入");
        else {
            String str = (n>=90)?"分，属于A等":((n>=60)?"分，属于B等":"分，属于C等");
            System.out.println(n+str);
        }
    }
}

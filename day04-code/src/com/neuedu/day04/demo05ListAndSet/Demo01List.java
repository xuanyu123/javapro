package com.neuedu.day04.demo05ListAndSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xuanyu
 * @date 2020-02-06 1:07 下午
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态, 父类引用指向子类对象
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//不是地址，重写了toString
        System.out.println("=========");
        //在c和d之间添加元素
        list.add(3,"e");
        System.out.println(list);
        System.out.println("=========");
        //删除b
        String removeE = list.remove(1);
        System.out.println("被删除的元素为："+removeE);
        System.out.println(list);
        System.out.println("========");
        //把最后一个a，替换为A
        String setE = list.set(4,"A");
        System.out.println("被替换的元素为："+setE);
        System.out.println(list);
        System.out.println("========");
        //list集合遍历有3种方式
        //for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("=========");
        //使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("=========");
        //使用增强for
        for (String s : list) {
            System.out.print(s+" ");
        }
    }
}

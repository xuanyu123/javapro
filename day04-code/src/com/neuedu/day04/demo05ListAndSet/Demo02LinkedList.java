package com.neuedu.day04.demo05ListAndSet;

import javax.xml.transform.Source;
import java.util.LinkedList;

/**
 * @author xuanyu
 * @date 2020-02-06 5:46 下午
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }
    private static void show01(){
        //创建linkedlist集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);
        //将指定元素插入此列表的开头
//        linked.addFirst("www");
        linked.push("e");
        System.out.println(linked);
        //将指定元素添加到此列表的结尾，
        linked.addLast("last");// 等效于add（）
        System.out.println(linked);
    }
    private static void show02(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
//        linked.clear();

        if (!linked.isEmpty()){
            System.out.println(linked.getFirst());
            System.out.println(linked.getLast());
        }
    }
    private static void show03(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");

        //删除第一个元素
        System.out.println(linked.removeFirst());
        System.out.println(linked);
//        System.out.println(linked.removeLast());
        System.out.println(linked.pop() );
        System.out.println(linked);

    }

}

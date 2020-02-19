package com.neuedu.Set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xuanyu
 * @date 2020-02-19 8:51 下午
 */
public class GenericDemo02 {
    public static void main(String[] args) {
        show01();
    }
    public static void show01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
//        list.add(1);
        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String a = it.next();
            System.out.println(a+"--->"+a.length());
        }
    }
}

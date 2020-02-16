package com.neuedu.day10.demo01ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author xuanyu
 * @date 2020-02-16 10:56 上午
 * 打印ArrayList集合，要求输出格式{10@20@30}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println(list);
        printArrayList(list);
    }
    /*
    * 返回值类型：只进行打印，没有计算，没有结果，所以用add
    * 方法名称：printArrayList
    * 参数列表：ArrayList
    * */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i==list.size()-1){
                System.out.print(name+"}");
            }else{
                System.out.print(name+"@");
            }
        }
    }
}

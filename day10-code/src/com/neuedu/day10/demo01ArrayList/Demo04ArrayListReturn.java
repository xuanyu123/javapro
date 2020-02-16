package com.neuedu.day10.demo01ArrayList;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author xuanyu
 * @date 2020-02-16 11:06 上午
 * 题目：
 * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
 * 要求使用自定义的方法来实现筛选
 *
 * 分析：
 * 1、创建一个大集合，用来存储int数字，<Integer>
 * 2、产生随机数字，Random   r.nextInt()
 * 3、循环20次，将随机数字存入大集合，for循环、add方法
 * 4、定义一个方法，用来进行筛选
 * 筛选：根据大集合，筛选符合要求的元素，得到小集合
 * 三要素：
 * 返回值类型：ArrayList小集合（里面元素个数不确定）
 * 方法名称：getSmallList
 * 参数列表：ArrayList大集合（有20个随机数字）
 * 5、判断（if）是偶数：num%2==0
 * 6、如果是偶数就放到小集合，否则就不放
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
         //1、创建一个大集合，用来存储int数字，<Integer>
        ArrayList<Integer> bigList = new ArrayList<>();
        //2、产生随机数字，Random   r.nextInt()
        Random r = new Random();
        //3、循环20次，将随机数字存入大集合，for循环、add方法
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        for (int i = 0; i < smallList.size() ; i++) {
            System.out.print(smallList.get(i)+" ");
        }
    }
    /*
    * 4、定义一个方法，用来进行筛选
    * 筛选：根据大集合，筛选符合要求的元素，得到小集合
    * 三要素：
    * 返回值类型：ArrayList小集合（里面元素个数不确定）
    * 方法名称：getSmallList
    * 参数列表：ArrayList大集合（有20个随机数字）
    * */
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        //创建一个小集合
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}

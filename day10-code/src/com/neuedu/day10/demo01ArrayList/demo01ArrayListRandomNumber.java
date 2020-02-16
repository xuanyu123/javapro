package com.neuedu.day10.demo01ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xuanyu
 * @date 2020-02-16 10:01 上午
 * 题目：
 * 生成6个1-33之间的随机整数，添加到集合，并遍历集合
 * 思路：
 * 1、需要存储6个数字，创建一个集合，用<Integer>
 * 2、产生随机数，需要用到random
 * 3、用循环6次，来产生6个随机数字，for循环
 * 4、循环内调用r.nextInt(int n)+1  范围1-33
 * 5、把数字添加到集合中  add
 * 6、遍历集合  for、size、get
 */
public class demo01ArrayListRandomNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33)+1;
            list.add(num);
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

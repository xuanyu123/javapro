package com.neuedu.day08.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuanyu
 * @date 2020-02-13 3:54 下午
 * n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开  最后剩下的是第几个人
 * 实现方式：利用可变数组ArrayList实现
 */
public class Demo05NumberOff2 {
    public static void main(String[] args) {
        numberOff(1000);
    }
    /*
    * n  总人数
    * start  开始报数的序号
    * m  出列的标记
    * */
    public static void numberOff(int n){
        List<Integer> list = new ArrayList<Integer>();
        //初始化列表
        for (int i = 1; i <= n ; i++) {
            list.add(i);
        }
        int m=1;
        while (list.size()>1){
            if (m!=3){
                list.add(list.remove(0));
                m++;
            }else {
                list.remove(0);
                m=1;
            }
        }
        System.out.println(list.get(0));
    }
}

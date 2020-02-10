package com.neuedu.test;

/**
 * @author xuanyu
 * @date 2020-02-03 10:26 下午
 */
public class Demo07MethodprintCount {
    public static void main(String[] args) {
        printCount(10);
    }
//    返回值类型：只是进行一大堆打印而已，没有计算
//    方法名称：printCount
//    参数裂变：打印次数  int型  num
    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello,World!"+ (i+1));
        }
    }

}

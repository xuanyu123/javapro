package com.neuedu.day09.JavaBasic;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-15 4:47 下午
 * 题目：
 * 用代码模拟猜测数字的游戏
 *
 * 1、首先需要产生一个随机数字randomNum，并且一旦产生不再变化   random.nextInt();
 * 2、猜测一个数字guessNum，由键盘输入  Scanner
 * 3、判断guessNum与randomNum的大小，如果太小，提示太小，并且重试。
 * 4、判断guessNum与randomNum的大小，如果太大，提示太大，并且重试。
 * 5、判断guessNum与randomNum的大小，如果相等，提示猜中了，游戏结束。
 * 6、如果猜测次数确定，猜错10次则退出，故用for循环
 */
public class Demo14GuessNum {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1;//范围：1——100
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("请输入你猜测的数字：");
            int guessNum = sc.nextInt();//键盘输入猜测的数字
            if (guessNum>randomNum){
                System.out.println("太大了，请重新输入");
            }else if(guessNum<randomNum){
                System.out.println("太小了，请重新输入");
            }else {
                System.out.println("猜中了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}

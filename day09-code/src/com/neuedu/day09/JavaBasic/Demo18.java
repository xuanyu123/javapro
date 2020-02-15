package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 7:18 下午
 * 17.反推计算  猴子吃桃问题：
 *  猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
 *  第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 *  以后每天早上都吃了前一天剩下的一半零一个。
 *  到第10天早上想再吃时，见只剩下一个桃子了。
 *  求第一天共摘了多少。
 * 程序分析：采取逆向思维的方法，从后往前推断。
 */
public class Demo18 {
    public static void main(String[] args) {
        int n=1;
        for (int i = 10; i > 0 ; i--) {
            n = n*2+2;
        }
        System.out.println("小猴子共摘了"+n+"桃子");
    }
}

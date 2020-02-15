package com.neuedu.day09.JavaBasic;

/**
 * @author xuanyu
 * @date 2020-02-15 9:21 上午
 * 3.水仙花数
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class Demo03IsLotus {
    public static void main(String[] args) {
        for (int i = 100; i <=999 ; i++) {
            if (isLotus(i))
                System.out.print(i+" ");
        }
    }
    //判断水仙花数
    public static boolean isLotus(int lotus){
        int unit = lotus%10;
        int decade = (lotus/10)%10;
        int hundreds = lotus / 100;
        boolean flag = true;
        int sum = unit*unit*unit+decade*decade*decade+hundreds*hundreds*hundreds;
        if (lotus==sum){
            return true;
        }else
            return false;
    }

}

package com.neuedu.demo01Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-20 7:28 下午
 * 利用有关日期的API，计算一个人出生了多少天
 * 思路：
 * 1、获取出生日期对应的毫秒值
 *    1.1使用Scanner类中的next方法，获取出生日期
 *    1.2使用DateFormat中的parse方法，将字符串解析为Date格式
 *    1.3把Date格式的日期转换为毫秒值
 * 2、获取当前日期对应的毫秒值
 * 3、两个时间相减（当前日期-出生日期）
 * 4、把毫秒差值转换为天（ms/1000/60/60/24）
 */
public class Demo02Date {
    public static void main(String[] args) throws ParseException {
        //1、获取出生日期对应的毫秒值
        //1.1使用Scanner类中的next方法，获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入出生日期,格式为yyyy-MM-dd：");
        String birthDateString = sc.next();
        //1.2使用DateFormat中的parse方法，将字符串解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse(birthDateString);
        //1.3把Date格式的日期转换为毫秒值
        long birthTime = birthDate.getTime();
        //2、获取当前日期对应的毫秒值
        long currentTime = System.currentTimeMillis();
        long day = (currentTime-birthTime)/1000/60/60/24;
        System.out.println("您已经来到这个世界："+day+"天");
    }
}

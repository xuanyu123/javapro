package com.neuedu.demo02Calender;

import java.util.Calendar;
import java.util.Date;

/**
 * @author xuanyu
 * @date 2020-02-20 8:11 下午
 */
public class Demo01Calender {
    public static void main(String[] args) {
        //使用getInstance获取Calender对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        System.out.print(year+"年");

        //把月增加一个月
        c.add(Calendar.MONTH,1) ;

        int month = c.get(Calendar.MONTH);
        System.out.print(month+"月");//西方：0-11；东方：1-12


        int date = c.get(Calendar.DATE);
        System.out.print(date+"日");
        System.out.println();

        //把日历对象转换为日期对象
        Date time = c.getTime();
        System.out.println(time);

    }
}

package com.neuedu.day02.demo02;

/**
 * @author xuanyu
 * @date 2020-02-04 11:22 上午
 */
public class Demo02PhoneTwo {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("==========");

        one.brand="IPhone";
        one.price=8388.0;
        one.color="red";
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("==========");

        one.call("Joes");
        one.sendMessage();
        System.out.println("==========");


        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("==========");

        two.brand="三星";
        two.price=5999.0;
        two.color="blue";
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("==========");

        one.call("欧巴");
        one.sendMessage();
    }
}

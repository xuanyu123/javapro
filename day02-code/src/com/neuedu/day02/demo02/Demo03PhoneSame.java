package com.neuedu.day02.demo02;

/**
 * @author xuanyu
 * @date 2020-02-04 11:22 上午
 */
public class Demo03PhoneSame {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand); //null
        System.out.println(one.color); //null
        System.out.println(one.price); //0.0
        System.out.println("==========");

        one.brand="IPhone";
        one.price=8388.0;
        one.color="red";
        System.out.println(one.brand); //IPhone
        System.out.println(one.color); //red
        System.out.println(one.price); //8388.0
        System.out.println("==========");

        one.call("Joes");
        one.sendMessage();
        System.out.println("==========");

        //将one当中保存的对象地址值赋值给two
        Phone two = one;
        System.out.println(two.brand); //IPhone
        System.out.println(two.color); //red
        System.out.println(two.price); //8388.0
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

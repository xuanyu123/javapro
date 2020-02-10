package com.neuedu.day02.demo02;

/**
 * @author xuanyu
 * @date 2020-02-04 11:22 上午
 */
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();

        method(one);
        one.brand = "IPhone";
        one.price = 8388.0;
        one.color = "red";
        System.out.println("=========");

        method(one);
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}

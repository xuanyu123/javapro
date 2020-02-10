package com.neuedu.day02.demo02;

/**
 * @author xuanyu
 * @date 2020-02-04 11:22 上午
 */
public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "IPhone";
        one.price = 8388.0;
        one.color = "red";
        return one;
    }
}

package com.neuedu.day03.demo07;

/**
 * @author xuanyu
 * @date 2020-02-05 4:28 下午
 */
public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.sendMessage();
        phone.show();

        NewPhone phone1 = new NewPhone();
        phone1.call();
        phone1.sendMessage();
        phone1.show();
    }
}

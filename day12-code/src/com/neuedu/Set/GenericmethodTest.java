package com.neuedu.Set;

/**
 * @author xuanyu
 * @date 2020-02-19 9:43 下午
 */
public class GenericmethodTest {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        /*
        * 调用含有泛型的方法
        * 传递什么类型就是什么类型
        * */
        gm.method01(1);
        gm.method01(true);
        gm.method01("21313");

        GenericMethod.method02(1);
    }
}

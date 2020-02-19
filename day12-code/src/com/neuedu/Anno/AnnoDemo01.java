package com.neuedu.Anno;

/**
 * @author xuanyu
 * @date 2020-02-19 3:25 下午
 */
public class AnnoDemo01 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {

    }
    @MyAnno
    public void show2() {

    }

    @SuppressWarnings("all")
    public void demo() {
        show1();
        show2();
    }
}

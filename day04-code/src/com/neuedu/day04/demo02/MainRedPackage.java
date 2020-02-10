package com.neuedu.day04.demo02;

import java.util.ArrayList;

/**
 * @author xuanyu
 * @date 2020-02-06 11:13 上午
 */
public class MainRedPackage  {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member member1 = new Member("成员A",0);
        Member member2 = new Member("成员B",0);
        Member member3 = new Member("成员C",0);

        manager.show();//100
        member1.show();//0
        member2.show();//0
        member3.show();//0
        System.out.println("=============");

        //群主发20块钱，分成3个红包
        ArrayList<Integer> redList = manager.send(20,3);
        //三个成员收红包
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);

        manager.show();//100-20
        member1.show();
        member2.show();
        member3.show();
    }
}

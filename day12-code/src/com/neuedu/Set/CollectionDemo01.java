package com.neuedu.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author xuanyu
 * @date 2020-02-19 8:10 下午
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建集合对象，使用多台
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);
        coll.add("1");
        coll.add("2");
        coll.add("3");
        System.out.println(coll);
        //多态  接口  实现类对象
        Iterator<String> it = coll.iterator();

        /*boolean b = it.hasNext();
        System.out.println("b:"+b);
        String c = it.next();
        System.out.println(c);*/

        //使用循环优化
        while (it.hasNext()){
            String a = it.next();
            System.out.print(a+" ");
        }

    }
}

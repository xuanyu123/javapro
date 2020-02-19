package com.neuedu.Set;

/**
 * @author xuanyu
 * @date 2020-02-19 9:10 下午
 */
public class GenericClassDemo03 {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("213131");
        Object obj = gc.getName();
        System.out.println(obj);

        //泛型使用Integer
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        //泛型使用String
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("你好");
        String name1 = gc3.getName();
        System.out.println(name1);

    }
}

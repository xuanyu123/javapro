package com.neuedu.Set;

/**
 * @author xuanyu
 * @date 2020-02-19 9:55 下午
 */
public class GenericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void methd01(String s) {
        System.out.println(s);
    }
}

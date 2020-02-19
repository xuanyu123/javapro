package com.neuedu.Set;

/**
 * @author xuanyu
 * @date 2020-02-19 9:55 下午
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{

    @Override
    public void methd01(I i) {
        System.out.println(i);
    }
}

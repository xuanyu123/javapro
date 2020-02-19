package com.neuedu.Set;

/**
 * @author xuanyu
 * @date 2020-02-19 9:05 下午
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

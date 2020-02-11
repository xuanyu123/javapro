package com.neuedu.test.demo04;

import java.util.Objects;

/**
 * @author xuanyu
 * @date 2020-02-11 6:16 下午
 */
public class Demo {
    private int num;
    Demo(int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        //先判断要比较的对象是不是Demo类型，如果不是，直接返回false
        if (!(obj instanceof Demo)){
            return false;
        }
        Demo d = (Demo)obj;
        if (this.num == d.num){
            return true;
        }else {
            return false;
        }
    }
}

package com.neuedu.test;

import com.neuedu.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xuanyu
 * @date 2020-02-19 12:41 下午
 */
public class CalculatorTest {
    /*
    * 初始化方法：
    * 用于资源申请，所有测试方法在执行之前都会先执行该方法
    * */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /*
    * 释放资源：
    * 在所有方法执行完后，都会执行该方法
    * */
    @After
    public void close(){
        System.out.println("close...");
    }

    /*
    * 测试计算器加法
    * */
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int num = calculator.add(1,2);
        System.out.println(num);
        Assert.assertEquals(3,num);
    }

    /*
     * 测试计算器减法
     * */
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int num = calculator.sub(1,2);
//        System.out.println(num);
        //断言，断言结果是3
        Assert.assertEquals(-1,num);
    }

}

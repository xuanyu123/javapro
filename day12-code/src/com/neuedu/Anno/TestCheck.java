package com.neuedu.Anno;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xuanyu
 * @date 2020-02-19 4:06 下午
 * 简单的测试框架
 * 当主方法执行后，会自动执行被检测的所有方法（加了Check注解的方法），判断方法是否有异常，然后记录到文件中
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1 创建计算器对象
        Cal cal = new Cal();
        //2 获取字节码文件对象
        Class cls = cal.getClass();
        //3 获取所有方法
        Method[] methods = cls.getMethods();
        //4 出现异常的次数
        int count = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            //5 判断方法上是否有注解
            if (method.isAnnotationPresent(Check.class)) {
                //6 有注解就执行检测
                try {
                    method.invoke(cal);
                } catch (Exception e) {
                    //7 捕获异常
                    //8 记录到文件中
                    count++;
                    bw.write(method.getName() + "出现异常");
                    bw.newLine();
                    bw.write("异常的名称:" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因:" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现" + count + "次异常");
        bw.flush();
        bw.close();
    }
}

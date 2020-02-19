package com.neuedu.Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author xuanyu
 * @date 2020-02-19 12:09 下午
 */
public class ReflectTest {
    public static void main(String[] args) {
        try {
            //1、加载配置文件
            Properties pro = new Properties();
            InputStream is = ReflectTest.class.getClassLoader().getResourceAsStream("pro.properties");
            pro.load(is);
            //2、获取配置文件中定义的数据
            String className = pro.getProperty("className");
            String methodName = pro.getProperty("methodName");
            //3、加载该类进内存
            Class cls = Class.forName(className);
            //4、创建对象
            Object obj = cls.newInstance();
            //5、获取方法对象
            Method method = cls.getMethod(methodName);
            //6、执行方法
            method.invoke(obj);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

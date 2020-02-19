package com.neuedu.Reflect;

import com.neuedu.domain.Emp;

import javax.xml.transform.Source;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author xuanyu
 * @date 2020-02-19 10:25 上午
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //获取Emp的Class对象
        Class empClass = Emp.class;
        //Field[] getFields()获取所有public修饰的成员变量
        Field[] fields = empClass.getFields();
        for (Field field : fields){
            System.out.println(field);
        }

        //Field getField(String name)
        Field a = empClass.getField("a");
        //获取成员变量的值
        Emp emp = new Emp();
        Object value = a.get(emp);
        System.out.println(value);
        //设置值
        a.set(emp,"张三");
        System.out.println(emp);

        //Field[] getDeclaredFields()获取所有的成员变量
        Field[] fields1 = empClass.getDeclaredFields();
        for (Field field: fields1){
            System.out.println(field);
        }
        //Field getDeclaredField(String name)
        Field sal = empClass.getDeclaredField("sal");
        //忽略访问权限修饰符的安全检查
        sal.setAccessible(true);//暴力反射
        Object value1 = sal.get(emp);
        System.out.println(value1);

        //Constructor<T>	Class.getConstructor(Class<?>... parameterTypes)
        //返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
        //构造方法有多少个参数，这就得写多少个参数，一一对应
/*        Constructor constructor = empClass.getDeclaredConstructor(Integer.class,String.class,String.class,Integer.class, Date.class,Integer.class,Integer.class,Integer.class);
        System.out.println(constructor);
        constructor.setAccessible(true);
        //创建对象
        Object emp1 = constructor.newInstance(7788, "娄艺潇", "演员",7839,"2000-01-21",10000,188,20);
        System.out.println(emp1);*/

        Object o = empClass.newInstance();
        System.out.println(o);

    }
}

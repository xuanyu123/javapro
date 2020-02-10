package com.neuedu.work.Employee;

/**
 * @author xuanyu
 * @date 2020-02-05 9:21 下午
 * 1、属性：员工的姓名(字符串类型)；
 * 员工的生日月份(整型)
 * 2、抽象方法：getSalary(int month)。
 */
public abstract class ColaEmployee {
    protected String name;
    protected int birth_month;

    public ColaEmployee(String name, int month) {
        this.name = name;
        this.birth_month = month;
    }

    public abstract float getSalary(int month);//某月
}

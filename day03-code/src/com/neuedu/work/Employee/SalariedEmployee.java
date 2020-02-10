package com.neuedu.work.Employee;

/**
 * @author xuanyu
 * @date 2020-02-05 9:24 下午
 * 1、创建SalariedEmployee (拿固定工资的员工)
 * 2、覆盖父类的抽象方法getSalary()
 * 3、SalariedEmployee类：拿固定工资的员工。
 *    参数：固定工资
 */
public class SalariedEmployee extends ColaEmployee{
    private int msalary;

    public SalariedEmployee(String name, int month, int msalary) {
        super(name, month);
        this.msalary = msalary;
    }

    @Override
    public float getSalary(int month) {
        return msalary;
    }
}

package com.neuedu.work.Employee;

/**
 * @author xuanyu
 * @date 2020-02-05 9:25 下午
 * 1、创建SalesEmployee（按月销售额和提成率拿工资的员工）
 * 2、覆盖父类的抽象方法getSalary()
 * 3、SalesEmployee：按月销售额和提成率拿工资的员工，
 * 参数：月销售额(整型)，提成率(浮点型)
 */
public class SalesEmployee extends ColaEmployee {
    private int msales;
    private float rate;

    public SalesEmployee(String name, int month, int msales, float rate) {
        super(name, month);
        this.msales = msales;
        this.rate = rate;
    }

    @Override
    public float getSalary(int month) {
        float salaray;
        return salaray = msales * rate;
    }
}

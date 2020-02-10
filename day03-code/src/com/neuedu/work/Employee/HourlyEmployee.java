package com.neuedu.work.Employee;

/**
 * @author xuanyu
 * @date 2020-02-05 9:25 下午
 * 1、创建HourlyEmployee（拿小时工资的员工）
 * 2、覆盖父类的抽象方法getSalary()
 * 3、HourlyEmployee：按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
 * 参数：每小时的工资（整型），每月工作的小时数(整型)。
 */
public class HourlyEmployee extends ColaEmployee {
    private int hsalary;//每小时的工资
    private int hours;  //每月工作的小时数

    public HourlyEmployee(String name, int month, int hsalary, int hours) {
        super(name, month);
        this.hsalary = hsalary;
        this.hours = hours;
    }

    @Override
    public float getSalary(int month) {
        float salary;
        if (hours <= 160){
            salary = hsalary * hours;
        }else{
            salary =(float)(hsalary * 160 + hsalary*1.5*(hours-160));
        }
        return salary;
    }
}

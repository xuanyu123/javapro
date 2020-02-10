package com.neuedu.work.Employee;

/**
 * @author xuanyu
 * @date 2020-02-05 11:30 下午
 */
public class Test {
    public static void main(String[] args) {
        ColaEmployee colaEmployee[] = new ColaEmployee[3];
        colaEmployee[0] = new SalariedEmployee("joes",8,8000);
        colaEmployee[1] = new HourlyEmployee("mike",5,60,170);
        colaEmployee[2] = new SalesEmployee("frank",11,6000,1.5f);

        for (int i = 0; i < colaEmployee.length; i++) {
            payWage(colaEmployee[i],8);
        }
    }
    //每个员工当月工资
    public static void payWage(ColaEmployee emp, int month){
        float salary = emp.getSalary(month);
        System.out.println(emp.name+"的工资为："+salary);
    }
}

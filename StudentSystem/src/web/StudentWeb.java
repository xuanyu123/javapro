package web;

import model.Student;
import service.InterfaceStudentService;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-18 11:51 下午
 */
public class StudentWeb {
    InterfaceStudentService iss = new StudentService();
    public void showmenu(){
        System.out.println("------欢迎------");
        System.out.println("1.查询");
        System.out.println("2.修改");
        System.out.println("3.添加");
        System.out.println("4.删除");
        System.out.println("5.退出");
        System.out.println("---------------");
    }
    /*
    * 接收菜单的编号输入
    * */
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入编号(1--5):");
        int i = sc.nextInt();
        if (i==1){
            queryPrint();
        }else if (i==2){
            update(sc);
        }else if (i==3){
            add(sc);
        }else if (i==4){
            del(sc);
        }else if (i==5){
            System.exit(0);
        }else {
            System.out.println("输入有误，请重新输入！");
        }
    }
    /*
    * 查询方式
    * */
    public void queryPrint(){
        System.out.println("-----------------");
        System.out.println("1、查询全部学生信息");
        System.out.println("2、按学号查询学生信息");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入编号(1--2):");
        int i = sc.nextInt();
        if (i==1){
            query();
        }else if (i==2){
            queryOne(sc);
        }else {
            System.out.println("输入有误，请重新输入！");
        }
    }
    /*
    * 查询全部学生信息
    * */
    public void query(){
        //在此调用服务层提供的方法访问数据库
        List<Student> list = iss.query();
        for (Student student : list){
            System.out.println(student);
        }
    }
    /*
    * 添加学生信息
    * */
    public void add(Scanner scanner){
        System.out.print("请输入要添加的学号：");
        String Sno = scanner.next();
        System.out.print("请输入要添加的姓名：");
        String Sname = scanner.next();
        System.out.print("请输入要添加的性别：");
        String Ssex = scanner.next();
        System.out.print("请输入要添加的年龄：");
        int Sage =scanner.nextInt();
        System.out.print("请输入要添加的班级：");
        String Clno = scanner.next();
        Student stu = new Student(Sno,Sname,Ssex,Sage,Clno);
        //调用服务层，添加该数据
        iss.add(stu);
        query();
    }
    /*
    * 修改学生信息
    * */
    public void update(Scanner scanner){
        System.out.print("请输入要修改的学号：");
        String Sno = scanner.next();
        System.out.print("请输入要修改的姓名：");
        String Sname = scanner.next();
        System.out.print("请输入要修改的性别：");
        String Ssex = scanner.next();
        System.out.print("请输入要修改的年龄：");
        int Sage =scanner.nextInt();
        System.out.print("请输入要修改的班级：");
        String Clno = scanner.next();
        Student stu = new Student(Sno,Sname,Ssex,Sage,Clno);
        //调用服务层，删除该数据
        iss.update(stu);
        query();
    }
    /*
    * 删除信息
    * */
    public void del(Scanner scanner){
        System.out.print("请输入你要删除的学号：");
        String sno = scanner.next();
        iss.del(sno);
        query();
    }
    /*
    * 按学号查询学生信息
    * */
    public void queryOne(Scanner scanner){
        System.out.print("请输入你要查询的学号：");
        String sno = scanner.next();
        iss.queryOne(sno);
    }
}

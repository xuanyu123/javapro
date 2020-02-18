package com.neuedu.jdbc.demo;

import com.neuedu.jdbc.domain.Emp;
import com.neuedu.jdbc.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xuanyu
 * @date 2020-02-17 11:56 下午
 */
public class JDBCDemo05 {
    public static void main(String[] args) {
        List<Emp> list = new JDBCDemo05().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }

    public List<Emp> findAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取数据库连接对象
            conn = DriverManager.getConnection(
                    "jdbc:mysql://47.95.227.217/db2?useSSL=false",
                    "root",
                    "root"
            );
            //3、定义sql语句
            String sql = "select * from emp";
            //4、获取执行SQL的对象
            stmt = conn.createStatement();
            //5、执行SQL语句
            rs = stmt.executeQuery(sql);
            //6、处理结果,封装对象，装在集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (rs.next()){
                 int empno = rs.getInt("empno");
                 String ename = rs.getString("ename");
                 String job = rs.getString("job");
                 int mgr = rs.getInt("mgr");
                 Date hiredate = rs.getDate("hiredate");
                 int sal = rs.getInt("sal");
                 int comm = rs.getInt("comm");
                 int deptno = rs.getInt("deptno");

                 //创建emp对象，并赋值
                emp = new Emp();
                emp.setEmpno(empno);
                emp.setEname(ename);
                emp.setJob(job);
                emp.setMgr(mgr);
                emp.setHiredate(hiredate);
                emp.setSal(sal);
                emp.setComm(comm);
                emp.setDeptno(deptno);
                //装载集合
                list.add(emp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    public List<Emp> findAll2(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            conn = JDBCUtils.getConnection();
            //3、定义sql语句
            String sql = "select * from emp";
            //4、获取执行SQL的对象
            stmt = conn.createStatement();
            //5、执行SQL语句
            rs = stmt.executeQuery(sql);
            //6、处理结果,封装对象，装在集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (rs.next()){
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");

                //创建emp对象，并赋值
                emp = new Emp();
                emp.setEmpno(empno);
                emp.setEname(ename);
                emp.setJob(job);
                emp.setMgr(mgr);
                emp.setHiredate(hiredate);
                emp.setSal(sal);
                emp.setComm(comm);
                emp.setDeptno(deptno);
                //装载集合
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return list;
    }
}

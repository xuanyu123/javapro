package com.neuedu.jdbc.demo;

import com.neuedu.jdbc.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-18 9:48 上午
 * 从键盘输入用户名、密码
 * 判断是否登录成功
 */
public class JDBCDemo06 {
    public static void main(String[] args) {
        //键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = sc.nextLine();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        //调用方法
        boolean flag = new JDBCDemo06().login2(username,password);
        //判断
        if (flag){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误！");
        }
    }
    /*
    * 登录方法
    * */
    public boolean login(String username,String password){
        if (username==null&&password==null){
            return false;
        }
        //连接数据库判断登录是否成功
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //定义SQL语句
            String sql =  "select * from user where username='"+username+"' and password='"+password+"'";
            //获取执行sql的对象
            stmt = conn.createStatement();
            //执行查询
            rs = stmt.executeQuery(sql);
            //处理结果
            return rs.next();//如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }


        return false;
    }
    /*
     * 登录方法
     * */
    public boolean login2(String username,String password){
        if (username==null&&password==null){
            return false;
        }
        //连接数据库判断登录是否成功
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //定义SQL语句
            String sql =  "select * from user where username=? and password=?";
            //获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //执行查询，不需要传递sql
            rs = pstmt.executeQuery();
            //处理结果
            return rs.next();//如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }
        return false;
    }
}

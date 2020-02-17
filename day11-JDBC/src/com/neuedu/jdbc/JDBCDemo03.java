package com.neuedu.jdbc;

import java.sql.*;

/**
 * @author xuanyu
 * @date 2020-02-17 9:39 下午
 */
public class JDBCDemo03 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://47.95.227.217/db1?useSSL=false",
                    "root",
                    "root"
            );
            String sql = "select * from Student";
            stmt = conn.createStatement();
            rs =  stmt.executeQuery(sql);
            //处理结果
            //让游标向下移动一行
            rs.next();
            //获取数据
            int id = rs.getInt(1);
            String name = rs.getString("Sname");
            int age = rs.getInt(4);

            System.out.println(id+"---->"+name+"----->"+age);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs!=null){
                try {
                    stmt.close();
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

    }
}

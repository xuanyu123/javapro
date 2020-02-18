package com.neuedu.jdbc.demo;

import com.neuedu.jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xuanyu
 * @date 2020-02-18 11:00 上午
 * 银行转账  JDBC控制事务
 */
public class JDBCDemo07 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            //定义sql语句
            String sql1 = "update account set money=money-? where id=?";
            String sql2 = "update account set money=money+? where id=?";
            //获取执行sql语句的对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            //设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);

            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);
            //执行sql语句
            pstmt1.executeUpdate();
            //手动添加异常
            int a = 3/0;
            pstmt2.executeUpdate();
            //提交事务
            conn.commit();

        } catch (Exception e) {
            try {
                //事务回滚
                if (conn!=null)
                    conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,conn);
            JDBCUtils.close(pstmt2,null);
        }
    }
}

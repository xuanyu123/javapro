package com.neuedu.Druid;

import com.neuedu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xuanyu
 * @date 2020-02-18 6:39 下午
 */
public class DruidDemo02 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //定义sql语句
            String sql = "insert into account(id,user,money) values(null,?,?)";
            //获取连接对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,"wuxingyu");
            pstmt.setDouble(2,2500);
            //执行sql语句
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
    }
}

package com.neuedu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author xuanyu
 * @date 2020-02-17 9:26 下午
 */
public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
        //1、导入jar包
        //2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3、获取数据库连接对象
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://47.95.227.217/db1?useSSL=false",
                "root",
                "root"
        );
        //4、定义SQL语句
        String sql = "update Student set Sname='过儿' where Sno=6";
        //5、获取执行SQL语句的对象  Statement
        Statement stmt = conn.createStatement();
        //6、执行SQL语句
        int count = stmt.executeUpdate(sql);
        //7、处理结果
        System.out.println(count);
        //8、释放资源
        stmt.close();
        conn.close();
    }
}

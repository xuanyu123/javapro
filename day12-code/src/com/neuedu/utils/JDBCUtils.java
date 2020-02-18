package com.neuedu.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author xuanyu
 * @date 2020-02-18 4:28 下午
 * Druid 连接池的工具类
 */
public class JDBCUtils {
    private static DataSource ds;
    static {
        try {
            //1.加载配置文件
            Properties pro = new Properties();
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            //2、获取数据库连接池对象
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //2.获取连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    /*
    * 释放资源
    * */
    public static void close(Statement stmt, Connection conn){
        close(null,stmt,conn);
    }
    public static void close(ResultSet rs,Statement stmt, Connection conn){
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
    /*
    * 获取连接池方法
    * */
    public static DataSource getDatasource(){
        return ds;
    }
}

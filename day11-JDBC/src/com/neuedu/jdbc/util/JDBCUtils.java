package com.neuedu.jdbc.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @author xuanyu
 * @date 2020-02-18 12:20 上午
 * JDBC工具类
 */
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    /*
    * 文件的读取只需要读取一次，即可拿到这些值。使用静态代码块
    * */
    static{
        //读取资源文件，获取值
        try {
            //1、创建properties集合类
            Properties pro = new Properties();
            //获取src路径下的文件的方式---->ClassLoader  类加载器
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL resource = classLoader.getResource("jdbc.properties");
            String path = resource.getPath();
            //System.out.println(path);

            //2、加载文件
//            pro.load(new FileReader("src/com/neuedu/jdbc/jdbc.properties"));
            pro.load(new FileReader(path));
            //3、获取数据、赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            //4、注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
    * 获取数据库连接
    * @return 连接对象
    * */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
    /*
    * 释放资源
    * @param stmt
    * @param conn
    * */
    public static void close(Statement stmt,Connection conn){
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
     * 释放资源
     * @param rs
     * @param stmt
     * @param conn
     * */
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
}

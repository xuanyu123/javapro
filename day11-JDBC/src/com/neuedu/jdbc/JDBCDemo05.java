package com.neuedu.jdbc;

/**
 * @author xuanyu
 * @date 2020-02-17 11:56 下午
 */
public class JDBCDemo05 {
    public static void main(String[] args) {
        try {
            //1注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

package com.neuedu.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author xuanyu
 * @date 2020-02-18 1:30 下午
 */
public class C3P0Demo02 {
    public static void main(String[] args) throws SQLException {
        //1、获取datasource
        DataSource ds = new ComboPooledDataSource();
        //2、获取连接
        for (int i = 1; i <=10 ; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);
        }
    }
}

package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author xuanyu
 * @date 2020-02-18 11:04 下午
 */
public class JDBCUtils {
    private static DataSource ds;
    static{
        try {
            //1、加载配置文件
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
    /*
    * 获取连接对象
    * */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    /*
    * 释放资源
    * */
    public static void close(Statement stmt,Connection conn){
        close(null,stmt,conn);
    }

    public static void close(ResultSet rs,Statement stmt,Connection conn){
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

    /*
    * 封装通用增删改
    * */
    public static int executeUpdate(String sql,Object... params){
        int count = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            if (params!=null){
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i+1,params[i]);
                }
            }
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt,conn);
        }
        return count;
    }
    /*
    * 封装通用查询1
    * */
    public static <T> List<T> executeQuery(String sql,Class<T> cls,Object... params){
        List<T> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            if (params!=null){
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()){
                //该方法是通过反射调用无参构造来创建对象
                T t = cls.newInstance();
                //通过字段名，从rs中取值然后赋值给对象的属性
                //在不知道该类有多少个属性的情况下，有多少个属性就set多少个属性
                //我们必须先获取有多少个属性
                Field[] fields = cls.getDeclaredFields();
                for (Field f : fields){
                    //属性名刚好和数据库字段名一样
                    //我们就可以把属性名当做数据库里的字段名用rs.gteObject(属性名)
                    Object value = rs.getObject(f.getName());
                    //取出值之后，我们就可以为属性赋值了
                    /*
                    * 我们用Field调用set 方法 ，可以进行赋值
                    * 第一个参数   传一个对象，表示为哪个对象的该属性赋值
                    * 第二个参数   传一个值   表示赋什么样的值
                    * 注意：如果该属性是private，那么在赋值前必须先打开权限
                    * */
                    f.setAccessible(true);
                    f.set(t,value);
                }
                list.add(t) ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close(rs,pstmt,conn);
        }
        return list;
    }
    /*
    * 封装查询2
    * */
    public static <T> List<T> executeQuery(String sql,RowMap<T> rowMap,Object... params){
        List<T> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            if (params!=null){
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()){
                T t = rowMap.rowMapping(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(rs,pstmt,conn);
        }
        return list;
    }
}

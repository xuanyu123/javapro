package dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import model.Student;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xuanyu
 * @date 2020-02-18 11:27 下午
 */
public class StudentDao implements InterfaceStudentDao{
    @Override
    public List<Student> query() {
        List<Student> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //定义SQL语句
            String sql = "select Sno,Sname,Ssex,Sage,Clno from Student";
            //获取执行sql语句的对象
            pstmt = conn.prepareStatement(sql);
            //执行sql
            rs = pstmt.executeQuery();
            while (rs.next()){
                Student stu = new Student();
                stu.setSno(rs.getString("Sno"));
                stu.setSname(rs.getString("Sname"));
                stu.setSsex(rs.getNString("Ssex"));
                stu.setSage(rs.getInt("Sage"));
                stu.setClno(rs.getString("Clno"));

                list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }
        return list;
    }

    @Override
    public int add(Student student) {
        int count = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //定义sql语句
            String sql = "insert into Student(Sno,Sname,Ssex,Sage,Clno) values(?,?,?,?,?)";
            //获取执行SQL的对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,student.getSno());
            pstmt.setString(2,student.getSname());
            pstmt.setString(3,student.getSsex());
            pstmt.setInt(4,student.getSage());
            pstmt.setString(5,student.getClno());
            //执行SQL语句
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
        return count;
    }

    @Override
    public int update(Student student) {
        int count = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //定义SQL语句
            String sql = "update Student set Sname=?,Ssex=?,Sage=?,Clno=? where Sno=?";
            //获取执行SQL的对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(5,student.getSno());
            pstmt.setString(1,student.getSname());
            pstmt.setString(2,student.getSsex());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getClno());
            //执行SQL语句
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
        return count;
    }

    @Override
    public int del(int id) {
        return 0;
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}

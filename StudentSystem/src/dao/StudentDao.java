package dao;

import model.Student;
import utils.JDBCUtils;
import utils.RowMap;

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
    /*@Override
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
                stu.setSsex(rs.getString("Ssex"));
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
    }*/


    @Override
    public List<Student> query() {
        String sql = "select Sno,Sname,Ssex,Sage,Clno from Student";
        List<Student> list = JDBCUtils.executeQuery(sql, new RowMap<Student>() {
            @Override
            public Student rowMapping(ResultSet rs) {
                Student student = new Student();
                try {
                    student.setSno(rs.getString("Sno"));
                    student.setSname(rs.getString("Sname"));
                    student.setSsex(rs.getString("Ssex"));
                    student.setSage(rs.getInt("Sage"));
                    student.setClno(rs.getString("Clno"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return student;
            }
        });
        return list;
    }
    /*    @Override
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
        }*/
    @Override
    public int add(Student student) {
        String sql = "insert into Student(Sno,Sname,Ssex,Sage,Clno) values(?,?,?,?,?)";
        int count = JDBCUtils.executeUpdate(sql,student.getSno(),student.getSname(),student.getSsex(),student.getSage(),student.getClno());
        return count;
    }
    /*@Override
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
    }*/

    @Override
    public int update(Student student) {
        String sql = "update Student set Sname=?,Ssex=?,Sage=?,Clno=? where Sno=?";
        int count = JDBCUtils.executeUpdate(sql,student.getSname(),student.getSsex(),student.getSage(),student.getClno(),student.getSno());
        return count;
    }

/*    @Override
    public int del(String sno) {
        int count = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "delete from Student where Sno=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,sno);
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
        return count;
    }*/

    @Override
    public int del(String sno) {
        String sql = "delete from Student where Sno=?";
        int count = JDBCUtils.executeUpdate(sql,sno);
        return count;
    }

    @Override
    public void queryOne(String sno) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //获取连接
            conn = JDBCUtils.getConnection();
            //定义SQL语句
            String sql = "select Sno,Sname,Ssex,Sage,Clno from Student where Sno=?";
            //获取执行sql语句的对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,sno);
            //执行sql
            rs = pstmt.executeQuery();
            while (rs.next()){
                String Sno = rs.getString("Sno");
                String Sname = rs.getString("Sname");
                String Ssex = rs.getString("Ssex");
                int Sage = rs.getInt("Sage");
                String Clno = rs.getString("Clno");
                System.out.println("Sno："+Sno+"，Sname："+Sname+"，Ssex："+Ssex+"，Sage："+Sage+"，Clno："+Clno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }
    }

}

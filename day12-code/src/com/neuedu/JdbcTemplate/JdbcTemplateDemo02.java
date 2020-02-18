package com.neuedu.JdbcTemplate;

import com.neuedu.domain.Emp;
import com.neuedu.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.xml.transform.Source;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author xuanyu
 * @date 2020-02-18 8:04 下午
 */
public class JdbcTemplateDemo02 {
    //Junit单元测试，可以让方法单独执行
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

    /*
    * 修改1号数据的sal为9988
    * */
    @Test
    public void test1(){
        String sql = "update emp set sal=8899 where empno=?";
        int count = template.update(sql,7369);
        System.out.println(count);
    }
    /*
     * 添加一条记录
     * */
    @Test
    public void test2(){
        String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
        int count = template.update(sql,8001,"有钱","大佬",7782,"1989-02-23",9300,1000,20);
        System.out.println(count);
    }
    /*
    * 删除一条记录
    * */
    @Test
    public void test3(){
        String sql = "delete from emp where empno=?";
        int count = template.update(sql,8001);
        System.out.println(count);
    }
    /*
    * 查询empno为7934的记录，并封装为Map集合
    * */
    @Test
    public void  test4(){
        String sql = "select * from emp where empno=?";
        Map<String,Object> map = template.queryForMap(sql,7934);
        System.out.println(map);
    }
    /*
     * 查询所有记录，并封装为List集合
     * */
    @Test
    public void  test5(){
        String sql = "select * from emp";
        List<Map<String,Object>> list = template.queryForList(sql);
        for (Map<String,Object> stringObjectMap:list){
            System.out.println(stringObjectMap);
        }
    }
    @Test
    public void  test6(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");

                //创建emp对象，并赋值
                emp = new Emp();
                emp.setEmpno(empno);
                emp.setEname(ename);
                emp.setJob(job);
                emp.setMgr(mgr);
                emp.setHiredate(hiredate);
                emp.setSal(sal);
                emp.setComm(comm);
                emp.setDeptno(deptno);

                return emp;
            }
        });
        for (Emp emp:list){
            System.out.println(emp);
        }
    }
    @Test
    public void  test7() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp:list){
            System.out.println(emp);
        }
    }
    /*
    *
    * 查询总记录数
    * */
    @Test
    public void test8(){
        String sql = "select count(1) from emp";
        Long total = template.queryForObject(sql,Long.class);
        System.out.println(total);
    }
}

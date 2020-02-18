package com.neuedu.JdbcTemplate;

import com.neuedu.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author xuanyu
 * @date 2020-02-18 7:27 下午
 * JDBCTemplate 入门
 */
public class JdbcTemplateDemo01 {
    public static void main(String[] args) {
        //导入jar包
        //创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());
        //调用方法
        String sql = "update account set money=5000 where id=?";
        int count = template.update(sql,3);
        System.out.println(count);
    }
}

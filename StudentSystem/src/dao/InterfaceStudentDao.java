package dao;

import model.Student;

import java.util.List;

/**
 * @author xuanyu
 * @date 2020-02-19 12:23 上午
 */
public interface InterfaceStudentDao {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(String sno);
    void queryOne(String sno);
}

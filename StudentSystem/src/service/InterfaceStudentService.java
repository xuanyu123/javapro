package service;

import model.Student;

import java.util.List;

/**
 * @author xuanyu
 * @date 2020-02-19 12:09 上午
 */
public interface InterfaceStudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(String sno);
    void queryOne(String sno);

}

package service;

import dao.InterfaceStudentDao;
import dao.StudentDao;
import model.Student;

import java.util.List;

/**
 * @author xuanyu
 * @date 2020-02-18 11:51 下午
 */
public class StudentService implements InterfaceStudentService{
    InterfaceStudentDao isd = new StudentDao();
    @Override
    public List<Student> query() {
        return isd.query();
    }

    @Override
    public int add(Student student) {
        return isd.add(student);
    }

    @Override
    public int update(Student student) {
        return isd.update(student);
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

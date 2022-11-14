package org.jasmine.service;

import org.jasmine.entity.Student;
import org.jasmine.persistence.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service("service")
public class StudentServiceImpl implements StudentService {
    private StudentDao dao;

    public StudentServiceImpl(@Autowired StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Collection<Student> getAllStudent() {
        return dao.fetchAllStudent();
    }

    @Override
    public boolean createStudent(Student student) {
       Student newStudent = dao.addStudent(student);
       if(newStudent != null) {
           return false;

       }
       dao.addStudent(student);
       return true;

    }
}

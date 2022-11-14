package org.jasmine.service;

import org.jasmine.entity.Student;

import java.util.Collection;

public interface StudentService {

    Collection<Student> getAllStudent();

    boolean createStudent(Student student);
}

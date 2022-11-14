package org.jasmine.persistence;

import org.jasmine.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> fetchAllStudent();

    Student addStudent(Student student);
}

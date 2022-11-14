package jasmine.xmlannotationwithcomponent.service;

import jasmine.xmlannotationwithcomponent.entity.Student;

import java.util.Collection;

public interface StudentService {

    Collection<Student> getAllStudent();

    boolean createStudent(Student student);
}

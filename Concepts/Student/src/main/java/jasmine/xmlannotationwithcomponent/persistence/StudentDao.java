package jasmine.xmlannotationwithcomponent.persistence;

import jasmine.xmlannotationwithcomponent.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> fetchAllStudent();

    Student addStudent(Student student);
}

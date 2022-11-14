package jasmine.xmlannotationwithcomponent.persistence;

import jasmine.xmlannotationwithcomponent.database.StudentDatabase;
import jasmine.xmlannotationwithcomponent.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository("dao")
public class StudentDaoImpl implements StudentDao {
    @Override
    public Collection<Student> fetchAllStudent() {
        return StudentDatabase.getStudentList().values();
    }

    @Override
    public Student addStudent(Student student) {
        return StudentDatabase.getStudentList().put(student.getRollNo(), student);
    }
}

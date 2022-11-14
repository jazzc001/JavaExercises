package jasmine.xmlannotationwithcomponent.service;

import jasmine.xmlannotationwithcomponent.entity.Student;
import jasmine.xmlannotationwithcomponent.persistence.StudentDao;
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

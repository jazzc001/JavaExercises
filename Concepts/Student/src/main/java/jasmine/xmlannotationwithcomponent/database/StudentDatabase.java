package jasmine.xmlannotationwithcomponent.database;

import jasmine.xmlannotationwithcomponent.entity.Student;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentDatabase {

    public static Map<Integer, Student> studentList = new LinkedHashMap<Integer, Student>();

    static {
        studentList.put(101, new Student(101, "Jasmine", "E"));
        studentList.put(102, new Student(102, "Carol", "F"));
        studentList.put(103, new Student(103, "Kola", "A"));

    }

    public static Map<Integer, Student> getStudentList() {
        return studentList;
    }

}

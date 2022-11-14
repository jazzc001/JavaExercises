package jasmine.xmlannotationwithcomponent.presentation;

import jasmine.xmlannotationwithcomponent.entity.Student;
import jasmine.xmlannotationwithcomponent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Scanner;

@Component("stdPresentation")
public class StudentPresentationImpl implements StudentPresentation {
    private StudentService service;
    @Autowired

    public void setService(StudentService service) {
        this.service = service;
    }

    @Override
    public void showMenu() {
        System.out.println("===========================");
        System.out.println("Student Management System");
        System.out.println("1. List All Student");
        System.out.println("2. Add New Book");
        System.out.println("3. Exit");
        System.out.println("============================");
    }

    @Override
    public void performMenu(int choice) {
        Scanner scanner = new Scanner(System.in);
        switch(choice) {
            case 1:
                Collection<Student> students = service.getAllStudent();
                for(Student element: students) {
                    System.out.println(element);
                }
                break;
            case 2:
                Student student = new Student();
                System.out.println("Create a new student record");
                System.out.println("===========================");
                System.out.println("Enter student roll no:");
                student.setRollNo(scanner.nextInt());
                System.out.println("Enter student name:");
                student.setName(scanner.next());
                System.out.println("Enter student grade:");
                student.setGrade(scanner.next());

                if (service.createStudent(student)) {
                    System.out.println("A new student record has been created");
                } else {
                    System.out.println("Student roll number" +student.getRollNo() + "already exist, cannot create this student");
                }
                break;
            case 3:System.out.println("Thanks for using Student Management System");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice");
                break;

        }

    }
}

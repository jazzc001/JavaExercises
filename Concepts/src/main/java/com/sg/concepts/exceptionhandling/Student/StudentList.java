package com.sg.concepts.exceptionhandling.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jasminecheung
 */
public class StudentList {

    private Student[]  studentList;
    private int totalStudents;

    public StudentList(int totalStudents) {
        super();
        this.totalStudents = totalStudents;
        studentList = new Student[totalStudents];

    }

    public void inputStudent(Student student, int index) throws RepeatedRollNoHandling {
        for (int i = 0; i < index; i++) {
            if (studentList[i].getRollNo() == student.getRollNo()) {
            
                throw new RepeatedRollNoHandling("Duplicate rollno entered.");
            }
        }
        studentList[index] = student;
    }

    public void displayStudents() {
        for (Student student : studentList) {
            student.display();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.exceptionhandling.Student;

import java.util.Scanner;

/**
 *
 * @author jasminecheung
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter total number of sudents");
        int total = sc.nextInt();
        StudentList list = new StudentList(total);

//        for (int i = 0; i < total; i++) {
//            Student student = new Student();
//            System.out.println("Enter Roll number");
//            student.setName(sc.next());
//            System.out.println("Enter Name");
//            student.setName(sc.next());
//            System.out.println("Enter Age");
//            student.setAge(sc.nextInt());
//            System.out.println("Enter Marks");
//            student.setMarks(sc.nextByte());
//            
//        }
//        list.inputStudent(student, total);
    }

}

package com.sg.concepts.exceptionhandling.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jasminecheung
 */
public class Student {

    private int rollNo;
    private String name;
    private int age;
    private int marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age < 4) {
            throw new AgeException("You are too young to register this school.");
        } else if (age > 18) {
            throw new AgeException("You are too old to register this school.");
        }

        this.age = age;
    }

    public int getMarks() {

        return marks;
    }

    public void setMarks(int marks) throws InvalidMarkException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("This mark is not valid.");
        }
        this.marks = marks;
    }
    
    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : "+ name);
        System.out.println("Age : " + age);
        System.out.println("Mark : "+ marks);
    }

}

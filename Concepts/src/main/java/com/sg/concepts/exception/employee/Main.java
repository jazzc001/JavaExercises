/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.exception.employee;

import java.util.Scanner;

/**
 *
 * @author jasminecheung
 */
public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter total no of persons");
        int total = userInput.nextInt();

        EmployeeList list = new EmployeeList(total);
        try {
            for (int i = 0; i < total; i++) {
                //create a new employee object
                Employee employee = new Employee();
                System.out.println("Enter " + (i + 1) + " of person's details");
                System.out.println("Enter name of persons");
                String name = userInput.next();
                employee.setName(name);
                System.out.println("Enter age no of persons");
                int age = userInput.nextInt();

                employee.setAge(age);
                list.inputEmployee(employee, i);
            }
        } catch (AgeException | NameException e) {
            System.out.println(e);
        }

        System.out.println("=================");
        list.displayList();

    }
}
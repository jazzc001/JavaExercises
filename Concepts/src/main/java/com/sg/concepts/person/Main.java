/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.person;

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
        
        ListOfPerson list = new ListOfPerson(total);
        
        for (int i = 0; i < total; i++) {
            Person person = new Person();
            
            System.out.println("Enter " + (i + 1) + " person ID");
            person.setPersonId(userInput.next());
            System.out.println("Enter " + (i + 1) + " person age");
            person.setAge(userInput.nextInt());
            System.out.println("Enter " + (i + 1) + " person name");
            person.setPersonName(userInput.next());
            list.inputPerson(person, i);
        }
        System.out.println("=================");
        list.displayList();
    }
}

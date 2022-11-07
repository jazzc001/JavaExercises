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
public class ListOfPerson {

    private Person[] persons;
    private int totalNoOfPersons;

    public ListOfPerson(int totalNoOfPersons) {

        this.totalNoOfPersons = totalNoOfPersons;
        persons = new Person[totalNoOfPersons];
    }
    
    public void inputPerson(Person person, int index){
        persons[index] = person;
    }
    
    public void displayList() {
        for(int i = 0; i<totalNoOfPersons; i++ ) {
            System.out.println(persons[i].getPersonId()+" " + 
                    persons[i].getPersonName()+" "+
                    persons[i].getAge());
        }
        
    }
    

}

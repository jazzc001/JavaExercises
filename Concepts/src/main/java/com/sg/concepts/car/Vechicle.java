/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.car;

/**
 *Create a class called Vehicle. In the Vehicle class constructor initialize few variables like color, no of
wheels, model etc.
Create subclasses like Car.
Add common methods in the base class and specific methods in the corresponding class.
Create a class called Road and create objects for the Car and display the appropriate message.
 * @author jasminecheung
 */
public class Vechicle {
    protected String colo;
    protected int wheels;
    protected String model;

    public Vechicle(String colo, int wheels, String model) {
        this.colo = colo;
        this.wheels = wheels;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vechicle{" + "colo=" + colo + ", wheels=" + wheels + ", model=" + model + '}';
    }
    
    
    
}

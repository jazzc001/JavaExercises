/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.car;

/**
 *
 * @author jasminecheung
 */
public class Road {Car car1 = new Car("red", 4, "110");
    Car car2 = new Car("green", 2, "110");
    Car car3 = new Car("black", 1, "100");

    @Override
    public String toString() {
        return "Road{" + "car1=" + car1.toString() + ", car2=" + car2.toString() + ", car3=" + car3.toString() + '}';
    }
    public static void main(String[] args) {
        
    }
    

    
    
    
}

package com.sg.concepts.inchesfeetsconvertor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jasminecheung
 */
public class InchesFeetsConvertor {

    private int feet;
    private int inches;

    public InchesFeetsConvertor(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }


    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
    
    
    
    

    public int toInches() {
        return feet * 12 + inches;
    }

    @Override
    public String toString() {
        return String.format("%s'%s\"" , feet,inches);
    }
    
    

}

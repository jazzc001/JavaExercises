/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.height;

/**
 *
 * @author jasminecheung
 */
public class Height {
    private int inches;
    private int feet;

    public Height(int feet, int inches) {
        this.inches = inches;
        this.feet = feet;
    }


    public void setInches(int inches) {
        this.inches = inches;
    }

    public void setFeets(int feet) {
        this.feet = feet;
    }
    
    private int toinches() {
        return feet*12 + inches;
    }
    
    
    public static String sumHeight(Height height1, Height height2) {
        int total = height1.toinches() + height2.toinches();
        
        int feet = total/12;
        
        int inches = total%12;
        
        
        return String.format("%s'%s", feet, inches);
    }

    
    
    
        
    
    
    
    
    
    
}

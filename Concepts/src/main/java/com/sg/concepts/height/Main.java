/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.height;

/**
 *
 * @author jasminecheung
 */
public class Main {
    public static void main(String[] args) {
        Height height1 = new Height(12, 3);
        Height height2 = new Height(13, 4);
        
        String result = Height.sumHeight(height1, height2);
        System.out.println("Total height is :"+result);
    }
    
    
}

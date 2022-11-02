/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.inchesfeetsconvertor;

/**
 *
 * @author jasminecheung
 */
public class Main {
    public static void main(String[] args) {
        InchesFeetsConvertor height1, height2;
        
        height1 = new InchesFeetsConvertor(20, 30);
        height2 = new InchesFeetsConvertor(30,40);
        int inches1 = height1.toInches();
        int inches2 = height1.toInches();
        
        
        System.out.println(" First height is " + height1.toString() + " or " + inches1 + " inches.");
        System.out.println("Second Height is " + height2.toString() + " or " + inches1 + " inches.");
    }
}

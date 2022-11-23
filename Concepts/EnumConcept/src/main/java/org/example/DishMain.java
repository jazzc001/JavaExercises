package org.example;

public class DishMain {
    public static void main(String[] args) {
        Dish dinner = Dish.PHATHAI;

        dinner.isHighCal();
        Dish.PHATHAI.isHighCal();

    }
}

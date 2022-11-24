package org.example;

public enum Dish {

    PIZZA(1500, true, 25){


        @Override
        public void buyFood() {

        }
    },
    RAMEN(800, true, 12){
        @Override
        public void buyFood() {

        }
    },
    POKEBOWL(500, false, 15){
        @Override
        public void buyFood() {

        }
    },
    PHATHAI(750, false, 14){
        @Override
        public void buyFood() {

        }
    },
    CURRY(1900, true, 15){
        @Override
        public void buyFood() {

        }
    };

    private int calories;
    private boolean isVeg;
    private double price;

    public int getCalories() {
        return calories;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public double getPrice() {
        return price;
    }

    private Dish(int calories, boolean isVeg, double price) {
        this.calories = calories;
        this.isVeg = isVeg;
        this.price = price;
    }


    public boolean isHighCal(){
        return getCalories()>600;
    };
    public abstract void buyFood();
}

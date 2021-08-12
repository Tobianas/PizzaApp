package com.example.pizzaapp;

public class PizzaClass {

    private boolean redSauce,cheeseSauce,cheese, ham, mushroom;
    private int price;

    public PizzaClass(boolean redSauce, boolean cheeseSauce, boolean cheese, boolean ham, boolean mushroom,int price) {
        this.redSauce = redSauce;
        this.cheeseSauce = cheeseSauce;
        this.cheese = cheese;
        this.ham = ham;
        this.mushroom = mushroom;
        this.price = price;


    }

    @Override
    public String toString() {
        return "PizzaClass{" +
                "redSauce=" + redSauce +
                ", cheeseSauce=" + cheeseSauce +
                ", cheese=" + cheese +
                ", ham=" + ham +
                ", mushroom=" + mushroom +
                ", price=" + price + "€" +
                '}';
    }
}

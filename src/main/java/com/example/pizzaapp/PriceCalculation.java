package com.example.pizzaapp;

public class PriceCalculation {

    public static int priceCalc(boolean cheese,boolean ham,boolean mushroom)
    {
        int price =2;
        if(cheese)price+=2;
        if(ham)price+=2;
        if(mushroom)price+=2;

        return price;
    }

}

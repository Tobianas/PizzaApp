package com.example.pizzaapp;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class PizzaClass {

    private boolean redSauce, cheeseSauce, cheese, ham, mushroom;
    private int price;

    public PizzaClass(boolean redSauce, boolean cheeseSauce, boolean cheese, boolean ham, boolean mushroom, int price) {

        try {
            Connection con = DBConnection.getConnection();
            this.redSauce = redSauce;
            this.cheeseSauce = cheeseSauce;
            this.cheese = cheese;
            this.ham = ham;
            this.mushroom = mushroom;
            this.price = price;
            PreparedStatement posted = con.prepareStatement("INSERT INTO pizzas" +
                    "                                      (redSauce,cheeseSauce,cheese,ham,mushroom,price)" +
                    "                                       VALUES ('" + redSauce + "','" + cheeseSauce + "','" + cheese + "','" + ham + "','" + mushroom + "','" + price + "')");
            posted.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Insert sucessfull");
        }


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

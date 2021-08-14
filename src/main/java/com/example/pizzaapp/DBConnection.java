package com.example.pizzaapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection()throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_pizza";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("CONNECTED");
            return conn;

        }
        catch (Exception e){System.out.println(e);}


    return null;
    }


}

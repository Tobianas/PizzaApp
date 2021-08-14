module com.example.pizzaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.pizzaapp to javafx.fxml;
    exports com.example.pizzaapp;
}
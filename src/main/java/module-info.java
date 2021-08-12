module com.example.pizzaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizzaapp to javafx.fxml;
    exports com.example.pizzaapp;
}
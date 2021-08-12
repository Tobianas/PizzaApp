package com.example.pizzaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ImageView sauceType, cheese, ham, mushrooms;
    @FXML
    private RadioButton redSauceButton, cheeseSauceButton, cheeseButton, hamButton, mushroomButton;
    @FXML
    private Text textPrice;
    private boolean redSauceBool, cheeseSauceBool, cheeseBool, hamBool, mushroomBool = false;

    public void pickSauce(ActionEvent event) {
        if (redSauceButton.isSelected()) {
            sauceType.setImage(new Image(getClass().getResourceAsStream("tomato-sauce.png")));
            redSauceBool = true;
            cheeseSauceBool = false;
        }
        if (cheeseSauceButton.isSelected()) {
            sauceType.setImage(new Image(getClass().getResourceAsStream("white-sause.png")));
            redSauceBool = false;
            cheeseSauceBool = true;
        }
    }

    public void pickExtras(ActionEvent event) {
        if (cheeseButton.isSelected()) {
            cheese.setVisible(true);
            cheese.setImage(new Image(getClass().getResourceAsStream("cheese.png")));
            cheeseBool = true;
        } else {
            cheese.setVisible(false);
            cheeseBool = false;
        }

        if (hamButton.isSelected()) {
            ham.setVisible(true);
            ham.setImage(new Image(getClass().getResourceAsStream("ham.png")));
            hamBool = true;
        } else {
            ham.setVisible(false);
            hamBool = false;
        }
        if (mushroomButton.isSelected()) {
            mushrooms.setVisible(true);
            mushrooms.setImage(new Image(getClass().getResourceAsStream("mushrooms.png")));
            mushroomBool = true;
        } else {
            mushrooms.setVisible(false);
            mushroomBool = false;
        }
        textPrice.setText("Cena : " + Integer.toString(PriceCalculation.priceCalc(cheeseBool, hamBool, mushroomBool)) + " € ");
    }

    public void order(ActionEvent event) {
        if (redSauceButton.isSelected() || cheeseSauceButton.isSelected()) {
            PizzaClass pizza = new PizzaClass(redSauceBool, cheeseSauceBool, cheeseBool, hamBool, mushroomBool, PriceCalculation.priceCalc(cheeseBool, hamBool, mushroomBool));
            System.out.println(pizza.toString());
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Základ nie je zvolený!");
            alert.setContentText("Prosím vyber aký chceš základ");
            alert.show();

        }
    }

    public void exit() {
        System.exit(0);
    }
}
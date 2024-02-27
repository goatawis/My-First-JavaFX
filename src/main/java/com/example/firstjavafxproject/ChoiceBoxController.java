package com.example.firstjavafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

// implements the 'Initializable' interface bcs in SceneBuilder there is no way to populate the choicebox with data
// and no option like 'onAction' to execute any action done on the choicebox such as choosing an item from the choicebox
public class ChoiceBoxController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoicebox;
    private final String[] food = {"Pizza", "Sushi", "Ramen", "Pasta", "Burger", "Fish n Chips"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoicebox.getItems().addAll(food);
        myChoicebox.setOnAction(this::getFood);
    }

    public void getFood(ActionEvent event) {
        String myFood = myChoicebox.getValue();
        myLabel.setText(myFood);
    }
}

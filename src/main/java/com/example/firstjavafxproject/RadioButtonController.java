package com.example.firstjavafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RadioButtonController {
    @FXML
    private Label myLabel;
    @FXML
    private RadioButton RBPizza, RBSushi, RBRamen;

    public void getFood(ActionEvent event) {
        if (RBPizza.isSelected()) {
            myLabel.setText("You want " + RBPizza.getText());
        } else if (RBSushi.isSelected()) {
            myLabel.setText("You want " + RBSushi.getText());
        } else {
            myLabel.setText("You want " + RBRamen.getText());
        }
    }
}

package com.example.firstjavafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AgeController {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button BtnSubmit;
    public void submit(ActionEvent event) throws IOException {
        try {
            int age = Integer.parseInt(myTextField.getText());
            if (age < 18) {
                myLabel.setText("Sorry!\nAge does not meet the requirement.");
            } else {
                myLabel.setText("Registration successful!");
            }
        } catch (NumberFormatException nfe) {
            myLabel.setText("Enter only numbers!");
        }
        catch (Exception e) {
            myLabel.setText(e + "error");
        }
    }
}

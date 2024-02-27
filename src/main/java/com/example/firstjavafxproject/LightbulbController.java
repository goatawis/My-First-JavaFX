package com.example.firstjavafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.Objects;

public class LightbulbController {

    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImageView;

    Image myImage1 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("On.png")));
    Image myImage2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Off.png")));

    public void change(ActionEvent event) {
        if (myCheckBox.isSelected()) {
            myLabel.setText("ON");
            System.out.println("Bulb is turned on!");
            myImageView.setImage(myImage1);
        } else {
            myLabel.setText("OFF");
            System.out.println("Bulb is turned off!");
            myImageView.setImage(myImage2);
        }
    }
}

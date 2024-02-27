package com.example.firstjavafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class ImageController {

    // ImageView is a Node used for painting images loaded with Images
    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    Image myImage = new Image(((Objects.requireNonNull(getClass().getResourceAsStream("regera.jpg")))));

    public void displayImage() {
         myImageView.setImage(myImage);
    }
}

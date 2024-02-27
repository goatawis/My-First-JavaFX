package com.example.firstjavafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle circle;
    private double x,y;

   public void up(ActionEvent e) {
       circle.setCenterY(y-=100);
   }

    public void down(ActionEvent e) {
        circle.setCenterY(y+=100);
    }

    public void left(ActionEvent e) {
       circle.setCenterX(x-=100);
    }

    public void right(ActionEvent e) {
        circle.setCenterX(x+=100);
    }

    public void getCoordinates(ActionEvent e) {
        System.out.println("Center X coordinate: " + circle.getCenterX() + "Center Y coordinate: " + circle.getCenterY());
    }
}
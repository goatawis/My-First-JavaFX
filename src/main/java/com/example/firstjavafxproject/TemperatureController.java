package com.example.firstjavafxproject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class TemperatureController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Slider mySlider;
    int temperature;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        temperature = (int) mySlider.getValue();
        myLabel.setText(Integer.toString(temperature) + "°C");
        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                temperature = (int) mySlider.getValue();
                myLabel.setText(Integer.toString(temperature) + "°C");
            }
        });
    }
}

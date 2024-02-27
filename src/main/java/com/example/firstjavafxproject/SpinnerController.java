package com.example.firstjavafxproject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

// Usages of spinner
// 1. Representing the current state of the value
// 2. Incrementing and decrementing the value, with one or more steps per call
// 3. Converting text input from the user
// 4. Converting objects to user readable strings
public class SpinnerController implements Initializable {
    @FXML
    private Spinner<Integer> mySpinner;
    @FXML
    private Label myLabel;
    int currentVal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
        valueFactory.setValue(1);

        mySpinner.setValueFactory(valueFactory);

        currentVal = mySpinner.getValue();
        myLabel.setText(Integer.toString(currentVal));

        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentVal = mySpinner.getValue();
                myLabel.setText(Integer.toString(currentVal));

                if (currentVal == 10) {
                    myLabel.setText(currentVal + " \nYou've reached the limit...");
                }
            }
        });
    }
}

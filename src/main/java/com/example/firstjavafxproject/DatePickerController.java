package com.example.firstjavafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerController {
    @FXML
    private Label myLabel;
    @FXML
    private DatePicker myDatePicker;

    public void getDate(ActionEvent event) {
        LocalDate myDate = myDatePicker.getValue();
        // if you want to change the format -> DD//MM//YYYY
        // if you want to get the name of the month, use MMM
        String formattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); // MM must always be capital bcs mm is minute
        myLabel.setText(formattedDate);
        myLabel.setTextAlignment(TextAlignment.CENTER);
    }

}

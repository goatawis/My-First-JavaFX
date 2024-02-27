package com.example.firstjavafxproject;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class AnimationController implements Initializable {
    @FXML
    private ImageView myImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // translate
        /*TranslateTransition translate = new TranslateTransition();
        translate.setNode(myImage);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(TranslateTransition.INDEFINITE); // continuous cycle
        translate.setByX(250);
        translate.setByY(-250);
        translate.setAutoReverse(true);
        translate.play();*/

        // rotate
        /*RotateTransition rotate = new RotateTransition();
        rotate.setNode(myImage);
        rotate.setDuration(Duration.millis(500));
        rotate.setCycleCount(RotateTransition.INDEFINITE); // continuous rotation
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.X_AXIS); // set axis of rotation, default is Z
        rotate.play();*/

        // fade
        /*FadeTransition fade = new FadeTransition();
        fade.setNode(myImage);
        fade.setDuration(Duration.millis(2000));
        fade.setCycleCount(RotateTransition.INDEFINITE); // continuous rotation
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();*/

        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImage);
        scale.setDuration(Duration.millis(1500));
        scale.setCycleCount(RotateTransition.INDEFINITE); // continuous rotation
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2.5);
        scale.setByY(-1.5);
        scale.setAutoReverse(true);
        scale.play();
    }
}

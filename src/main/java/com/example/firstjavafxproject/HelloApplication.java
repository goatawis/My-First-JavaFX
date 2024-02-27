package com.example.firstjavafxproject;

import javafx.application.Application;
import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Stage stage = new Stage();
        /*Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.GRAY);

        //Setting a custom icon
        Image icon = new Image("D:\\ruby.png");
        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo Program");
        //stage.setWidth(420);
        //stage.setHeight(420);
        stage.setResizable(true);
        //stage.setX(50);
        //stage.setY(50);
        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("YOU CAN'T ESCAPE UNLESS YOU PRESS Q");
        //stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("q"));

        Text text = new Text(); // Text is a type of node
        text.setText("YAPPER!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 15));
        text.setFill(Color.DARKSEAGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.INDIANRED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.CORNFLOWERBLUE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);

        // Creating a triangle
        // Since there are THREE vertices in a triangle, we need to set the COORDINATES of each of the vertices
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
                );
        triangle.setFill(Color.LIGHTGOLDENRODYELLOW);
        triangle.setStroke(Color.YELLOW);
        triangle.setStrokeWidth(3);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.DARKORANGE);
        circle.setStroke(Color.ORANGE);
        circle.setStrokeWidth(3);

        Image image = new Image("D:\\visionpro.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();*/

        // Using SceneBuilder
        /*Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Switching scenes using SceneBuilder and pass data to from a scene to another
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Creating a button that closes JavaFX
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("logoutScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        // Set an event when the 'X' button on top right corner is clicked
        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        }); */

        // Image Application
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ImageScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // TextField Application
        // Check the input received via textfield and return an output
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AgeScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example of using checkboxes
        // Using light bulb scene
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LightbulbScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example of using radio buttons
        // Food ordering app
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FoodScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example of using date picker
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DatePickerScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using color picker
        // Change pane fill using color picker
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ColorPickScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using ChoiceBox
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ChoiceBoxScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using Sliders
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SlidersScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using Progress Bar
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ProgressBarScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using Spinner
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SpinnerScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using ListView
        // Food list selection
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ListViewScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using TreeView
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TreeViewScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using MenuBar
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MenuBarScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using FlowPane container
        // and example on how to detect KeyEvents
        /*try {
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("FlowPaneScene.fxml")));
            Parent root = loader.load();
            SceneController controller = loader.getController();
            Scene scene = new Scene(root);

            scene.setOnKeyPressed(event -> {
                switch (event.getCode()) {
                    case W -> controller.moveUp();
                    case S -> controller.moveDown();
                    case A -> controller.moveLeft();
                    case D -> controller.moveRight();
                    default -> {
                        break;
                    }
                }
            });

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        // Example on adding animations
        // Using a picture of Turbo the snail
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TurboAnimationScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using MediaView
        /*Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MediaViewScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        // Example using WebView
        // Display the contents of a webpage
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WebViewScene.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before exiting?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
}
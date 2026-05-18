package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        System.out.println("Hello button clicked");

        welcomeText.setText("Loading map...");

        MainApplication.changeScene("/cs112/lab09/map-view.fxml");
    }
}
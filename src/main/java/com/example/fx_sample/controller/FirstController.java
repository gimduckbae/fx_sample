package com.example.fx_sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FirstController implements ControllerManager {

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    Button btn_first;

    @FXML
    private void showSecondScreen(ActionEvent event) {
        mainController.changeScreen("/com/example/fx_sample/second_view.fxml");
    }
}

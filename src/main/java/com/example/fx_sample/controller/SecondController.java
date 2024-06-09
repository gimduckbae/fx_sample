package com.example.fx_sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondController implements ControllerManager {

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    Button btn_second;

    @FXML
    private void showFirstScreen(ActionEvent event) {
        mainController.changeScreen("/com/example/fx_sample/first_view.fxml");
    }
}
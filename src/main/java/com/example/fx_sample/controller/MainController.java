package com.example.fx_sample.controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
public class MainController {

    @FXML
    private StackPane rootPane;

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void initialize() {
        try {
            // 초기 화면 로드
            loadScreen("/com/example/fx_sample/first_view.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadScreen(String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent screen = loader.load();
        rootPane.getChildren().clear();
        rootPane.getChildren().add(screen);

        // 현재 로드중인 스크린의 컨트롤러를 가져온다
        ControllerManager controller = loader.getController();

        // 자식 컨트롤러가 null이 아니면 main controller를 주입
        if (controller != null) {
            controller.setMainController(this);
        }
    }

    public void changeScreen(String fxmlFile) {
        try {
            loadScreen(fxmlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

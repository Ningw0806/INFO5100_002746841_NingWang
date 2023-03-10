package com.example.exercise9;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 380);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

}
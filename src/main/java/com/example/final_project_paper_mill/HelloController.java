package com.example.final_project_paper_mill;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField tf;

    @FXML
    protected void onHelloButtonClick() {
        tf.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void oa(ActionEvent actionEvent) {
    }
}

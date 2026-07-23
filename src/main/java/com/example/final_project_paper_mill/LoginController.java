package com.example.final_project_paper_mill;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController
{
    @javafx.fxml.FXML
    private ComboBox<String> roleCB;
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
        roleCB.getItems().addAll("Production Manager","Marketing Manager");
    }

    @javafx.fxml.FXML
    public void loginOa(ActionEvent actionEvent) {
    }
}
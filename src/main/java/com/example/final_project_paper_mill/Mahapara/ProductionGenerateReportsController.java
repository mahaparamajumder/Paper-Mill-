package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ProductionGenerateReportsController
{
    @javafx.fxml.FXML
    private Button signoutOA;
    @javafx.fxml.FXML
    private Button stockOA;
    @javafx.fxml.FXML
    private Button planOA;
    @javafx.fxml.FXML
    private Button machineOA;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private Label message;
    @javafx.fxml.FXML
    private Button statusOA;
    @javafx.fxml.FXML
    private Button updateOA;
    @javafx.fxml.FXML
    private Button recordOA;
    @javafx.fxml.FXML
    private Button historyOA;
    @javafx.fxml.FXML
    private Button generateOA;
    @javafx.fxml.FXML
    private ComboBox CB;

    @javafx.fxml.FXML
    public void initialize() {
        CB.getItems().addAll("Daily","Monthly");
    }

    @javafx.fxml.FXML
    public void signoutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void stockOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void planOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void statusOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void historyOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordOA(ActionEvent actionEvent) {
    }
}
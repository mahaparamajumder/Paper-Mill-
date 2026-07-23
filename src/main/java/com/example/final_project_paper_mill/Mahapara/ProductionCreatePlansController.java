package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ProductionCreatePlansController
{
    @javafx.fxml.FXML
    private Button signoutOA;
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private Button stockOA;
    @javafx.fxml.FXML
    private Button planOA;
    @javafx.fxml.FXML
    private ComboBox gradeCB;
    @javafx.fxml.FXML
    private Button machineOA;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private Button updateOA;
    @javafx.fxml.FXML
    private TextField planidTF;
    @javafx.fxml.FXML
    private Button statusOA;
    @javafx.fxml.FXML
    private Button recordOA;
    @javafx.fxml.FXML
    private Button historyOA;
    @javafx.fxml.FXML
    private Button generateOA;

    @javafx.fxml.FXML
    public void initialize() {
        gradeCB.getItems().addAll("Uncoated","gloss");
    }

    @javafx.fxml.FXML
    public void signoutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void stockOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
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
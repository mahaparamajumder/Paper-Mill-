package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ProductionCheckStatusController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private Button signoutOA;
    @javafx.fxml.FXML
    private Button stockOA;
    @javafx.fxml.FXML
    private TableColumn lineTC;
    @javafx.fxml.FXML
    private Button planOA;
    @javafx.fxml.FXML
    private TableColumn targettC;
    @javafx.fxml.FXML
    private Button machineOA;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private Button updateOA;
    @javafx.fxml.FXML
    private TableView tableOA;
    @javafx.fxml.FXML
    private ComboBox lineCB;
    @javafx.fxml.FXML
    private TableColumn quantityTC;
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
        lineCB.getItems().addAll("Line1","Line2");
    }


    @javafx.fxml.FXML
    public void signoutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void stockOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void planOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fetchOA(ActionEvent actionEvent) {
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
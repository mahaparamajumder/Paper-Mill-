package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProductionViewHistoryController
{
    @javafx.fxml.FXML
    private Button signoutOA;
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private Button stockOA;
    @javafx.fxml.FXML
    private TableView TV;
    @javafx.fxml.FXML
    private Button planOA;
    @javafx.fxml.FXML
    private Button machineOA;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TableColumn weightTC;
    @javafx.fxml.FXML
    private Button updateOA;
    @javafx.fxml.FXML
    private TableColumn numTC;
    @javafx.fxml.FXML
    private TableColumn idTC;
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

        idTC.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        numTC.setCellValueFactory(new PropertyValueFactory<>("batchNumber"));
        weightTC.setCellValueFactory(new PropertyValueFactory<>("netWeight"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
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
    public void searchOA(ActionEvent actionEvent) {
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
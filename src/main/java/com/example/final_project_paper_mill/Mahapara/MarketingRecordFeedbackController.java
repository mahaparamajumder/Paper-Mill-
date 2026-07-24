package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.control.TableView;

public class MarketingRecordFeedbackController
{
    @javafx.fxml.FXML
    private ComboBox ratingTF;
    @javafx.fxml.FXML
    private TableColumn ratingTC;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn idTC;
    @javafx.fxml.FXML
    private ComboBox idTF;
    @javafx.fxml.FXML
    private TableView TC;

    @javafx.fxml.FXML
    public void initialize() {
        idTF.getItems().addAll("101", "102");
        ratingTF.getItems().addAll("1", "2", "3", "4", "5");
        idTC.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        ratingTC.setCellValueFactory(new PropertyValueFactory<>("rating"));

    }

    @javafx.fxml.FXML
    public void signoutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createOrderOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateProductOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addCustomerOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewCustomeroA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitTF(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void chcekStockOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void customerFeedbackOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void orderStatusOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportsOA(ActionEvent actionEvent) {
    }
}
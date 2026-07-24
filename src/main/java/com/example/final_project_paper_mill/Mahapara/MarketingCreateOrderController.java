package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MarketingCreateOrderController
{
    @javafx.fxml.FXML
    private DatePicker datetF;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextField orderTF;
    @javafx.fxml.FXML
    private TextField managerTF;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private ComboBox customerCB;

    @javafx.fxml.FXML
    public void initialize() {
        customerCB.getItems().addAll("101","102");
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
    public void placeOrderOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addCustomerOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewCustomeroA(ActionEvent actionEvent) {
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
package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MarketingGenerateSalesReportController
{
    @javafx.fxml.FXML
    private Label preview;
    @javafx.fxml.FXML
    private DatePicker startDP;
    @javafx.fxml.FXML
    private DatePicker endDP;
    @javafx.fxml.FXML
    private ComboBox typeCB;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
        if (typeCB != null) {
            typeCB.getItems().addAll("Sales Summary", "Customer Growth", "Revenue Analysis");
        }
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
    public void chcekStockOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void customerFeedbackOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void orderStatusOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportsOA(ActionEvent actionEvent) {
    }
}
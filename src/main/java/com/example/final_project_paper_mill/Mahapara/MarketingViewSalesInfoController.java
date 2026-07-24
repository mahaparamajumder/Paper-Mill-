package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;

public class MarketingViewSalesInfoController
{
    @javafx.fxml.FXML
    private TableColumn orderTC;
    @javafx.fxml.FXML
    private TableView TV;
    @javafx.fxml.FXML
    private TableColumn revenueTC;
    @javafx.fxml.FXML
    private ComboBox monthCB;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private ComboBox yearCB;
    @javafx.fxml.FXML
    private TableColumn salesTC;

    @javafx.fxml.FXML
    public void initialize() {
        if (yearCB != null) yearCB.getItems().addAll("2024", "2025", "2026");
        if (monthCB != null) monthCB.getItems().addAll("January", "February", "March", "April", "May", "June");
        if (salesTC != null) salesTC.setCellValueFactory(new PropertyValueFactory<>("salesId"));
        if (orderTC != null) orderTC.setCellValueFactory(new PropertyValueFactory<>("totalOrders"));
        if (revenueTC != null) revenueTC.setCellValueFactory(new PropertyValueFactory<>("totalRevenue"));
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
package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MarketingViewOrderDetailsController implements Initializable {

    @FXML
    private TableColumn amountTC;

    @FXML
    private TableColumn dateTC;

    @FXML
    private TableColumn managerIdTC;

    @FXML
    private DatePicker orderDP;

    @FXML
    private TableColumn orderIdTC;

    @FXML
    private TableColumn custIdTC;

    @FXML
    private TableView orderTC_Table;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (orderIdTC != null) orderIdTC.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        if (custIdTC != null) custIdTC.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        if (dateTC != null) dateTC.setCellValueFactory(new PropertyValueFactory<>("orderDate"));
        if (amountTC != null) amountTC.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        if (managerIdTC != null) managerIdTC.setCellValueFactory(new PropertyValueFactory<>("managerId"));
    }

    @FXML
    public void signoutOA(ActionEvent actionEvent) { }

    @FXML
    public void createOrderOA(ActionEvent actionEvent) { }

    @FXML
    public void updateProductOA(ActionEvent actionEvent) { }

    @FXML
    public void addCustomerOA(ActionEvent actionEvent) { }

    @FXML
    public void viewCustomeroA(ActionEvent actionEvent) { }

    @FXML
    public void chcekStockOA(ActionEvent actionEvent) { }

    @FXML
    public void customerFeedbackOA(ActionEvent actionEvent) { }

    @FXML
    public void filterOA(ActionEvent actionEvent) { }

    @FXML
    public void orderStatusOA(ActionEvent actionEvent) { }

    @FXML
    public void generateReportsOA(ActionEvent actionEvent) { }
}
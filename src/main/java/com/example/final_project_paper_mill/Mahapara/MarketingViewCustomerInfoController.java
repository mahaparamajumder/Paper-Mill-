package com.example.final_project_paper_mill.Mahapara;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MarketingViewCustomerInfoController implements Initializable {

    @FXML
    private ComboBox idcB;

    @FXML
    private TableView TC;

    @FXML
    private TableColumn idTC;

    @FXML
    private TableColumn companyTC;

    @FXML
    private TableColumn contactTC;

    @FXML
    private TableColumn numTC;

    @FXML
    private TableColumn addressTC;

    @FXML
    private Label label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (idcB != null) {
            idcB.getItems().addAll("101", "102");
        }

        if (idTC != null) {
            idTC.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        }
        if (companyTC != null) {
            companyTC.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        }
        if (contactTC != null) {
            contactTC.setCellValueFactory(new PropertyValueFactory<>("contactName"));
        }
        if (numTC != null) {
            numTC.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        }
        if (addressTC != null) {
            addressTC.setCellValueFactory(new PropertyValueFactory<>("deliveryAddress"));
        }
    }

    @FXML
    public void signoutOA(ActionEvent event) {

    }
}
package net.saga.tightirc.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import net.saga.tightirc.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInServiceListController implements Initializable {

    @FXML
    private Node addButton;

    @FXML
    private VBox serverIconList;
    private Main mainApp;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addButton.setOnMouseClicked((event) -> showAddDialog());
    }

    private void showAddDialog() {

    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}

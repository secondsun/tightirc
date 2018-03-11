package net.saga.tightirc.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import net.saga.tightirc.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {

    @FXML
    private HBox root;
    private Main mainApp;

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}

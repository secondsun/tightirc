package net.saga.tightirc.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import net.saga.tightirc.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class ButtonController implements Initializable {

    @FXML
    private VBox serverIconList;
    private Main mainApp;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}

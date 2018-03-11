package net.saga.tightirc.controller;

import com.jfoenix.controls.JFXDialog;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.saga.tightirc.Main;

import java.io.IOException;
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
        final FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AddServerDialogView.fxml"));

        final Parent root;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final Scene scene = new Scene(root, 250, 150);
        Stage stage = new Stage();
        stage.initModality(Modality.NONE);
        stage.initOwner(mainApp.getWindow());
        stage.setScene(scene);
        stage.show();
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}

package net.saga.tightirc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class Main extends Application {


    public static void main (String... args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ButtonList.fxml"));

        Scene scene = new Scene(root, 300, 275);
        scene.getStylesheets().addAll("/css/style.css");
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }
}

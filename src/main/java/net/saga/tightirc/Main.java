package net.saga.tightirc;

import de.jensd.fx.glyphs.GlyphIconUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import net.saga.tightirc.controller.ButtonController;
import net.saga.tightirc.controller.MainController;

import java.io.IOException;

public class Main extends Application {

    public final static String TTF_PATH = "/de/jensd/fx/glyphs/fontawesome/fontawesome-webfont.ttf";

    static {
        try {
            Font.loadFont(Main.class.getResource(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    private MainController mainController;
    private ButtonController buttonController;
    private Stage primaryStage;
    public static void main (String... args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        this.primaryStage = stage;
        this.primaryStage.setTitle("TightIRC");
        this.primaryStage.setMinHeight(420d);
        loadRootPane();
        loadServerList();
    }

    private void loadServerList() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ButtonList.fxml"));

        Parent root = loader.load();

        this.buttonController = loader.getController();
        buttonController.setMainApp(this);

        AnchorPane serverListPane = (AnchorPane) primaryStage.getScene().lookup("#serverList");
        primaryStage.getScene().getStylesheets().addAll(root.getStylesheets());
        serverListPane.getChildren().addAll(root);
        AnchorPane.setTopAnchor(root, 0d);
        AnchorPane.setLeftAnchor(root, 0d);
        AnchorPane.setRightAnchor(root, 0d);
        AnchorPane.setBottomAnchor(root, 0d);

    }

    private void loadRootPane() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));

        HBox root = loader.load();

        Scene scene = new Scene(root, 300, 275);
        scene.getStylesheets().addAll("/css/style.css");

        this.mainController = loader.getController();
        mainController.setMainApp(this);

        this.primaryStage.setScene(scene);
        primaryStage.show();

    }
}

package app;

import app.view.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIApplication extends Application{
    // This loads the TitleWindow controller with TitleWindow.fxml and creates an initial title window

    @Override
    public void start(Stage stage) throws Exception {

        var resource = getClass().getResource("MotorController.fxml");
        var loader = new FXMLLoader(resource);
        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("Motor Controller"); // Title of main window
        stage.show();

		MainWindow mainWindow = loader.getController();
        mainWindow.initialize();
    }
}

package nl.arvici.client.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import nl.arvici.client.util.AbstractServiceFacade;

import java.io.IOException;

public class ControllerService extends AbstractServiceFacade {

    private MainWindow mainWindow;

    public ControllerService() {
        this.mainWindow = new MainWindow();
    }

    /**
     * Start JavaFX Application.
     * @param args
     */
    public void startApplication (String[] args) {
        this.mainWindow.startApplication(args);
    }

    public void startProductStage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream("/productOverview.fxml"));
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.DECORATED);
        stage.setScene(new Scene(root));
        stage.show();
    }
}

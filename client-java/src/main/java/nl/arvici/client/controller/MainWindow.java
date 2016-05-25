package nl.arvici.client.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import nl.arvici.client.ServiceProvider;

import java.util.Optional;

public class MainWindow extends Application {
    private static MainWindow instance;

    @FXML private TextField loginUsername;
    @FXML private PasswordField loginPassword;
    @FXML private Button loginButton;
    @FXML private Button registerButton;
    @FXML private TextField registerPassword;
    @FXML private TextField registerUsername;
    @FXML private TextField registerFirstname;
    @FXML private TextField registerLastname;
    @FXML private TextArea registerOutput;

    private Parent content;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        instance = this;

        FXMLLoader loader = new FXMLLoader();

        try {
            this.content = loader.load(getClass().getResourceAsStream("/mainWindow.fxml"));
            instance = loader.getController();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        try {
            //ServiceProvider.getInstance().getWebserviceService().getClient().get("test", Product.class);
        }catch (Exception e) {
            e.printStackTrace();
        }

        primaryStage.setResizable(false);
        primaryStage.setTitle("AH Shop");

        // Make main scene
        Scene scene = new Scene(this.content);

        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);

        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            // Don't allow closing it when not in other stage.

            // Ask for exit
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit application");
            alert.setContentText("Are you sure to exit the application?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.CANCEL) {
                event.consume();
                return;
            }

            // Close all threads.
            ServiceProvider.getInstance().willExitApplication();

            // Close Unirest threads.
            // try {Unirest.shutdown();}catch(Exception e) {e.printStackTrace();}

            // Force exit for all threads.
            System.exit(0);
        });

        // Start second start sequence
        // ServiceProvider.getInstance().startSecondWave();
    }

    /**
     * Start JavaFX Application.
     * @param args
     */
    public void startApplication(String[] args) {
        launch(args);
    }

    @FXML private void onLogin(ActionEvent actionEvent) throws Exception {
        if (this.loginUsername.getText().isEmpty() || this.loginPassword.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Empty fields");
            alert.setHeaderText(null);
            alert.setContentText("Fill in the required fields!");
            alert.showAndWait();
            return;
        }
        /*
        Object user = ServiceProvider.getInstance().getWebserviceService().getUserProvider().loginUser(
                this.loginUsername.getText(), this.loginPassword.getText()
        );

        if (user instanceof String) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText("Login failed, error message:");
            alert.setContentText((String)user);
            alert.showAndWait();
            return;
        }
        if (user instanceof User) {
            // Login Successfully
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Done");
            alert.setHeaderText("Login successfully");
            alert.setContentText("Welcome back " + ((User) user).getFirstname());
            alert.showAndWait();

            ServiceProvider.getInstance().getWebserviceService().setAuthenticatedUser((User)user);
            ServiceProvider.getInstance().getControllerService().startProductStage();
        }*/
    }

    @FXML private void onRegister(ActionEvent actionEvent) {
        /*
        if (this.registerUsername.getText().isEmpty() || this.registerFirstname.getText().isEmpty()
                || this.registerLastname.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Empty fields");
            alert.setHeaderText(null);
            alert.setContentText("Fill in the required fields!");
            alert.showAndWait();
            return;
        }

        User user = ServiceProvider.getInstance().getWebserviceService().getUserProvider().registerUser(
                this.registerUsername.getText(), this.registerFirstname.getText(), this.registerLastname.getText());

        if (user != null) {
            this.registerOutput.setText("Register completed, your password: " + user.getPassword());
        }
        */
    }
}

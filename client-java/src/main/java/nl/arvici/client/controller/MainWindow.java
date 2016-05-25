package nl.arvici.client.controller;

import com.microsoft.schemas._2003._10.serialization.ObjectFactory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import nl.arvici.client.ServiceProvider;
import org.datacontract.schemas._2004._07.server.CreateUserData;
import org.datacontract.schemas._2004._07.server.LoginUserData;
import org.datacontract.schemas._2004._07.server.ServiceResponseOfUserUEsMBek5;

import javax.xml.bind.JAXBElement;
import java.util.Optional;

public class MainWindow extends Application {
    private static MainWindow instance;
    private static ObjectFactory factory = new ObjectFactory();

    @FXML private TextField loginUsername;
    @FXML private PasswordField loginPassword;
    @FXML private Button loginButton;
    @FXML private Button registerButton;
    @FXML private TextField registerPassword;
    @FXML private TextField registerUsername;
    @FXML private TextField registerName;
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
            if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                event.consume();
                return;
            }

            // Close all threads.
            ServiceProvider.getInstance().willExitApplication();

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

        LoginUserData request = new LoginUserData();
        request.setUsername(ServiceProvider.getDataFactory().createLoginUserDataUsername(this.loginUsername.getText()));
        request.setPassword(ServiceProvider.getDataFactory().createLoginUserDataPassword(this.loginPassword.getText()));

        ServiceResponseOfUserUEsMBek5 response = ServiceProvider.getInstance().getShopProxy().loginUser(request);

        if (! response.getMeta().getValue().isSuccess()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText("Login failed, error message:");
            alert.setContentText(response.getMeta().getValue().getMessage().getValue());
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login Done");
        alert.setHeaderText("Login successfully");
        alert.setContentText("Welcome back " + response.getData().getValue().getName().getValue());
        alert.showAndWait();

        ServiceProvider.getInstance().setActiveUser(response.getData().getValue());
        ServiceProvider.getInstance().getControllerService().startProductStage();
    }

    @FXML private void onRegister(ActionEvent actionEvent) {
        this.registerOutput.setText("");

        if (this.registerUsername.getText().isEmpty() || this.registerName.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Empty fields");
            alert.setHeaderText(null);
            alert.setContentText("Fill in the required fields!");
            alert.showAndWait();
            return;
        }

        CreateUserData request = new CreateUserData();
        request.setName(ServiceProvider.getDataFactory().createCreateUserDataName(this.registerName.getText()));
        request.setUsername(ServiceProvider.getDataFactory().createCreateUserDataUsername(this.registerUsername.getText()));

        ServiceResponseOfUserUEsMBek5 response = ServiceProvider.getInstance().getShopProxy().createUser(request);

        if (! response.getMeta().getValue().isSuccess()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Account Register Failed");
            alert.setHeaderText("Register failed, error message:");
            alert.setContentText(response.getMeta().getValue().getMessage().getValue());
            alert.showAndWait();
            return;
        }

        this.registerOutput.setText("Register completed\nPassword: " + response.getData().getValue().getPassword().getValue());
    }
}

package nl.arvici.client.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ProductOverview implements Initializable {

    //private List<Product>   productList;
    //private List<Purchased> inventoryList;

    @FXML private ListView inventory;
    @FXML private ListView shop;
    @FXML private Button buyButton;
    @FXML private Button refreshButton;
    @FXML private Label balanceLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            this.reloadViews();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML private void onBuy(ActionEvent actionEvent) throws Exception {
        if (this.shop.getSelectionModel().getSelectedItem() == null) {
            return;
        }
        /*
        Product product = (Product)this.shop.getSelectionModel().getSelectedItem();

        String status = ServiceProvider.getInstance().getWebserviceService().getProductProvider().buyProduct(product);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Purchase from shop");
        alert.setHeaderText("Purchase status");
        alert.setContentText(status);
        alert.showAndWait();

        if (status.startsWith("You bought")) {
            double balance = ServiceProvider.getInstance().getWebserviceService().getAuthenticatedUser().getBalance();
            ServiceProvider.getInstance().getWebserviceService().getAuthenticatedUser().setBalance(balance - product.getPrice());
        }
*/
        this.reloadViews();
    }

    @FXML private void onRefresh(ActionEvent actionEvent) throws Exception {
        this.reloadViews();
    }

    private void reloadViews() throws Exception {
        /*
        this.productList = ServiceProvider.getInstance().getWebserviceService().getProductProvider().getAll();
        this.inventoryList = ServiceProvider.getInstance().getWebserviceService().getProductProvider().getInventory();
        this.shop.setItems(FXCollections.observableList(this.productList));
        this.inventory.setItems(FXCollections.observableList(this.inventoryList));

        this.balanceLabel.setText("" +
                String.format("%.2f", ServiceProvider.getInstance().getWebserviceService().getAuthenticatedUser().getBalance()));
                */
    }
}

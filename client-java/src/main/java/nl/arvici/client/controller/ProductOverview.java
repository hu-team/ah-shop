package nl.arvici.client.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import nl.arvici.client.ServiceProvider;
import org.datacontract.schemas._2004._07.server.*;

import java.math.BigDecimal;
import java.net.URL;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProductOverview implements Initializable {

    private List<Product>   productList;
    private List<Purchase>  inventoryList;
    private User            user;

    @FXML private ListView<Purchase> inventory;
    @FXML private ListView<Product> shop;
    @FXML private Button buyButton;
    @FXML private Button refreshButton;
    @FXML private Label balanceLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            this.reloadData();
            this.reloadViews();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML private void onBuy(ActionEvent actionEvent) throws Exception {
        if (this.shop.getSelectionModel().getSelectedItem() == null) {
            return;
        }

        Product product = this.shop.getSelectionModel().getSelectedItem();

        PurchaseProductData request = new PurchaseProductData();
        request.setUserID(this.user.getUserid());
        request.setProductID(product.getProductid());

        ServiceResponseOfPurchaseUEsMBek5 response = ServiceProvider.getInstance().getShopProxy().purchaseProduct(request);

        if (! response.getMeta().getValue().isSuccess()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Purchase from shop");
            alert.setHeaderText("Purchase failed! Message:");
            alert.setContentText(response.getMeta().getValue().getMessage().getValue());
            alert.showAndWait();
            this.reloadData();
            this.reloadViews();
            return;
        }

        this.reloadData();
        this.reloadViews();
    }

    @FXML private void onRefresh(ActionEvent actionEvent) throws Exception {
        this.reloadData();
        this.reloadViews();
    }

    private void reloadData() throws Exception {
        UserDetailsData detailsRequest = new UserDetailsData();
        detailsRequest.setUserID(ServiceProvider.getInstance().getActiveUser().getUserid());

        HistoryListData historyRequest = new HistoryListData();
        historyRequest.setUserID(ServiceProvider.getInstance().getActiveUser().getUserid());

        this.user = ServiceProvider.getInstance().getShopProxy().userDetails(detailsRequest).getData().getValue();
        this.productList = ServiceProvider.getInstance().getShopProxy().productList().getData().getValue().getProduct();
        this.inventoryList = ServiceProvider.getInstance().getShopProxy().historyList(historyRequest).getData().getValue().getPurchase();

    }

    private void reloadViews() throws Exception {
        this.balanceLabel.setText(""
                + NumberFormat.getCurrencyInstance(Locale.ITALY).format(this.user.getBalance()));

        this.shop.setItems(FXCollections.observableList(this.productList));
        this.inventory.setItems(FXCollections.observableList(this.inventoryList));
    }
}

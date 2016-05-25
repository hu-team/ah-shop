package nl.arvici.client;

import javafx.application.Platform;
import nl.arvici.ahshop.wsinterface.IShopService;
import nl.arvici.ahshop.wsinterface.ShopService;
import nl.arvici.client.controller.ControllerService;
import nl.arvici.client.util.ExceptionAlert;

public class ServiceProvider {
    /**
     * Singleton
     */
    private static ServiceProvider instance = new ServiceProvider();
    public static ServiceProvider getInstance() {
        return instance;
    }

    private ControllerService controllerService;
    private ShopService shopService;
    private IShopService shopProxy;

    private ServiceProvider() {
        // Init all sub-services.
        this.controllerService = new ControllerService();

        this.shopService = new ShopService();
        this.shopProxy = this.shopService.getBasicHttpBindingIShopService();
    }

    public ControllerService getControllerService() { return controllerService; }
    public IShopService getShopProxy() { return shopProxy; }
    public ShopService getShopService() { return shopService; }

    public void executeStart(String[] args) {
        // Catch all exceptions
        Thread.setDefaultUncaughtExceptionHandler((thread, exception) -> {
            if (Launcher.DEBUG) {
                exception.printStackTrace();
            }

            if (exception instanceof Exception && Launcher.DEBUG) {
                Platform.runLater(() -> {
                    ExceptionAlert alert = new ExceptionAlert((Exception)exception);
                    alert.showAndWait();
                });
            }
        });

        this.controllerService.startApplication(args);
    }

    public void willExitApplication() {

    }
}

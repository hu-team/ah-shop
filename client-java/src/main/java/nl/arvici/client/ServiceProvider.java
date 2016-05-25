package nl.arvici.client;

import com.microsoft.schemas._2003._10.serialization.ObjectFactory;
import javafx.application.Platform;
import nl.arvici.ahshop.wsinterface.IShopService;
import nl.arvici.ahshop.wsinterface.ShopService;
import nl.arvici.client.controller.ControllerService;
import nl.arvici.client.util.ExceptionAlert;
import org.datacontract.schemas._2004._07.server.User;

public class ServiceProvider {
    /**
     * Singleton
     */
    private static ServiceProvider instance = new ServiceProvider();

    private static nl.arvici.ahshop.wsinterface.ObjectFactory modelFactory = new nl.arvici.ahshop.wsinterface.ObjectFactory();
    private static org.datacontract.schemas._2004._07.server.ObjectFactory dataFactory = new org.datacontract.schemas._2004._07.server.ObjectFactory();
    private static ObjectFactory simpleFactory = new ObjectFactory();

    public static ServiceProvider getInstance() {
        return instance;
    }

    public static nl.arvici.ahshop.wsinterface.ObjectFactory getModelFactory() { return modelFactory; }
    public static org.datacontract.schemas._2004._07.server.ObjectFactory getDataFactory() { return dataFactory; }
    public static ObjectFactory getSimpleFactory() { return simpleFactory; }

    private User activeUser;



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

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public User getActiveUser() {
        return activeUser;
    }
}

package nl.arvici.client;

import nl.arvici.ahshop.wsinterface.ShopService;
import nl.arvici.ahshop.wsinterface.WsInterface;

import javax.xml.ws.Holder;

public class ClientMain {
    public static void main (String[] args) throws Exception {
        new ClientMain();
    }

    public ClientMain () throws Exception {
        ShopService service = new ShopService();
        WsInterface wsInterface = service.getWSPort();

        wsInterface.createUser(new Holder<String>("test"), new Holder<String>("tom"), null, null);
    }
}

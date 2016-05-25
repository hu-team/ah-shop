package nl.arvici.client;

/**
 * Launcher Main Class.
 */
public class Launcher {
    public static final boolean DEBUG = true;

    /**
     * Main
     * @param args arguments.
     */
    public static void main (String[] args) {
        ServiceProvider.getInstance().executeStart(args);
    }
}

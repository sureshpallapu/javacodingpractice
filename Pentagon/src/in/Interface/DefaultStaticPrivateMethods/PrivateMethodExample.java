package in.Interface.DefaultStaticPrivateMethods;

interface Logger {
    private void log(String message) {  // Private method
        System.err.println("LOG: " + message);
    }

    default void logInfo(String info) {
        log("INFO: " + info);
    }

    default void logError(String error) {
        log("ERROR: " + error);
    }
}

class AppLogger implements Logger {
    void run() {
        logInfo("Application started");
        logError("Something went wrong!");
    }
}

public class PrivateMethodExample {
    public static void main(String[] args) {
        AppLogger logger = new AppLogger();
        logger.run();
    }
}

package exercise01.singleton;

public class Logger {

	private static Logger instance = new Logger();

    // Private constructor
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Method to get the single instance
    public static Logger getInstance() {
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

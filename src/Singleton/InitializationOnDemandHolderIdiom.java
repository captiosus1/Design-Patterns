package singleton;

/**
 * Singleton implementation using Initialization-on-Demand Holder Idiom.
 * This approach leverages the Java class loader mechanism to ensure that the singleton
 * instance is created only when it is needed, making it thread-safe and efficient.
 */
public class InitializationOnDemandHolderIdiom {

    // Private constructor prevents instantiation from outside the class
    private InitializationOnDemandHolderIdiom() {
        System.out.println("Singleton Instance Initialization On-Demand Holder Idiom created");
    }

    /**
     * Provides a global access point to retrieve the singleton instance.
     * The instance is created only when this method is called for the first time.
     *
     * @return The singleton instance of InitializationOnDemandHolderIdiom.
     */
    public static InitializationOnDemandHolderIdiom getInstance() {
        return Helper.instance; // Access the singleton instance created by the Helper class
    }

    /**
     * Helper static inner class that holds the singleton instance.
     * This class is only loaded when the getInstance() method is called, creating
     * the singleton instance in a thread-safe manner without synchronization.
     */
    private static class Helper {
        // Static final instance, created when Helper class is loaded
        private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
    }
}

package singleton;

/**
 * Singleton implementation using the eager initialization (Ivory Tower) approach.
 * This class provides a single, globally accessible instance that is created
 * as soon as the class is loaded. It is thread-safe due to the static
 * initializer.
 */
public final class IvoryTower {

    // Private constructor to prevent instantiation from outside the class
    private IvoryTower() {
        System.out.println("Singleton class implementation using Ivory Tower (eager initialization)");
    }

    // Eagerly created singleton instance, initialized when the class is loaded
    private static final IvoryTower instance = new IvoryTower();

    /**
     * Provides a global access point to retrieve the singleton instance.
     * This instance is created eagerly when the class is loaded, making
     * it inherently thread-safe without needing synchronization.
     *
     * @return The singleton instance of IvoryTower.
     */
    public static IvoryTower getInstance() {
        return instance; // Return the eagerly initialized singleton instance
    }
}

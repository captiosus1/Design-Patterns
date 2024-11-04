package singleton;

/**
 * A thread-safe, lazy-loaded singleton implementation using the Ivory Tower approach.
 * This class ensures that only one instance of ThreadSafeLazyLoadedIvoryTower is created,
 * and it is only created when first accessed, making it both memory efficient and thread-safe.
 */
public class ThreadSafeLazyLoadedIvoryTower {

    // Static variable to hold the single instance of the class
    private static ThreadSafeLazyLoadedIvoryTower instance;

    // Example instance variable to demonstrate data handling within the singleton
    private int data;

    /**
     * Private constructor to initialize the singleton with the provided data.
     * This constructor is only called once to create the singleton instance.
     *
     * @param data An integer representing data associated with the singleton instance
     */
    private ThreadSafeLazyLoadedIvoryTower(int data) {
        this.data = data;
        System.out.println("Singleton class (thread-safe, lazy-loaded, Ivory Tower) initialized with data: " + data);
    }

    /**
     * Provides a global access point to retrieve the singleton instance.
     * If the instance does not exist, it initializes it with the specified data.
     * This method is synchronized to ensure thread-safe initialization.
     *
     * @param data The integer data to initialize the singleton instance if it is not yet created
     * @return The singleton instance of ThreadSafeLazyLoadedIvoryTower
     */
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance(int data) {
        // Check if instance is null, to initialize the singleton only once
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower(data);
        }

        // Return the singleton instance
        return instance;
    }
}

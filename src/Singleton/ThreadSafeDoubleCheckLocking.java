package singleton;

/**
 * A thread-safe singleton implementation using double-checked locking.
 * This class provides a single, global access point to an instance
 * that is initialized lazily and ensures efficient, thread-safe access.
 */
public class ThreadSafeDoubleCheckLocking {

    // Volatile variable to ensure changes to 'instance' are visible across threads
    private static volatile ThreadSafeDoubleCheckLocking instance;

    // Data field to hold instance-specific data
    private int data;

    /**
     * Private constructor to prevent instantiation from outside the class.
     * Initializes the 'data' field with the provided value.
     *
     * @param data Value to initialize the Singleton's data field.
     */
    private ThreadSafeDoubleCheckLocking(int data) {
        this.data = data;
        System.out.println("Singleton Instance (Thread-Safe Double-Check Locking) initialized with data: " + data);
    }

    /**
     * Provides a global access point to retrieve the singleton instance.
     * Uses lazy initialization with double-checked locking to ensure thread safety
     * and to avoid unnecessary synchronization after the instance is initialized.
     *
     * @param data Value used to initialize the instance if it doesn't already exist.
     * @return The singleton instance of ThreadSafeDoubleCheckLocking.
     */
    public static ThreadSafeDoubleCheckLocking getInstance(int data) {
        // First check (without synchronization) for performance optimization
        if (instance == null) {
            // Synchronize only if 'instance' is null, to ensure thread safety during initialization
            synchronized (ThreadSafeDoubleCheckLocking.class) {
                // Second check (inside synchronized block) to ensure only one instance is created
                if (instance == null) {
                    instance = new ThreadSafeDoubleCheckLocking(data); // Initialize the singleton instance
                }
            }
        }
        return instance; // Return the singleton instance (either newly created or existing)
    }
}

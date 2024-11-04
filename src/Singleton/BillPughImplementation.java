package singleton;

public final class BillPughImplementation {

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private BillPughImplementation() {
        // private constructor
    }

    /**
     * The InstanceHolder is a static inner class, and it holds the Singleton instance.
     * It is not loaded into memory until the getInstance() method is called.
     */
    private static class InstanceHolder {
        /**
         * Singleton instance of the class.
         */
        private static BillPughImplementation instance = new BillPughImplementation();
    }

    /**
     * Public accessor for the singleton instance.
     * When this method is called, the InstanceHolder is loaded into memory
     * and creates the Singleton instance. This method provides a global access point
     * for the singleton instance.
     * @return an instance of the class.
     */
    // global access point
    public static BillPughImplementation getInstance() {
        return InstanceHolder.instance;
    }
}
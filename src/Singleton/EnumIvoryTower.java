package singleton;

/**
 * Singleton implementation using Enum.
 * This approach is the most straightforward and recommended way to implement a singleton in Java,
 * as it is thread-safe, supports serialization, and prevents creating additional instances even with reflection.
 */
public enum EnumIvoryTower {
    // Single instance of EnumIvoryTower
    INSTANCE;

    /**
     * Overrides the default toString method to provide a more detailed description of the instance.
     *
     * @return A string representing the fully qualified class name and the unique hash code of the instance.
     */
    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}

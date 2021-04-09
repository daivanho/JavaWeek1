package Assignment1;

/**
 * Assignment 1 Double checked singleton so that methods dont hang waiting for singleton
 *
 * @author Dai
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance = null;

    /**
     * Singleton
     */
    private DoubleCheckSingleton() {
    }

    /**
     * Double check instance singleton
     *
     * @return instance of DoubleCheckSingleton
     */
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

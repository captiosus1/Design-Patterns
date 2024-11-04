package singleton;

public class Main {
    public static void main(String[] args) {
//        ThreadSafeDoubleCheckLocking instance = ThreadSafeDoubleCheckLocking.getInstance(5);
//        ThreadSafeLazyLoadedIvoryTower instance = ThreadSafeLazyLoadedIvoryTower.getInstance(10);
//        IvoryTower instance = IvoryTower.getInstance();
        InitializationOnDemandHolderIdiom ins = InitializationOnDemandHolderIdiom.getInstance();

    }
}

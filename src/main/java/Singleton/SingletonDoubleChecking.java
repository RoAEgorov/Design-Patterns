package Singleton;

public class SingletonDoubleChecking {

    private static volatile SingletonDoubleChecking instance;

    private SingletonDoubleChecking() {
    }

    public static SingletonDoubleChecking getInstance() {
        SingletonDoubleChecking localInstance = instance;

        if (localInstance == null) {
            synchronized (SingletonDoubleChecking.class) {
                localInstance = instance;
                if (localInstance == null) {
                    localInstance = instance = new SingletonDoubleChecking();
                }
            }
        }

        return localInstance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

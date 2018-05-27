package Singleton;

public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }
}

package Singleton;

public class Main {
    public static void main(String[] args) {
        {
            // Singleton Holder
            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();

            System.out.println(singleton1.hashCode());
            System.out.println(singleton2.hashCode());

            System.out.println(singleton1.equals(singleton2));
        }

        {
            // Singleton DoubleChecking
            SingletonDoubleChecking singleton1 = SingletonDoubleChecking.getInstance();
            SingletonDoubleChecking singleton2 = SingletonDoubleChecking.getInstance();

            System.out.println(singleton1.hashCode());
            System.out.println(singleton2.hashCode());

            System.out.println(singleton1.equals(singleton2));
        }
    }
}

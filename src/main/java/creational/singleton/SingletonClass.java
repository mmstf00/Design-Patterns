package creational.singleton;

/**
 * <ul>
 *     <li>
 *         Singleton pattern restricts the instantiation of a class and ensures that only
 *         one instance of the class exists in the Java Virtual Machine.
 *     </li>
 *     <li>
 *         The singleton class must provide a global access point to get the instance of the class.
 *     </li>
 *     <li>
 *         Singleton pattern is used for logging, drivers objects, caching, and thread pool.
 *     </li>
 *     <li>
 *         Singleton design pattern is also used in other design patterns like
 *         Abstract Factory, Builder, Prototype, Facade, etc.
 *     </li>
 * </ul>
 */
public class SingletonClass {

    private static SingletonClass instance;
    private final String value;

    // The private constructor ensures that only single instance will be created.
    // It doesn't allow the user to create a new instance by using constructor.
    private SingletonClass(String value) {
        this.value = value;
    }

    public static SingletonClass getInstance(String value) {
        if (instance == null) {
            instance = new SingletonClass(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}

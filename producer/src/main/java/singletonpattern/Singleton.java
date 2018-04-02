package singletonpattern;

/**
 * @author long
 * @Description
 * @date 2018-04-02 10:25
 */
public class Singleton {

    private static Singleton instance = null;

    private static volatile Singleton  singleton = null;

    private Singleton() {
    }

    /**
     * 线程不安全
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static synchronized Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getSingleTon2() {
        if (singleton == null) {
            synchronized (singleton) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private static class SingletonFactory{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getinstance3() {
        return SingletonFactory.singleton;
    }

    public enum SingletonEnum {
        INSTANCE;

        private Singleton instance;

        SingletonEnum() {
            instance = new Singleton();
        }

        public Singleton getInstance() {
            return instance;
        }
    }

}

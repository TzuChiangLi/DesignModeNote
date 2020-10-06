package singleton;

/**
 * 单例模式
 */
public class Singleton {
    //单例模式的核心是构造函数的私有化
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }
}

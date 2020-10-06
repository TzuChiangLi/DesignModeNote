package observer;

/**
 * 行为型设计模式：观察者
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}

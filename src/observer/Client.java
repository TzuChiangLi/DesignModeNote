package observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject(); //实例化被观察的对象
        new BinaryObserver(subject);     //创建观察者对象
        new OctalObserver(subject);

        subject.setState(12);           //更改状态，会调用notifyAllObserver方法通知所有的观察者
    }
}

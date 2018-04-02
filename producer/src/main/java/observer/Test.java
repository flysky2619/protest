package observer;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:33
 */
public class Test {
    public static void main(String[] args) {
        Notifier notifier = new SecretaryNotifier();
        Observer observer1 = new Observer1("sb1");
        Observer observer2 = new Observer2("sb2");

        notifier.attach(observer1);
        notifier.attach(observer2);
        notifier.notifyObservers();
        notifier.detach(observer1);
        notifier.detach(observer2);
    }
}

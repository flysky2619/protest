package observer;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:26
 */
public abstract class Notifier {

    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract void notifyObservers();
}

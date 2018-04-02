package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:28
 */
public class SecretaryNotifier extends Notifier {

    private List<Observer> observers = new ArrayList<Observer>();


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(observer -> {
            System.out.println("秘书说:");
            observer.update();
        });
    }
}

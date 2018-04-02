package observer;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:27
 */
public abstract class Observer {

    protected String name;
    public abstract void update();
    public Observer(String name) {
        this.name = name;
    }
}

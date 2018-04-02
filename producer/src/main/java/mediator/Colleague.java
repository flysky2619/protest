package mediator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:45
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void getMessage(String message);


    public abstract void contact(String message);
}

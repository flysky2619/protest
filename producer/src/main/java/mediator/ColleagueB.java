package mediator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 16:12
 */
public class ColleagueB extends Colleague {

    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("同事B获得信息"+message);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message, this);
    }

}

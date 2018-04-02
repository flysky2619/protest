package mediator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 16:11
 */
public class ColleagueA extends Colleague {

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("同事A获得信息"+message);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message, this);
    }
}

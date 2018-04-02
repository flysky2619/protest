package mediator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 16:18
 */
public class Test {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagueA colleague = new ColleagueA(mediator);
        ColleagueB colleague1 = new ColleagueB(mediator);

        mediator.setColleagueA(colleague);
        mediator.setColleagueB(colleague1);

        colleague.contact("我是A，我要和同事B说说工作的事情");
        colleague1.contact("我是B,我下午有时间,下午商量吧");
    }
}

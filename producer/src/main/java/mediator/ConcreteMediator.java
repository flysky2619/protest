package mediator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 16:11
 */
public class ConcreteMediator extends Mediator {

    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }


    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void contact(String content, Colleague coll) {
        if (coll == colleagueA) {
            colleagueB.getMessage(content);
        } else {
            colleagueA.getMessage(content);
        }

    }
}

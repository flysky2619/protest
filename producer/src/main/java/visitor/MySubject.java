package visitor;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:22
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}

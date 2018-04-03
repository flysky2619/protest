package visitor;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:36
 */
public class Test {

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();

        Subject subject = new MySubject();

        visitor.visite(subject);

        subject.accept(visitor);
    }
}

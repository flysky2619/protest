package visitor;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:22
 */
public class MyVisitor implements Visitor {

    @Override
    public void visite(Subject subject) {
        System.out.println(subject.getSubject());
    }
}

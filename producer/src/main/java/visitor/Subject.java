package visitor;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:21
 */
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();
}

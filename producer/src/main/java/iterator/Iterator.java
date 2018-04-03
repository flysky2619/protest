package iterator;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:57
 */
public interface Iterator<E> {

    E previous();

    E next();

    boolean hasNext();

    E first();
}

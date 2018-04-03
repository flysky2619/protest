package iterator;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:57
 */
public interface Collection<E> {

    Iterator<E> iterator();

    int size();

    E get(int i);
}

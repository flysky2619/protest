package iterator;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:01
 */
public class MyCollection<E> implements Collection {

    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public int size() {
        return string.length;
    }

    @Override
    public E get(int i) {
        return (E) string[i];
    }
}

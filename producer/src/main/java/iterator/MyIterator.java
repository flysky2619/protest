package iterator;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:02
 */
public class MyIterator<E> implements Iterator {

    private Collection collection;

    private int pos = -1;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public E previous() {
        if (pos > 0) {
            pos--;
        }
        return (E) collection.get(pos);
    }

    @Override
    public E next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return (E) collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E first() {
        pos = 0;
        return (E) collection.get(pos);
    }
}

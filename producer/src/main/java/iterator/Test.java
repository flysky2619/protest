package iterator;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:09
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection();

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

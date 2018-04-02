package adapter;

/**
 * @author long
 * @Description
 * @date 2018-04-02 14:28
 */
public class Adapter_Person extends Person implements Target_Person {
    @Override
    public void sayFrench() {
        System.out.println("Person can say French!");
    }

    @Override
    public void sayJapanese() {
        System.out.println("Person can say Japanese!");
    }
}

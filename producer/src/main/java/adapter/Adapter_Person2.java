package adapter;

/**
 * @author long
 * @Description
 * @date 2018-04-02 14:28
 */
public class Adapter_Person2 implements Target_Person {

    private Person person;

    public Adapter_Person2(Person person) {
        this.person = person;
    }

    @Override
    public void sayEnglish() {
        person.sayEnglish();
    }

    @Override
    public void sayFrench() {
        System.out.println("Person can say French!");
    }

    @Override
    public void sayJapanese() {
        System.out.println("Person can say Japanese!");
    }
}

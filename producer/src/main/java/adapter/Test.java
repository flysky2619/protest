package adapter;

/**
 * @author long
 * @Description
 * @date 2018-04-02 14:35
 */
public class Test {

    public static void main(String[] args) {
        Target_Person target_person = new Adapter_Person();

        target_person.sayEnglish();
        target_person.sayFrench();
        target_person.sayJapanese();
    }
}

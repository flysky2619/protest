package flyweight;

/**
 * @author long
 * @Description
 * @date 2018-04-03 17:15
 */
public class Teacher extends Person {

    private int number;

    public Teacher() {
        super();
    }

    public Teacher(int age, int sex, String name, int number) {
        super(age, sex, name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

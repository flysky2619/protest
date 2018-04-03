package flyweight;

/**
 * @author long
 * @Description
 * @date 2018-04-03 17:14
 */
public class Person {

    private int age;

    private int sex;

    private String name;

    public Person(int age, int sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package prototypepattern;

import java.io.Serializable;

/**
 * @author long
 * @Description
 * @date 2018-04-02 14:05
 */
public class Professor implements Serializable {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Professor [name=" + name + ", age=" + age + "]";
    }
}

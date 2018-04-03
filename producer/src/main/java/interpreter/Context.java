package interpreter;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:17
 */
public class Context {

    private int age;

    private String name;

    private String sss;

    public Context(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSss() {
        return sss;
    }

    public void setSss(String sss) {
        this.sss = sss;
    }
}

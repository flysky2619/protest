package memento;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:27
 */
public class Memento {

    private String values;

    public Memento(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}

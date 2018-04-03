package command;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:44
 */
public class Invoker {

    private Commond commond;

    public Invoker(Commond commond) {
        this.commond = commond;
    }

    public void sendCommond() {
        commond.exec();
    }
}

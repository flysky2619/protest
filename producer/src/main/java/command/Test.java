package command;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:48
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Commond commond = new MyCommond(receiver);
        Invoker invoker = new Invoker(commond);
        invoker.sendCommond();
    }
}

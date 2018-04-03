package command;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:46
 */
public class MyCommond implements Commond {

    private Receiver receiver;

    public MyCommond(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.doAction();
    }
}

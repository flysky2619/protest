package factorypattern;

/**
 * @author long
 * @Description
 * @date 2018-04-02 10:22
 */
public class SmsSenderFactory implements SenderProvider {

    @Override
    public Sender producer() {
        return new SmsSender();
    }
}

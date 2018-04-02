package factorypattern;

/**
 * @author long
 * @Description
 * @date 2018-04-02 10:22
 */
public class EmailSenderFactory implements SenderProvider {

    @Override
    public Sender producer() {
        return new EmailSender();
    }
}

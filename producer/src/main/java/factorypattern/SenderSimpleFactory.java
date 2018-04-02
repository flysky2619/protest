package factorypattern;

/**
 * @author long
 * @Description
 * @date 2018-04-02 10:10
 *
 * 通过传入的参数类型来实例化相应的对象
 */
public class SenderSimpleFactory {

    public Sender getInstance(String type) {
        if (type.equals("sms")) {
            return new SmsSender();
        } else {
            return new EmailSender();
        }
    }
}

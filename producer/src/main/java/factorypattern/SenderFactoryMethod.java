package factorypattern;

/**
 * @author long
 * @Description
 * @date 2018-04-02 10:13
 * <p>
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 */
public class SenderFactoryMethod {

    public Sender smsSender() {
        return new SmsSender();
    }

    public Sender emailSender() {
        return new EmailSender();
    }


    /**
     * 静态工厂模式
     */
    public static Sender smsSender2() {
        return new SmsSender();
    }

    public static Sender emailSender2() {
        return new EmailSender();
    }
}

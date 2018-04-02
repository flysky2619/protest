package factorypattern;

/**
 * @author long
 * @Description
 * @date 2018-03-28 16:45
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("短信发送接口实现类");

    }


}

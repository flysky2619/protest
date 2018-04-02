package factorypattern;

/**
 * @author long
 * @Description
 * @date 2018-03-28 12:00
 */
@FunctionalInterface
public interface Sender {

    void send();

    default void defaultSend(String mobile, String content) {
        System.out.println("接口默认方法");
        System.out.println(mobile + content);
    }

    static void staticSend() {
        System.out.println("静态测试方法");
    }

    default void defaultContract() {

    }
}

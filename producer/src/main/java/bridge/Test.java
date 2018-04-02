package bridge;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:04
 */
public class Test {

    public static void main(String[] args) {
        Brand1 brand1 = new Brand1(new Phone2G());
        brand1.run();
    }
}
